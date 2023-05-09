package com.game.poker.player;

/************************************************
* Player.java
* Creates a player for a video poker game
* @author RTadepalli
************************************************/

import java.util.ArrayList;
import java.util.Collections;

import com.game.poker.card.Card;
import com.game.poker.deck.Deck;

public class Player {

	// instance variables
	private Card[] hand;
	private Deck theDeck;

	// constructor
	public Player() {
		hand = new Card[5];
		theDeck = new Deck();
	}

	// method for creating player's hand
	public void createHand() {
		theDeck.shuffle();
		for (int i = 0; i < 5; i++) {
			hand[i] = theDeck.getCard();
		}
	}

	// method for sorting player's hand
	// requires converting array to array list, and then back
	public Card[] sort() {
		ArrayList<Card> handList = new ArrayList<Card>();
		for (int i = 0; i < 5; i++)
			handList.add(hand[i]);
		Collections.sort(handList);
		hand = handList.toArray(hand);
		return hand;
	}

	// method for getting player's hand as a String
	public String showHand() {
		String handString = new String("");
		for (int i = 0; i < 5; i++)
			handString += hand[i];
		return handString;
	}

	// methods for replacing cards in hand
	public void replaceFirstCard() {
		hand[0] = theDeck.getCard();
	}

	public void replaceSecondCard() {
		hand[1] = theDeck.getCard();
	}

	public void replaceThirdCard() {
		hand[2] = theDeck.getCard();
	}

	public void replaceFourthCard() {
		hand[3] = theDeck.getCard();
	}

	public void replaceFifthCard() {
		hand[4] = theDeck.getCard();
	}

	// methods for evaluating player's hand
	public boolean isRoyalFlush() {
		// must be a flush, a straight, and begin with a 10 (rank = 8)
		boolean rflush = false;
		boolean flush = false;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (hand[i].getSuit() == (hand[i + 1].getSuit()))
				count++;
		}
		if (count == 4)
			flush = true;
		boolean straight = false;
		int count2 = 0;
		for (int i = 0; i < 4; i++) {
			if ((hand[i + 1].getRank() == (hand[i].getRank() + 1))
					|| ((hand[0].getRank() == 2) && (hand[1].getRank() == 3)
							&& (hand[2].getRank() == 4)
							&& (hand[3].getRank() == 5) && (hand[0].getRank() == 8)))
				count2++;
		}
		if (count2 == 4)
			straight = true;
		if ((flush == true) && (straight == true) && hand[0].getRank() == 8)
			rflush = true;
		return rflush;
	}

	public boolean isStraightFlush() {
		// must be a flush and a straight
		boolean sflush = false;
		boolean flush = false;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (hand[i].getSuit() == (hand[i + 1].getSuit()))
				count++;
		}
		if (count == 4)
			flush = true;
		boolean straight = false;
		int count2 = 0;
		for (int i = 0; i < 4; i++) {
			if ((hand[i + 1].getRank() == (hand[i].getRank() + 1))
					|| ((hand[0].getRank() == 2) && (hand[1].getRank() == 3)
							&& (hand[2].getRank() == 4)
							&& (hand[3].getRank() == 5) && (hand[4].getRank() == 12)))
				count2++;
		}
		if (count2 == 4)
			straight = true;
		if ((flush == true) && (straight == true))
			sflush = true;
		return sflush;
	}

	public boolean is4OfAKind() {
		// must have four cards of the same rank
		boolean four = false;
		int count = 0;
		for (int i = 0; i < 5; i++) {
			count = 0;
			for (int j = 0; j < 5; j++) {
				if ((hand[i].getRank() == (hand[j].getRank())) && (i != j))
					count++;
			}
			if (count == 3)
				four = true;
		}
		return four;
	}

	public boolean is3OfAKind() {
		// must have four cards of the same rank
		boolean three = false;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			count = 0;
			for (int j = 0; j < 4; j++) {
				if ((hand[i].getRank() == (hand[j].getRank())) && (i != j))
					count++;
			}
			if (count == 2)
				three = true;
		}
		return three;
	}
	public boolean isFullHouse() {
		// must contain both a pair and a triple
		boolean fullhouse = false;
		boolean onep = false;
		int count = 0;
		for (int i = 0; i < 5; i++) {
			count = 0;
			for (int j = 0; j < 5; j++) {
				if ((hand[i].getRank() == (hand[j].getRank())) && (i != j))
					count++;
			}
			if (count == 1)
				onep = true;
		}
		boolean triple = false;
		int count2 = 0;
		for (int i = 0; i < 5; i++) {
			count2 = 0;
			for (int j = 0; j < 5; j++) {
				if ((hand[i].getRank() == (hand[j].getRank())) && (i != j))
					count2++;
			}
			if (count2 == 2)
				triple = true;
		}
		if (onep == true && triple == true)
			fullhouse = true;
		return fullhouse;
	}

	public boolean isFlush() {
		// all cards must be of same suit
		boolean flush = false;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (hand[i].getSuit() == (hand[i + 1].getSuit()))
				count++;
		}
		if (count == 4)
			flush = true;
		return flush;
	}

	public boolean isStraight() {
		// ranks of cards must be exactly consecutive
		// also accounts for straight where Ace is low
		boolean straight = false;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if ((hand[i + 1].getRank() == (hand[i].getRank() + 1))
					|| ((hand[0].getRank() == 2) && (hand[1].getRank() == 3)
							&& (hand[2].getRank() == 4)
							&& (hand[3].getRank() == 5) && (hand[4].getRank() == 12)))
				count++;
		}
		if (count == 4)
			straight = true;
		return straight;
	}

	public boolean isTriple() {
		// three of the cards must be of the same rank
		boolean triple = false;
		int count = 0;
		for (int i = 0; i < 5; i++) {
			count = 0;
			for (int j = 0; j < 5; j++) {
				if ((hand[i].getRank() == (hand[j].getRank())) && (i != j))
					count++;
			}
			if (count == 2)
				triple = true;
		}
		return triple;
	}

	public boolean is2Pair() {
		// must have two pairs of cards of the same rank
		boolean twop = false;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (hand[i].getRank() == (hand[i + 1].getRank()))
				count++;
		}
		if (count == 2)
			twop = true;
		return twop;
	}

	public boolean is1Pair() {
		// must have two cards of the same rank
		boolean onep = false;
		int count = 0;
		for (int i = 0; i < 5; i++) {
			count = 0;
			for (int j = 0; j < 5; j++) {
				if ((hand[i].getRank() == (hand[j].getRank())) && (i != j))
					count++;
			}
			if (count == 1)
				onep = true;
		}
		return onep;
	}

	public String highCard() {
		// returns the card in the hand of the highest rank
		sort();
		String highcard = "";
		Card high = hand[4];
		highcard = high.toString();
		return highcard;
	}

} // end of the class
