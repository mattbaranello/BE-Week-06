package week6JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
		
		List<Card> hand = new ArrayList<Card>();
		
		int score = 0;
		String name;
		
		//Sets the name and score values for the players
		public Player(String name) {
			this.name = name;
			this.score = 0;
		}
		
		//Prints out the each player's name as well as what card they played from their hand
		public void describe() {
			System.out.println(name);
			for (Card card : hand) {
				card.describe();
			}
		}
		
		//Flips over the top card in the hand
		public Card flip() {
				Card card = hand.get(0);
				hand.remove(0);
				return card;
		}
		
		//Draws the top card from the deck
		public void draw(Deck deck) {
		    Card drawnCard = deck.draw();
		    hand.add(drawnCard);
		}
		
		//Increments each player's score if their card wins
		public void incrementScore() {
			this.score++;
		}
		
		//Returns the name of the player
		public String getName() {
			return name;
		}
		
		//Returns each player's score
		public int getScore() {
			return score;
		}

}
