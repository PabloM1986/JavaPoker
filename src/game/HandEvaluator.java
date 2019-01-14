package game;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import deck.*;

/**
 * To evaluate hands we use a hex string of 9 numbers and letters [0-9]ABCDEF which we then convert to an integer for comparison.
 * The highest number wins
 * */
public class HandEvaluator {
	public static int getHandValue(Card[] hand) {
		char[] value = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		boolean suited = false;

		Card[] sortedHand = hand.clone();
		Arrays.sort(sortedHand);

		//value[0] = hasRoyalFlush(sortedHand);
		//value[1] = hasFourOfAKind(hand);
		//value[2] = hasFull(hand);
		//value[3] = hasFlush(hand);
		//value[4] = hasStraight(hand);
		//value[5] = hasThreeOfAKind(hand);
		//value[6] = hasTwoPairs(hand);
		//value[7] = hasOnePair(hand);
		value[8] = highestCardValue(hand);


		return toInt(value);
	}
	
	private static char hasRoyalFlush(Card[] hand) {
		char value = 0;

		ArrayList<Card> l = new ArrayList<>();
		Collections.addAll(l, hand);
		Collections.sort(l);


		l.forEach(card -> {

		});

		return 0;

	}

	private static char hasFourOfAKind(Card[] hand) {
		return 0;
	}

	private static char hasFull(Card[] hand) {
		return 0;
	}

	private static char hasFlush(Card[] hand) {
		return 0;
	}

	private static char hasStraight(Card[] hand) {
		return 0;
	}

	private static char hasThreeOfAKind(Card[] hand) {
		return 0;
	}

	private static char hasTwoPairs(Card[] hand) {
		return 0;
	}

	/*
	* Returns 0 for no pairs, 1 for 22, 2 for 33, 3 for 44, 4 for 55, 5 for 66, 6 for 77, 7 for 88, 9 for 99, a for 10 10
	* b for JJ, c for QQ d for KK and e for AA
	* */
	private static char hasOnePair(Card[] hand) {

		return 0;
	}

	private static char highestCardValue(Card[] hand) {
		Card highest = hand[0];

		//TODO: it should be possible to use Collections.max to quickly get the highest card
		for (int i = hand.length - 1; i > 0; i--) {
			if (highest.compareTo(hand[i]) < 0) {
				highest = hand[i];
			}
		}

		return (char) highest.getValue().getValue();
	}



	private static int toInt(char[] base13string) {
		int value = 0;

		for (char c : base13string) {
			value += c;
		}

		return value;
	}
}
