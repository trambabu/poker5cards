package com.game.poker.card;

/************************************************
* Card
* Creates a playing card
* @author RTadepalli
************************************************/

public class Card implements Comparable<Card> {
	
	// constants
	public final static int CLUBS = 0;
	public final static int DIAMONDS = 1;
	public final static int HEARTS = 2;
	public final static int SPADES = 3;

	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
	public final static int ACE = 14;

	// instance variables
	private final int suit;
	private final int rank;

	// constructor
	public Card(int theRank, int theSuit) {
		this.rank = theRank;
		this.suit = theSuit;
	}

	// methods to get rank and suit of a card
	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	// methods to get rank and suit of a card as a String
	public String getRankAsString() {
		switch (rank) {
		case 1:
			return "3";
		case 2:
			return "4";
		case 3:
			return "5";
		case 4:
			return "6";
		case 5:
			return "7";
		case 6:
			return "8";
		case 7:
			return "9";
		case 8:
			return "10";
		case 9:
			return "Jack";
		case 10:
			return "Queen";
		case 11:
			return "King";
		case 12:
			return "Ace";
		default:
			return "2";
		}
	}

	public String getSuitAsString() {
		switch (suit) {
		case CLUBS:
			return "Clubs";
		case DIAMONDS:
			return "Diamonds";
		case HEARTS:
			return "Hearts";
		default:
			return "Spades";
		}
	}

	// method to get a card as a String
	public String toString() {
		return getRankAsString() + " of " + getSuitAsString() + " ";
	}

	// method to compare ranks of cards
	public int compareTo(Card other) {
		int answer = 0;
		if (this.rank < other.rank)
			answer = -1;
		if (this.rank > other.rank)
			answer = 1;
		if (this.rank == other.rank)
			answer = 0;
		return answer;
	}

}