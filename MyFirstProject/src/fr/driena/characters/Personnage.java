package fr.driena.characters;

import fr.driena.events.Fight;

public class Personnage implements Fight {

	private String nameP;
	protected int HP;
	protected int maxHP;
	protected int DEF;
	protected int ATQ;
	protected boolean isRooted;
	private boolean isDead;
	protected boolean isBleeding;
	protected boolean isSilence;

	/**
	 * Constructeur Personnage
	 * 
	 * @param name
	 *            : nom du personnage
	 * @param HP
	 *            : vie du personnage
	 * @param DEF
	 *            : deffence du personnage
	 * @param ATQ
	 *            : attaque du personnage
	 * @param maxHP
	 *            : vie max du personnage
	 */
	public Personnage(String name, int HP, int DEF, int ATQ, int maxHP) {
		this.setNameP(name);
		this.HP = HP;
		this.DEF = DEF;
		this.ATQ = ATQ;
		this.maxHP = maxHP;
		this.isRooted = false;
		this.setDead(false);
		this.isBleeding = false;
		this.isSilence = false;
	}

	/**
	 * Constructeur personnage
	 * 
	 */
	public Personnage() {
	}

	/**
	 * Permet de récupré les states du personnage (HP / DEF / ATQ / Name)
	 */
	public void showStats() {
		System.out.println(this.getHP() + " " + this.getDEF() + " " + this.getATQ() + " " + this.getNameP());
	}

	/**
	 * permet de ???
	 * 
	 * @param hP
	 */
	public void setHP(int hP) {

		this.HP = hP;

		if (this.HP > maxHP) {
			this.HP = this.maxHP;
			System.out.println("HP max atteint, impossible de dépasser la limite !");
			return;
		}

		if (this.HP <= 0) {
			this.HP = 0;
			this.setDead(true);
		}
	}

	/**
	 * permet de ??
	 * 
	 * @param damages
	 */
	public void attack(int damages) {
		if (this.isDead()) {
			System.out.println("Impossible d'attaquer, tu est déjà mort ...");
		}
		this.setHP(this.HP - damages);
	}

	/**
	 * permet de ??
	 * 
	 * @param amount
	 */
	public void heal(int amount) {

		if (this.isDead()) {
			System.out.println(this.nameP + " est déjà mort ! Impossible de le réssuciter !");
			return;
		}
		this.setHP(this.HP + amount);

		if (this.HP + amount > maxHP) {
			System.out.println(this.nameP + " a atteint le max de ses HP ! Impossible de soigner plus !");
			this.HP = this.maxHP;
			return;
		}
	}

	/**
	 * permet de ??
	 * 
	 * @param incrATQ
	 * @param incrDEF
	 */
	public void boost(int incrATQ, int incrDEF) {
		this.setATQ(this.ATQ + incrATQ);
		this.setDEF(this.DEF + incrDEF);
	}

	/**
	 * permet de ??permet de ??
	 * 
	 * @param percentChance
	 * @return
	 */
	public boolean isCriticalHit(double percentChance) {
		double crit = Math.random();
		if (crit > 1 - percentChance) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * permet de ??
	 * 
	 * @param percentChance
	 */
	public void rooted(double percentChance) {
		double root = Math.random();
		if (root > 1 - percentChance) {
			this.isRooted = true;
		}
	}

	/**
	 * permet de ??
	 * 
	 * @param percentChance
	 */
	public void bleed(double percentChance) {
		double blood = Math.random();
		if (blood > 1 - percentChance) {
			System.out.println(this.getNameP() + " saigne !");
			this.isBleeding = true;
		}
	}

	/**
	 * permet de ??
	 * 
	 * @param critical_hit
	 */
	public void deadAfterAtq(boolean critical_hit) {
		if (critical_hit && this.isDead()) {
			System.out.println("Coup critique, " + this.nameP + "est mort après cette violente attaque !");
			return;
		} else if (critical_hit == false && this.isDead()) {
			System.out.println(this.nameP + " est mort après cette attaque (médiocre, mais suffisante)");
		}
	}

	@Override
	public void spell1(Personnage p, int cost) {
		// TODO Auto-generated method stub

	}

	@Override
	public void spell2(Personnage p, int cost) {
		// TODO Auto-generated method stub

	}

	@Override
	public void spell3(Personnage p, int cost) {
		// TODO Auto-generated method stub

	}

	@Override
	public void spell4(Personnage p, int cost) {
		// TODO Auto-generated method stub

	}

	@Override
	public void spell5(Personnage p1, Personnage p2, int cost) {
		// TODO Auto-generated method stub

	}

	@Override
	public void spellTest(Personnage p, int cost) {
		// TODO Auto-generated method stub

	}

	/* Getter and Setter */

	public boolean isDead() {
		return this.isDead;
	}

	public String getNameP() {
		return this.nameP;
	}

	public int getHP() {
		return this.HP;
	}

	public int getDEF() {
		return this.DEF;
	}

	public int getATQ() {
		return this.ATQ;
	}

	public void setNameP(String name_p) {
		this.nameP = name_p;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public void setDEF(int dEF) {
		this.DEF = dEF;
	}

	public void setATQ(int aTQ) {
		this.ATQ = aTQ;
	}

}
