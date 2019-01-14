package deck;

import java.util.Collections;
import java.util.Stack;


public class Deck {
	private Stack<Card> deck = new Stack<>();
	
	public Deck () {
		for (Suit s : Suit.values()) {
			System.out.println("Adding " + s.getValue() + " to the deck");
			for (Value v : Value.values()) {
				deck.add(new Card(v, s));
			}
		}

		System.out.println("Final size is " + deck.size());
		shuffle();
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card deal() {
		return deck.pop();
	}

	@Override
	public String toString() {
		StringBuilder deck = new StringBuilder();

		for (Card c : this.deck) {
			deck.append(c.getValue().getSymbol())
				.append(c.getSuit().getSymbol())
				.append(" ");
		}

		return deck.toString();
	}
}


