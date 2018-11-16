package Characters;

public class Voleur extends WithoutPM{
	
	protected boolean isInvisible;
	
	public Voleur(String name) {
		super(name,70, 50, 70, 70);
		isInvisible = false;
	}

	public void invisibility() {
		if(this.isInvisible) {
			System.out.println("Tu est déjà invisible !");
			return;
		}
		
		this.isInvisible = true;
	}
	
	public void bloodyBlow(Personnage opponent) {
		if(opponent.isBleeding) {
			if(isCriticalHit(1)) {
				opponent.setHP(opponent.getHP() - 40);
				System.out.println("L'ennemi saigne ! "+ opponent.getName_p() +" s'est pris 40 dégats ! Il lui reste "+ opponent.getHP() +" HP !");
				opponent.isBleeding = false;
			}
		}
		else {
			if(isCriticalHit(0.2)) {
				opponent.setHP(opponent.getHP() - 25);
				System.out.println("Coup critique ! "+ opponent.getName_p() +" s'est pris 25 dégats ! Il lui reste "+ opponent.getHP() +" HP !");
				opponent.bleed(0.5);
			}else {
				opponent.setHP(opponent.getHP() - 15);
				System.out.println(opponent.getName_p() +" s'est pris 15 dégats ! Il lui reste "+ opponent.getHP() +" HP !");
				opponent.bleed(0.3);
			}
			}
		}

	}
