package fr.driena.characters;

import java.util.ArrayList;
import java.util.Scanner;

public class Hero extends Personnage {

	private String heroClass = "";
	private ArrayList<Hero> heros;

	public Hero(String name, int HP, int DEF, int ATQ, int maxHP) {
		super(name, HP, DEF, ATQ, maxHP);
	}

	public Hero(ArrayList<Hero> heros) {
		this.heros = heros;
	}

	public void createHeros(int nbHero) {
		if (nbHero > 0) {
			
			Scanner clavier = new Scanner(System.in);

			for (int i = 0; i < nbHero; i++) {
				System.out.println("Sélectionner la classe de votre héros n°" + (i + 1)
						+ " entre Pretre, Voleur, Guerrier, Sorcier ou Chasseur");
				do {
					System.out.println("Saisissez une classe valide (Pretre, Voleur, Guerrier, Sorcier ou Chasseur)");
					heroClass = clavier.nextLine();
				} while (!(heroClass.equalsIgnoreCase("Pretre") || heroClass.equalsIgnoreCase("Voleur")
						|| heroClass.equalsIgnoreCase("Guerrier") || heroClass.equalsIgnoreCase("Sorcier")
						|| heroClass.equalsIgnoreCase("Chasseur")));

				System.out.println("Sélectionner le nom de votre " + heroClass);
				String hero_name = clavier.nextLine();
				creatClass(heroClass, hero_name);

			}

		}else{
			System.out.println("Aucun Hero");
		}

	}

	public void creatClass(String heroClass, String heroName) {

		if (heroClass.equalsIgnoreCase("Guerrier")) {
			heros.add(new Guerrier(heroName));
		}
		if (heroClass.equalsIgnoreCase("Pretre")) {
			heros.add(new Pretre(heroName));
		}
		if (heroClass.equalsIgnoreCase("Voleur")) {
			heros.add(new Voleur(heroName));
		}
		if (heroClass.equalsIgnoreCase("Sorcier")) {
			heros.add(new Sorcier(heroName));
		}
		if (heroClass.equalsIgnoreCase("Chasseur")) {
			heros.add(new Chasseur(heroName));
		}
	}

	public String getHeroClass() {
		return heroClass;
	}

}
