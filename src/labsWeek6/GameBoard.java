package labsWeek6;

import java.util.Arrays;

public class GameBoard {

	String[] board = new String[9];
	
	public void initialize() {
		for (int i = 1; i <= 9; i++) {
			this.board[i - 1] = String.valueOf(i);
		}
		
	}
	
	public void display() {
		
		System.out.println("     +---+---+---+");
		System.out.println("     | " + this.board[0] + " | " + this.board[1] + " | " + this.board[2] + " | ");
		System.out.println("     +---+---+---+");
		System.out.println("     | " + this.board[3] + " | " + this.board[4] + " | " + this.board[5] + " | ");
		System.out.println("     +---+---+---+");
		System.out.println("     | " + this.board[6] + " | " + this.board[7] + " | " + this.board[8] + " | ");
		System.out.println("     +---+---+---+");
	}

	public boolean ifValidSetSquare(int squareNumber, String numInput, String player) {
		if (this.board[squareNumber - 1].equals(numInput)) {
			this.board[squareNumber - 1] = player;
			return true;
		} else {
			return false;
		}
		
	}
	public String checkWinStatus() {
		for (int i = 0; i <= 8; i++) {
			String winning = "";
			
			switch (i) {
			//horizontal wins
			case 0:
				winning = this.board[0] + this.board[1] + this.board[2];
				break;
			case 1:
				winning = this.board[3] + this.board[4] + this.board[5];
				break;
			case 2:
				winning = this.board[6] + this.board[7] + this.board[8];
				break;
			//diagonal wins
			case 3:
				winning = this.board[0] + this.board[4] + this.board[8];
				break;
			case 4:
				winning = this.board[2] + this.board[4] + this.board[6];
				break;
			//vertical wins
			case 5:
				winning = this.board[0] + this.board[3] + this.board[6];
				break;
			case 6:
				winning = this.board[1] + this.board[4] + this.board[7];
				break;
			case 7:
				winning = this.board[2] + this.board[5] + this.board[8];
				break;
			}
			if (winning.equals("XXX")) {
				return "X";
			} else if (winning.equals("OOO")) {
				return "O";
			}
			
		}
		for (int i = 1; i <= 9; i++) {
			if (Arrays.asList(this.board).contains(String.valueOf(i))) {
				break;
			} else if (i == 9 ) {
				return "draw";
			}
		}
		return "";
	}
	
}
