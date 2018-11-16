package fr.driena.events;

import fr.driena.characters.Personnage;

public interface Fight{

	public void spell1(Personnage p , int cost);
	public void spell2(Personnage p , int cost);
	public void spell3(Personnage p , int cost);
	public void spell4(Personnage p , int cost);
	public void spell5(Personnage p1 , Personnage p2 , int cost);
	
	public void spellTest(Personnage p , int cost);
}
