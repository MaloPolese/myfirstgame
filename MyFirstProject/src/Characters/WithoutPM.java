package Characters;

public class WithoutPM extends Hero{
	
	public WithoutPM(String name, int HP, int DEF, int ATQ, int maxHP) {
		super(name, HP, DEF, ATQ, maxHP);
	}
	
	//Quand un heros sans mana frappe avec un coup puissant, il perd un certain montant de PV !
	public void scratch(int amount) {
		this.setHP(this.getHP() - amount);
	}
}
