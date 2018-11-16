package Characters;

public class WithPM extends Hero{
	
	protected int PM;
	protected int maxPM;
	
	public WithPM(String name, int HP, int PM,  int DEF, int ATQ, int maxHP, int maxPM) {
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
