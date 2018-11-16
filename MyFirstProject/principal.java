package main;

import java.util.Scanner;
import Characters.Personnage;
import Characters.Pretre;
import Characters.Voleur;
import Characters.Personnage;

public class principal {
	
	public static Hero create_heros(int i) {
		System.out.println("Sélectionner la classe de votre héros n°"+ (i+1) +" entre Pretre, Voleur, Guerrier, Sorcier ou Chasseur");
		String hero_class = clavier.nextLine();
		
		while(!(hero_class.equals("Pretre") || hero_class.equals("Voleur") || hero_class.equals("Guerrier") || hero_class.equals("Sorcier") || hero_class.equals("Chasseur")) {
			System.out.println("Saisissez une classe valide (Pretre, Voleur, Guerrier, Sorcier ou Chasseur)");
			String hero_class = clavier.nextLine();
		}
		
		System.out.println("Sélectionner le nom de votre "+ hero_class);
		String hero_name = clavier.nextLine();
		return new Hero(hero_name);
	}
	
	
	public static void main(String[] args) {
		int nbHero = 4;
		Scanner clavier = new Scanner(System.in);
		ArrayList<Hero> heroList=new ArrayList<Hero>();
		
		for(int i = 0; i < nbHero; i++) {
			heroList.add(create_heros(i))
		}
		
		for(int i = 0; i < nbHero; i++) {
			System.out.println(heroList.get(i));
		}
		
		
	}
}
