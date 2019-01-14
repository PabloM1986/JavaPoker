package deck;

/**
* Suits are from the typical french style
* */
public enum Suit {
	SPADES('♠', "Spades"), CLUBS('♣', "Clubs"), HEARTS('♡', "Hearts"), DIAMONDS('♢', "Diamonds");
	
	private char symbol;
	private String value;
	
	Suit(char symbol, String value) {
		this.symbol = symbol;
		this.value = value;
	}
	
	public char getSymbol() {
		return this.symbol;
	}

	public String getValue() {
		return this.value;
	}
	
	public String toString() {
		return value;
	}
}
