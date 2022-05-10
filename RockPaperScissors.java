/**
 * 
 * simple rock paper scissors game that returns game statistics 
 * 
 * due date     20220506
 * @filename    RockPaperScissors.java
 * @author      Sadiksha Dahal
 *
 **/

import java.util.Scanner;


public class RockPaperScissors {
	
	static Scanner userInput = new Scanner(System.in);
	
	static int roundsWon;
	static int roundsLoss;
	static int roundsTie;
	
	static int numMoveR;
	static int numMoveP;
	static int numMoveS;
	
	static String [] gameResult = {"", "", "", "", ""};
	static String [] totalMoves = {"", "", "", "", ""};
	
	static final int NUM_ROUNDS = 5;
	
	static boolean running = true;
	static boolean fiveRounds = false;
	
	
	public static void displayMenu() {
		
		System.out.println("========================================");
		System.out.println("\t Rock Paper Scissors!");
		System.out.println("========================================");
		System.out.println("How to play:");
		System.out.println("There are 5 rounds. Each round you will be prompted to enter either 'rock', 'paper', or 'scissors'\n"
				+ "The computer's move will then get displayed to you alongside a message stating if you won, lost or tied the round.\n"
				+ "After five rounds, some game stats will be shown to you, as well as a message asking if you want to play again!");
		System.out.println("========================================");
		System.out.println("Rules:");
		System.out.println("Rock beats scissors.\n"
				+ "Scissors beat paper.\n"
				+ "Paper beats rock");
		System.out.println("========================================");

	}
	
	
	public static String getUserMove() {
		
		System.out.println("Please enter your move ('rock', 'paper', 'scissors'):");
		String userMove = userInput.next();
		
		return userMove;
	}
	
	
	public static String getCompMove() {
		
		final int MIN = 1;
		final int MAX = 3;
		
		String compMove = "";
		int randMove = (int)Math.floor(Math.random()*(MAX)+MIN);
		
		if(randMove == MIN) {
			
			compMove = "Rock";
			
		} else if (randMove == MAX) {
			
			compMove = "Paper";
			
		} else {
			
			compMove = "Scissors";
			
		}
		
		System.out.println("The computer chose: " + compMove);
		
		return compMove;
	}

	
	public static String roundResult (String player, String comp) {
		
		String round = "";
		
		if(player.equalsIgnoreCase("rock") && comp.equalsIgnoreCase("scissors")||
		   player.equalsIgnoreCase("paper") && comp.equalsIgnoreCase("rock") || 
		   player.equalsIgnoreCase("scissors") && comp.equals("paper")) {
			
			round = "Win";
			System.out.println("This round was a " + round + " for you!");
			
		} else if(player.equalsIgnoreCase("scissors") && comp.equalsIgnoreCase("rock")||
				  player.equalsIgnoreCase("rock") && comp.equalsIgnoreCase("paper") || 
				  player.equalsIgnoreCase("paper") && comp.equals("scissors")) {
			
			round = "Loss";
			System.out.println("This round was a " + round + " for you!");

		} else if(player.equalsIgnoreCase(comp)){
			
			round = "Tie";
			System.out.println("This round was a " + round + " for you!");
			
		} else {
			
			System.out.println("You entered an invalid move! Please rerun the program.");
			
		}
		
		return round;
	}
	
	
	public static void moveStats(String [] array) {
		
		for(int i = 0; i < NUM_ROUNDS; i++) {
			if(array[i].equalsIgnoreCase("rock")) {
				
				numMoveR++;
				
			} else if (array[i].equalsIgnoreCase("paper")) {
				
				numMoveP++;
				
			} else {
				
				numMoveS++;
				
			}
		}
		
		System.out.println("=================================================");
		System.out.println("Number of times you played rock: " + numMoveR);
		System.out.println("Number of times you played paper: " + numMoveP);
		System.out.println("Number of times you played scissors: " + numMoveS);
		System.out.println("=================================================");
	}
	
	
	public static void gameStats(String [] array) {
		for(int i = 0; i < NUM_ROUNDS; i ++) {
			if(array[i].equalsIgnoreCase("Win")) {
				
				roundsWon++;
				
			} else if (array[i].equalsIgnoreCase("Loss")) {
				
				roundsLoss++;
				
			} else {
				
				roundsTie++;
				
			}
		}
		
		System.out.println("Number of rounds you won: " + roundsWon);
		System.out.println("Number of rounds you lost: " + roundsLoss);
		System.out.println("Number of rounds you tied: " + roundsTie);
		System.out.println("=================================================");
	}
	
	
	public static String playAgain() {
		
		System.out.println("Do you want to play again? [Type 'Y' for yes or 'N' for no]");
		String userReply = userInput.next();
		
		return userReply;
	}
	
	
	public static void main(String[] args) {

		while(running) {
			
			displayMenu();
				
			for(int rounds = 0; rounds < NUM_ROUNDS; rounds++) {
					
				String userMove = getUserMove();					
				String compMove = getCompMove();
				String result = roundResult (userMove, compMove);
					
				totalMoves[rounds] = userMove;
				gameResult[rounds] = result;				
			}
			
			moveStats(totalMoves);
			gameStats(gameResult);
			
			running = false;
			
			String newGame = playAgain();
			
			if(newGame.equalsIgnoreCase("Y")) {
				
				running = true;
				
			} else {
				
				System.out.println("Bye!");
				
			}
				
		}
		
	}

}
