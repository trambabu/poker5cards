package com.game.poker.deck.service;

import org.springframework.stereotype.Service;

import com.game.poker.card.Card;

@Service
public interface DeckService {

	
	public Card getCard();
	public void shuffle();
	public String toString();
}
