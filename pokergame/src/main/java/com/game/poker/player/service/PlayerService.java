package com.game.poker.player.service;

import com.game.poker.card.Card;

public interface PlayerService {

	public void createHand();
	
	public Card[] sort();
	
	public String showHand();
	
	public void replaceFirstCard();

	public void replaceSecondCard();

	public void replaceThirdCard();

	public void replaceFourthCard();

	public void replaceFifthCard();
	
	// methods for evaluating player's hand
		public boolean isRoyalFlush() ;

		public boolean isStraightFlush() ;

		public boolean is4OfAKind();
		
		public boolean is3OfAKind();

		public boolean isFullHouse() ;

		public boolean isFlush();

		public boolean isStraight() ;

		public boolean isTriple();

		public boolean is2Pair() ;

		public boolean is1Pair();

		public String highCard();
}
