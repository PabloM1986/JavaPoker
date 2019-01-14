package game;
import deck.*;

public class Table {
	public static void main(String[] args) {
		Player p1 = new Player("Roberto Gomes Bolaños", 88);
		Player p2 = new Player("Mirtha Legrand", 115);

		Deck d = new Deck();
		//System.out.println(d.toString());

		for (int i = 0; i < 5; i++) {
			p1.grabOne(d.deal());
			p2.grabOne(d.deal());
		}

		
		printHand(p1);
		System.out.println("\n");
		printHand(p2);
		System.out.println("\n");

		System.out.println("Valor de la mano de " + p1.name);
		System.out.println(HandEvaluator.getHandValue(p1.showHand()));

		System.out.println("Valor de la mano de " + p2.name);
		System.out.println(HandEvaluator.getHandValue(p2.showHand()));
	
	}
	
	public static void printHand(Player p) {
		System.out.println(p.name + "'s hand:");
		for( Card c : p.showHand()) {
			System.out.print(c.getValue().getSymbol());
			System.out.print(c.getSuit().getSymbol());
			System.out.print(" ");
		}
	}
}
