package fr.driena.characters;

public class WithPM extends Hero {

	protected int PM;
	protected int maxPM;

	/**
	 * Constructeur de WithPM
	 * 
	 * @param name : nom du hero
	 * @param HP : vie du personnage
	 * @param PM : Mana du personange
	 * @param DEF : defance du personnage
	 * @param ATQ : attaque du personange 
	 * @param maxHP : vie max du personnage
	 * @param maxPM : mana max du personnage
	 */

	public WithPM(String name, int HP, int PM, int DEF, int ATQ, int maxHP, int maxPM) {
		super(name, HP, DEF, ATQ, maxHP);
		this.PM = PM;
		this.maxPM = maxPM;
	}

	public int getPM() {
		return PM;
	}

	public void setPM(int pM) {
		this.PM = pM;
	}

	public void pmCost(int amount) {
		this.setPM(this.PM - amount);
	}

}
