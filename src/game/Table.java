package game;
import deck.*;

public class Table {
	public static void main(String[] args) {
		Player p1 = new Player("Roberto Gomes Bolaños", 88);
		Player p2 = new Player("Mirtha Legrand", 115);

		Deck d = new Deck();
		
		for (int i = 0; i < 5; i++) {
			p1.grabOne(d.deal());
			p2.grabOne(d.deal());
		}

		
		printHand(p1);
		System.out.println("\n");
		printHand(p2);
	
	}
	
	public static void printHand(Player p) {
		System.out.println(p.name + "'s hand:");
		for( Card c : p.showHand()) {
			System.out.print(c.getValue());
			System.out.print(c.getSuit());
			System.out.print(" ");
		};
	}
}
