package main;

import java.util.ArrayList;
import java.util.Scanner;

import Characters.Chasseur;
import Characters.Guerrier;
import Characters.Hero;
import Characters.Personnage;
import Characters.Pretre;
import Characters.Sorcier;
import Characters.Voleur;

public class principal {
	
	private static ArrayList<Hero> heros;
	
	public static void getClass(String hero_class, String hero_name) {
		
		if(hero_class.equals("Guerrier")){
			 heros.add(new Guerrier(hero_name));
		}
		if(hero_class.equals("Pretre")){
			 heros.add(new Pretre(hero_name));
		}
		if(hero_class.equals("Voleur")) {
			 heros.add(new Voleur(hero_name));
		}
		if(hero_class.equals("Sorcier")) {
			 heros.add(new Sorcier(hero_name));
		}
		if(hero_class.equals("Chasseur")) {
			 heros.add(new Chasseur(hero_name));
		}
	}
	
	public static void create_heros(int i) {
		
		System.out.println("Sélectionner la classe de votre héros n°"+ (i+1) +" entre Pretre, Voleur, Guerrier, Sorcier ou Chasseur");
		Scanner clavier = new Scanner(System.in);;
		String hero_class = clavier .nextLine();
		
		while(!(hero_class.equals("Pretre") || hero_class.equals("Voleur") || hero_class.equals("Guerrier") || hero_class.equals("Sorcier") || hero_class.equals("Chasseur"))) {
			System.out.println("Saisissez une classe valide (Pretre, Voleur, Guerrier, Sorcier ou Chasseur)");
			hero_class = clavier.nextLine();
		}
			
		System.out.println("Sélectionner le nom de votre "+ hero_class);
		String hero_name = clavier.nextLine();
		getClass(hero_class, hero_name);
		
	}
	
	public static void main(String[] args) {
		int nbHero = 4;
		heros = new ArrayList<Hero>();
		//ArrayList<Hero> heroList=new ArrayList<Hero>();
		
		for(int i = 0; i < nbHero; i++) {
			
			create_heros(i);
			
		}
			heros.get(0).getStats();
			heros.get(1).getStats();
			heros.get(2).getStats();
			heros.get(3).getStats();
			
		
		}
		
}