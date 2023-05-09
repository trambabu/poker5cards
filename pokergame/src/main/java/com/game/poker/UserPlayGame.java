package com.game.poker;


	import java.util.ArrayList;
	import java.util.Collections;

import com.game.poker.card.Card;

	/************************************************
	* UserPlayGame.java
	* Allows the user to create a player's hand of cards
	* and decide which evaluator methods to test
	* @author RTadepalli
	*************************************************/
	public class UserPlayGame {

		public static void main(String[] args) {

			
			 /* Make some cards (int Rank, int Suit)
			 * Ranks: For numbered cards subtract 2
			 * e.g. to write a "10" card enter rank 8
			 * Jack = 9; Queen = 10; King = 11; Ace = 12
			 * Suits: Clubs = 0; Diamonds = 1; Hearts = 2; Spades = 3
			 */
			
			Card c1 = new Card(0, 0);
			Card c2 = new Card(0, 0);
			Card c3 = new Card(0, 0);
			Card c4 = new Card(0, 0);
			Card c5 = new Card(0, 0);

			// Make a hand
			Card[] hand = new Card[5];
			hand[0] = c1;
			hand[1] = c2;
			hand[2] = c3;
			hand[3] = c4;
			hand[4] = c5;

			// Sort the hand by converting to array list and back
			ArrayList<Card> handList = new ArrayList<Card>();
			for (int i = 0; i < 5; i++)
				handList.add(hand[i]);
			Collections.sort(handList);
			hand = handList.toArray(hand);

			// Test methods here by pasting code for evaluating the hand (from Player)

			// Now print the boolean the method returns, to see if it worked
			System.out.println(/*name of boolean for this method*/);
			
		} // end main method

} // end of the class
