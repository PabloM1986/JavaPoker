package game;

import deck.Card;
public class Player {
	//Tiene sentido que solo player conozca sus cartas	
	private Card[] hand = new Card[5];
	public String name;
	public int age;
	public int lastCard = 0;
	
	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void grabOne(Card c) {
		if ((lastCard - 1) < hand.length) {
			hand[lastCard] = c;
			lastCard++;
		}
	}
	
	public Card[] showHand() {
		return hand.clone();
	}
}
