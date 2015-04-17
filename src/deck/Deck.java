package deck;

import java.util.Collections;
import java.util.Stack;


public class Deck {
	private Stack<Card> deck = new Stack<Card>();
	
	public Deck () {
		for (Suit s : Suit.values()) {
			for (Value v : Value.values()) {
				deck.add(new Card(v, s));
			}
		}
		
		shuffle();
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card deal() {
		return deck.pop();
	}
}


