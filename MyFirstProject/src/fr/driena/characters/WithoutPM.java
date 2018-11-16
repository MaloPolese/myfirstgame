package fr.driena.characters;

public class WithoutPM extends Hero {

	/**
	 * Constructeur de WithoutPM
	 * 
	 * @param name : nom du hero
	 * @param HP : vie du personnage
	 * @param DEF : defance du personnage
	 * @param ATQ : attaque du personange 
	 * @param maxHP : vie max du personnage
	 */
	public WithoutPM(String name, int HP, int DEF, int ATQ, int maxHP) {
		super(name, HP, DEF, ATQ, maxHP);
	}

	// Quand un heros sans mana frappe avec un coup puissant, il perd un certain
	// montant de PV !
	public void scratch(int amount) {
		this.setHP(this.getHP() - amount);
	}
}
