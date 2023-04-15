package week6JavaFinalCodingProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player("Matt");
		Player player2 = new Player("Joe");
		Deck deck = new Deck();
		
		deck.shuffle();
		
		//Adding to the deck
		for (int i = 1; i <= 26; i++) {
			player1.hand.add(deck.draw());
			player2.hand.add(deck.draw());
		} 
		
		//Flips each players' card over
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			System.out.println(player1.getName() + " plays ");
			player1Card.describe();
			System.out.println(player2.getName() + " plays ");
			player2Card.describe();
			
			//Compares player cards to each other.
			if (player1Card.getRank() > player2Card.getRank())  {
				player1.incrementScore();
				System.out.println(player1.getName() + " wins!");
				System.out.println();
			} else if (player1Card.getRank() < player2Card.getRank()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " wins!");
				System.out.println();
		} else {
			System.out.println("Draw!");
			System.out.println();
		}
		
		//Determines the winner of the game by comparing scores.
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " wins!");
		} else {
			System.out.println("It's a draw!");
		}
		
			
		}
	}

}
