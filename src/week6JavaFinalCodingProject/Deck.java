package week6JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//Creates a list of cards
	List<Card> cards = new ArrayList<Card>();
	
	//Used two string arrays, suits and numbers, to add card information and an enhanced for loop to add each card type to the deck
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	}
	
	//Returns the list of cards
	public List<Card> getCards() {
		return cards;
	}
	
	//Sets the list of cards
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//Prints out the card information
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	//Shuffles the cards
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	//Draws a card from the deck
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
		
	}
}
	

