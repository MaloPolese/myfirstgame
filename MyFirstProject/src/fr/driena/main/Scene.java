package fr.driena.main;

import java.util.ArrayList;
import java.util.Scanner;

import fr.driena.characters.Hero;

public class Scene {

	private ArrayList<Hero> heros;
	private Hero hero;
	private int nbHero;

	public Scene() {

		this.heros = new ArrayList<Hero>();
		this.nbHero = saisie("Nombre de Hero ?");

		this.hero = new Hero(heros);
		hero.createHeros(nbHero);
		
		showHeroStats();
		
		heros.get(0).spellTest(null, 0);
	}
	
	public int saisie(String str){
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
		return sc.nextInt();
	}
	
	public void showHeroStats(){
		for(Hero hero : heros){
			hero.getStats();
		}
		
	}
}
