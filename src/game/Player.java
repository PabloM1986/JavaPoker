package game;

import deck.Card;
public class Player {
	//Tiene sentido que solo player conozca sus cartas	
	private Card[] hand = new Card[5];
	public String name;
	public int age;
	
	public Player(String name, int age) {
	}
	
	public void grabOne(Card c) {
		//agregar una carta a hand
	}
	public Card[] showHand() {
		//devolver una copia de hand
	}
}
