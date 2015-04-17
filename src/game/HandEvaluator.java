package game;
import java.util.ArrayList;
import java.util.Collections;


import deck.*;

public class HandEvaluator {
	public static int getHandValue(Card[] hand) {
		int value = 0;
		value += hasRoyalFlush(hand);
		value += hasFourOfAKind(hand);
		value += hasFull(hand);
		value += hasFlush(hand);
		value += hasStraight(hand);
		value += hasThreeOfAKind(hand);
		value += hasTwoPairs(hand);
		value += hasOnePair(hand);
		value += highestHand(hand);
		
		return value;
	}
	
	private static int hasRoyalFlush(Card[] hand) {
		ArrayList<Card> l = new ArrayList<Card>();
		
		for (Card c : hand) {
			l.add(c);
		}
		Collections.sort(l);
		
	}
}
