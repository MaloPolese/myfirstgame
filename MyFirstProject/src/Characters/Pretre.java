package Characters;

public class Pretre extends WithPM{
	
	public Pretre(String name) {
		super(name, 100, 150, 30, 15, 100, 150);
	}
	
	
	public void stickHit(Personnage attacked) {
		
		if(attacked.isDead == false) {
		if(isCriticalHit(0.4)) {
			attacked.setHP(attacked.getHP() - 15);
			System.out.println("Coup critique ! "+ attacked.getName_p() +" s'est pris 15 de d�gats dans les dents, et il lui reste "+ attacked.getHP() +" HP !");
			
		}else {
		attacked.setHP(attacked.getHP() - 5);
		System.out.println(attacked.getName_p() +" s'est pris 5 de d�gats, et il lui reste "+ attacked.getHP() +" HP !");
		
		}
		}else {
			System.out.println(attacked.getName_p() +" est d�j� mort, impossible de l'attaquer");
		}
	}
	
	public void restorePM(WithPM healed, int cost) {
		if(cost < 15) {
			System.out.println("Le co�t est inf�rieur � la valeur ajout�e en PM, initialisation automatique du sort � 15 PM !");
			cost = 15;
		}
		if(isCriticalHit(0.3)) {
			healed.setPM(healed.getPM() + 15);
			this.pmCost(cost);
			System.out.println("Coup critique ! Vous avez soign� "+ healed.getName_p() +" de 15 PM ! Il a maintenant "+ healed.getPM() +" PM !");
		}else {
			healed.setPM(healed.getPM() + 10);
			this.pmCost(cost);
			System.out.println("Vous avez soign� "+ healed.getName_p() +" de 10 PM ! Il a maintenant "+ healed.getPM() +" PM !");
		}
	}
	
	public void healing(Personnage healed, int cost) {
		
		if(healed.isDead == false) {
		if(isCriticalHit(0.25)) {
			healed.setHP(healed.getHP() + 30);
			this.pmCost(cost);
			System.out.println("Coup critique ! Vous avez soign� "+ healed.getName_p() +" de 30 HP ! Il a maintenant "+ healed.getHP() +" HP !");
		}else {
			healed.setHP(healed.getHP() + 15);
			this.pmCost(cost);	
			System.out.println("Vous avez soign� "+ healed.getName_p() +" de 15 HP ! Il a maintenant "+ healed.getHP() +" HP !");
		}
		}else {
			System.out.println(healed.getName_p() +" est d�j� mort, impossible de le soigner");
		}
	}
	
	public void hope(Personnage buffed, int cost) {
		if(isCriticalHit(0.3)) {
			buffed.boost(10, 10);
			System.out.println("Coup critique ! Vous avez donn� � "+ buffed.getName_p() +"10 d'attaques et 10 de d�fense !");
			this.pmCost(cost);
		}else {
			buffed.boost(5, 5);
			System.out.println("Vous avez donn� � "+ buffed.getName_p() +" 5 d'attaques et 5 de d�fense !");
			this.pmCost(cost);
		}
	}
	
	public void ultimateJugement(Personnage ally, Personnage opponent, int cost) {
		if(isCriticalHit(0.20)) {
			ally.setHP(ally.getHP() + 30);
			opponent.setHP(opponent.getHP() - 20);
			this.pmCost(cost);
			
		}else {
			ally.setHP(ally.getHP() + 20);
			opponent.setHP(opponent.getHP() - 15);
			this.pmCost(cost);
		}
	}
	
	
}
