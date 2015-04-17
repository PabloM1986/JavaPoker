package deck;

public enum Suit {
	SPADES('♠'), CLUBS('♣'), HEARTS('♡'), DIAMONDS('♢');
	
	private char symbol;
	
	private Suit(char symbol) {
		this.symbol = symbol;
	}
	
	public char getValue() {
		return this.symbol;
	}
	
	public String toString() {
		return Character.toString(symbol);
	}
}
