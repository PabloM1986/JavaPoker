package game;
import deck.*;

public class Table {
	public static void main(String[] args) {
		Player p1 = new Player("Roberto Gomes Bolaños", 88);
		Player p2 = new Player("Mirtha Legrand", 115);
		/*
		 * Después vamos a complicar la implementacion para que esta parte quede
		 * mas linda. Por ahora es solo para que prueben si está todo bien
		 */
		p1.grabOne(new Card(1, "SPADES"));
		p2.grabOne(new Card(2, "CLUBS"));
		p1.grabOne(new Card(4, "CLUBS"));
		p2.grabOne(new Card(13, "DIAMONDs"));
		p1.grabOne(new Card(11, "SPADES"));
		p2.grabOne(new Card(8, "CLUBS"));
		p1.grabOne(new Card(7, "CLUBS"));
		p2.grabOne(new Card(13, "HEARTS"));
		p1.grabOne(new Card(11, "HEARTS"));
		p2.grabOne(new Card(8, "DIAMONDS"));
		System.out.println(p1);
		System.out.println(p2);
	}
}
