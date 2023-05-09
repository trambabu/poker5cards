package com.game.poker.game;

/************************************************
* Game.java
* Creates a game of video poker
* @author RTadepalli
************************************************/

import java.util.Scanner;

import com.game.poker.player.Player;

public class Game {

	// instance variables
	private Scanner input;
	private Player p1;
	private boolean keepPlaying;

	// constructor
	public Game() {
		input = new Scanner(System.in);
		p1 = new Player();
		keepPlaying = true;
	}

	// method to deal the deck
	public void deal() {
		System.out.println();
		System.out.println("Here is your hand: ");
		p1.createHand();
		p1.sort();
		System.out.println(p1.showHand());
		System.out.println();
	}

	// method to allow player to redraw
	public void redraw() {
		boolean redraw = false;
		System.out.println("Replace first card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			p1.replaceFirstCard();
		System.out.println("Replace second card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			p1.replaceSecondCard();
		System.out.println("Replace third card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			p1.replaceThirdCard();
		System.out.println("Replace fourth card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			p1.replaceFourthCard();
		System.out.println("Replace fifth card? true/false");
		redraw = input.nextBoolean();
		if (redraw == true)
			p1.replaceFifthCard();
		p1.sort();
		System.out.println();
		System.out.println("Here is your new hand: ");
		System.out.println(p1.showHand());
		System.out.println();
	}

	// method to evaluate the hand
	public String evaluate() {
		String evaluation = "";
		if (p1.isRoyalFlush() == true) {
			evaluation = "Royal Flush";
			return evaluation;
		}
		if (p1.isStraightFlush() == true) {
			evaluation = "Straight Flush";
			return evaluation;
		}
		if (p1.is4OfAKind() == true) {
			evaluation = "4 of a Kind";
			return evaluation;
		}
		 if (p1.isFullHouse() == true) {
			 evaluation = "Full House";
			 return evaluation;
		}
		if (p1.isFlush() == true) {
			evaluation = "Flush";
			return evaluation;
		}
		if (p1.isStraight() == true) {
			evaluation = "Straight";
			return evaluation;
		}
		if (p1.isTriple() == true) {
			evaluation = "3 of a Kind";
			return evaluation;
		}
		if (p1.is2Pair() == true) {
			evaluation = "2 Pair";
			return evaluation;
		}
		if (p1.is1Pair() == true) {
			evaluation = "1 Pair";
			return evaluation;
		}
		evaluation = "high card " + p1.highCard();
		return evaluation;
	}

	 //method to play a game
	 //welcomes user, deals, allows redraws, evaluates, reports poker hand	
	public void playGame() {
		System.out.println();
		System.out.println("~~~Welcome to Poker!~~~");
		do {
			deal();
			redraw();
			System.out.println("You got " + evaluate() + "!");
			System.out.println();
			System.out.println("Play again? true/false");
			keepPlaying = input.nextBoolean();
		} while (keepPlaying == true);
		System.out.println();
		System.out.println("~~~Thanks for playing!~~~");
		System.out.println();
	}

}
