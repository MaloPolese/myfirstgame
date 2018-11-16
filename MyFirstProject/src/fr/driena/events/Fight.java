package fr.driena.events;

import fr.driena.characters.Personnage;

public interface Fight{

	/**
	 * 
	 * @param p : personnage 
	 * @param cost : cout en mana
	 */
	public void spell1(Personnage p , int cost);
	/**
	 * 
	 * @param p : personnage 
	 * @param cost : cout en mana
	 */
	public void spell2(Personnage p , int cost);
	/**
	 * 
	 * @param p : personnage 
	 * @param cost : cout en mana
	 */
	public void spell3(Personnage p , int cost);
	/**
	 * 
	 * @param p : personnage 
	 * @param cost : cout en mana
	 */
	public void spell4(Personnage p , int cost);	
	/**
	 * 
	 * @param p1 : personnage 1
	 * @param p2 : personnage 2
	 * @param cost : cout en mana
	 */
	public void spell5(Personnage p1 , Personnage p2 , int cost);	
	/**
	 * 
	 * @param p : personnage 
	 * @param cost : cout en mana
	 */
	public void spellTest(Personnage p , int cost);
}
