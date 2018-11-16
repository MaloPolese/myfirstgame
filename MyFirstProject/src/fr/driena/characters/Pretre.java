package fr.driena.characters;

public class Pretre extends WithPM{

	
	public Pretre(String name) {
		super(name, 100, 150, 30, 15, 100, 150);
	}


	@Override
	public void spellTest(Personnage p, int cost) {
		System.out.println("\nSpell Test de cout: " + cost + "\n Ce Spell a était lancé par " + getNameP());
		
		
	}
	@Override
	public void spell1(Personnage p, int cost) {
		
		Personnage attacked = p;
		
		if (!attacked.getDead()) {
			if (isCriticalHit(0.4)) {
				attacked.setHP(attacked.getHP() - 15);
				System.out.println("Coup critique ! " + attacked.getNameP()
						+ " s'est pris 15 de dégats dans les dents, et il lui reste " + attacked.getHP() + " HP !");

			} else {
				attacked.setHP(attacked.getHP() - 5);
				System.out.println(attacked.getNameP() + " s'est pris 5 de dégats, et il lui reste " + attacked.getHP()
						+ " HP !");

			}
		} else {
			System.out.println(attacked.getNameP() + " est déjà mort, impossible de l'attaquer");
		}
		
	}


	@Override
	public void spell2(Personnage p, int cost) {
		WithPM healed = (WithPM) p;
		
		if (cost < 15) {
			System.out.println(
					"Le coût est inférieur à la valeur ajoutée en PM, initialisation automatique du sort à 15 PM !");
			cost = 15;
		}
		if (isCriticalHit(0.3)) {
			healed.setPM(healed.getPM() + 15);
			this.pmCost(cost);
			System.out.println("Coup critique ! Vous avez soigné " + healed.getNameP() + " de 15 PM ! Il a maintenant "
					+ healed.getPM() + " PM !");
		} else {
			healed.setPM(healed.getPM() + 10);
			this.pmCost(cost);
			System.out.println("Vous avez soigné " + healed.getNameP() + " de 10 PM ! Il a maintenant "
					+ healed.getPM() + " PM !");
		}
		
	}


	@Override
	public void spell3(Personnage p, int cost) {
		Personnage healed = p;
		
		if (healed.isDead() == false) {
			if (isCriticalHit(0.25)) {
				healed.setHP(healed.getHP() + 30);
				this.pmCost(cost);
				System.out.println("Coup critique ! Vous avez soigné " + healed.getNameP()
						+ " de 30 HP ! Il a maintenant " + healed.getHP() + " HP !");
			} else {
				healed.setHP(healed.getHP() + 15);
				this.pmCost(cost);
				System.out.println("Vous avez soigné " + healed.getNameP() + " de 15 HP ! Il a maintenant "
						+ healed.getHP() + " HP !");
			}
		} else {
			System.out.println(healed.getNameP() + " est déjà mort, impossible de le soigner");
		}
		
	}


	@Override
	public void spell4(Personnage p, int cost) {
		Personnage buffed = p;
		
		if (isCriticalHit(0.3)) {
			buffed.boost(10, 10);
			System.out.println(
					"Coup critique ! Vous avez donné à " + buffed.getNameP() + "10 d'attaques et 10 de défense !");
			this.pmCost(cost);
		} else {
			buffed.boost(5, 5);
			System.out.println("Vous avez donné à " + buffed.getNameP() + " 5 d'attaques et 5 de défense !");
			this.pmCost(cost);
		}
		
	}


	@Override
	public void spell5(Personnage p1 , Personnage p2 , int cost) {
		
		Personnage ally = p1;
		Personnage opponent = p2;
		
		if (isCriticalHit(0.20)) {
			ally.setHP(ally.getHP() + 30);
			opponent.setHP(opponent.getHP() - 20);
			this.pmCost(cost);

		} else {
			ally.setHP(ally.getHP() + 20);
			opponent.setHP(opponent.getHP() - 15);
			this.pmCost(cost);
		}
		
	}


}
