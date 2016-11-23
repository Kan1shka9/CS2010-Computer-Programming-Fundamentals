/**
 * Write a Java application that implements a two-player game of Tic Tac Toe.
 * Use a two-dimensional array of chars to represent the board. Use blanks rather than null values to represent unoccupied squares. You can create the board as follows (note that there are blanks between the single quotes, even though this may not be clear in your browser): 
 * char [][] board ={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
 * Create an enum called Player whose possible values are "X" and "O". Use a variable called turn, whose data type is Player, to keep track of which player should move next. Each time a player moves, toggle the value of turn to indicate that the turn has changed; if the value was "X", set it to "O", otherwise set it to "X".
 * For each move, show the current state of the board, indicate whose turn it is, and ask for the next move. You may use either Console or JOptionPane I/O, but do not mix them. There are various reasonable formats for the input, but one possibility is to ask separately for the row and column of the square the user wants to occupy.
 * Use the user input to update the board. Do not allow moves to squares that are already occupied.
 * This is the hard part. After each move, run a method that determines whether or not a player has won the game. Consider all eight possible ways to win. If a player has won, provide output that indicates the victor.
 */

package Homework1;

import java.util.*;

public class Lab4 { 
	
	// Create the tic tac toe board
	public static char [][] board ={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	
	// Initialize the game
	public static void initializeGame() {
		for (int i = 0; i < 3; i++) {
			for (int p = 0; p < 3; p++) {
				board[i][p] = ' ';
			}
	    }
	}
	
	// Check if the entered row and column value is between 0 and 2
	public static boolean isLegal(int row, int column) {
        if ((row > 2 || column > 2) || (row < 0 || column < 0)) {
            return true;
        } else if (board[row][column] == 'x' || board[row][column] == 'o') {
            return true;
        }
        return false;
    }
	
	// Update the board
	public static void updateBoard(char player, int row, int column) {
		board[row][column] = player;
    }
	
	// Display the board to the console
	public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
	
	// Create the players using enum X, O
	public static enum Player {
		X('X'), O('O');
		
		char alpha;
		Player(char a) {
			alpha = a;
		}
		char fillalpha() {
			return alpha;
		} 
	}
		
	// Toggle Player
	public static char togglePlayer(char player) {
		return player == 'o' ? 'x' : 'o';
	}

	// Checking if X won or O won
	public static boolean checkWinner() {
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && (board[0][0] == 'x' || board[0][0] == 'o')) {
            return true;
        } else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && (board[0][1] == 'x' || board[0][1] == 'o')) {
            return true;
        } else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && (board[0][2] == 'x' || board[0][2] == 'o')) {
            return true;
        } else if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && (board[0][0] == 'x' || board[0][0] == 'o')) {
            return true;
        } else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && (board[1][0] == 'x' || board[1][0] == 'o')) {
            return true;
        } else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && (board[2][0] == 'x' || board[2][0] == 'o')) {
            return true;
        } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && (board[0][0] == 'x' || board[0][0] == 'o')) {
            return true;
        } else if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && (board[2][0] == 'x' || board[2][0] == 'o')) {
            return true;
        } else {
            return false;
        }
    }
	
	// Check if the game is a draw
	public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                if (board[i][p] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		int row;
		int column;
		char player = 'o';
		
		initializeGame();
		System.out.println("Game ready !\n");
		
		while (true) {
			player = togglePlayer(player);
			System.out.print("\n" + player + " ,choose the location (row, column): ");
            row = k.nextInt();
            column = k.nextInt();
            
            while (isLegal(row, column)) {
                System.out.println("This slot is taken or the row/column value is inappropriate. Please try again (row, column). ");
                displayBoard();
                row = k.nextInt();
                column = k.nextInt();
            }
            
            updateBoard(player, row, column);
            displayBoard();
            
            if (checkWinner()) {
            	System.out.println("\nThe winner is " + player + " !");
                break;
            }
            
            if (checkDraw()) {
                System.out.println("\nThe game is a tie !");
                break;
            }   
		}
		k.close();
	}	
}