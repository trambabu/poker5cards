package com.game.poker.deck;

/************************************************
* Deck.java
* Creates a deck of playing cards
/* @author RTadepalli
************************************************/

import java.util.Random;

import com.game.poker.card.Card;

public class Deck {

	// instance variables
	Card[] theDeck;
	int topCard;

	// constructor
	public Deck() {
		theDeck = new Card[52];
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				theDeck[j * 13 + i] = new Card(i, j);
			}
		}
	}

	// method for accessing the top card of the deck
	// and setting the top card to next card in the deck
	public Card getCard() {
		return theDeck[topCard++];
	}

	// method for shuffling the deck
	public void shuffle() {
		Random rand = new Random();
		int ind1, ind2;
		for (int k = 0; k < 500; k++) {
			ind1 = rand.nextInt(52);
			ind2 = rand.nextInt(52);
			Card temp = theDeck[ind1];
			theDeck[ind1] = theDeck[ind2];
			theDeck[ind2] = temp;
		}
	}

	// method for getting the deck as a String
	public String toString() {
		String deckString = "";
		for (int i = 0; i < 52; i++) {
			deckString += theDeck[i];
			deckString += " ";
		}
		return deckString;
	}

}