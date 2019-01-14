package deck;


/**
 * A playing card. Cards typically have a suit and a value, excepting Jokers but since this is a poker game we don't
 * need to worry about those.
 * */
public class Card implements Comparable<Card> {
	private Value value;
	private Suit suit;

	Card (Value value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}

	public Value getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

	public int compareTo(Card c) {
		return getValue().getValue() - c.getValue().getValue();
	}

}