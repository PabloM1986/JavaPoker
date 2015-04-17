/**
 * Por una cuestión de organización del código me parece que tiene sentido ubicar
 * a Card (carta) dentro del paquete deck (Mazo)
 */
package deck;
/**
 * Esta es la clase Carta, el componente más básico de nuestro juego de poker.
 * Las cartas tienen un valor y un palo. Estos atributos no pueden modificarse
 * una vez que son creadas, por lo tanto la clase solo necesita getters y un
 * constructor que reciba como argumento el valor de dichos atributos.
 * */
public class Card {
	private Value value;
	private Suit suit;
	/**
	 * Constructor de la clase
	 * Recibe 2 parámetros: value y suit y los asigna respectivamente
	 * a sus atributos value y suit. Es una practica común en Java nombrar
	 * los parámetros del constructor igual que los atributos que llenan
	 * */
	public Card (Value value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	public Value getValue() {
		return value;
	}
	public Suit getSuit() {
		return suit;
	}
	
	
}
