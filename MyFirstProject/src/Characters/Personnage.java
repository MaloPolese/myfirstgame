package Characters;

public class Personnage {
	
	private String name_p;
	protected int HP;
	protected int maxHP;
	protected int DEF;
	protected int ATQ;
	protected boolean isRooted;
	protected boolean isDead;
	protected boolean isBleeding;
	protected boolean isSilence;
	
	public Personnage(String name, int HP, int DEF, int ATQ, int maxHP) {
		this.setName_p(name);
		this.HP = HP;
		this.DEF = DEF;
		this.ATQ = ATQ;
		this.maxHP = maxHP;
		this.isRooted = false;
		this.isDead = false;
		this.isBleeding = false;
		this.isSilence = false;
	}
	
	public void getStats() {
		System.out.println(this.getHP() +" "+ this.getDEF() +" "+ this.getATQ() +" "+ this.getName_p());
	}

	public String getName_p() {
		return this.name_p;
	}

	public void setName_p(String name_p) {
		this.name_p = name_p;
	}
	
	public int getHP() {
		return this.HP;
	}

	public void setHP(int hP) {
		
		this.HP = hP;
		
		if(this.HP > maxHP) {
			this.HP = this.maxHP;
			System.out.println("HP max atteint, impossible de dépasser la limite !");
			return;
		}
		
		if(this.HP <= 0) {
			this.HP = 0;
			this.isDead = true;
		}
	}
	
	public boolean getDead() {
		return this.isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public int getDEF() {
		return this.DEF;
	}

	public void setDEF(int dEF) {
		this.DEF = dEF;
	}

	public int getATQ() {
		return ATQ;
	}

	public void setATQ(int aTQ) {
		this.ATQ = aTQ;
	}
	
	public void attack(int damages) {
		if(this.isDead) {
			System.out.println("Impossible d'attaquer, tu est déjà mort ...");
		}
		this.setHP(this.HP - damages);
	}
	
	public void heal(int amount) {
		
		if(this.isDead) {
			System.out.println(this.name_p +" est déjà mort ! Impossible de le réssuciter !");
			return;
		}
		this.setHP(this.HP + amount);
		
		if(this.HP + amount > maxHP) {
			System.out.println(this.name_p +" a atteint le max de ses HP ! Impossible de soigner plus !");
			this.HP = this.maxHP;
			return;
		}
	}
	
	public void boost(int incrATQ, int incrDEF) {
		this.setATQ(this.ATQ + incrATQ);
		this.setDEF(this.DEF + incrDEF);
	}
	
	public boolean isCriticalHit(double percentChance) {
		double crit = Math.random();
		if(crit > 1 - percentChance) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void rooted(double percentChance) {
		double root = Math.random();
		if(root > 1 - percentChance) {
			this.isRooted = true;
		}
	}
	
	public void bleed(double percentChance) {
		double blood = Math.random();
		if(blood > 1 - percentChance) {
			System.out.println(this.getName_p() +" saigne !");
			this.isBleeding = true;
		}
	}
	public void deadAfterAtq(boolean critical_hit) {
		if(critical_hit && this.isDead) {
			System.out.println("Coup critique, "+ this.name_p + "est mort après cette violente attaque !");
			return;
		}else if(critical_hit == false && this.isDead){
			System.out.println(this.name_p +" est mort après cette attaque (médiocre, mais suffisante)");
		}
	}

	
}
