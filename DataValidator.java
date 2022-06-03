/**
 * 
 * validates inputed data 
 * 
 * due date     05/13/2022
 * @filename    DataValidator.java
 * @author      Sadiksha Dahal
 *
 **/

import java.util.Scanner;

public class DataValidator {
	
	public static int intChecker(String reply) {
		
		boolean valid = false;
		int value = 0;
		
		while(valid == false) {
			
			try {
				
				value = Integer.parseInt(reply);
				valid = true;
				
			} catch (NumberFormatException e) {
				
				System.out.println("Sorry, that's an invalid input. Try again.");
				valid = true; 
				
			}
		}
		
		return value;
	}

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		final int STAGE_NUMS = 7;
		final int ZERO = 0;
		final int EVEN = 2;
		
		
		System.out.println("This data validation program will take you through six stages of prompts.\n"
				+ "Once a stage has been completed, you will advance to the next stage.\n"
				+ "After all six stages are complete, a congratulatory message will be displayed.");
		
		for(int stage = 0; stage < STAGE_NUMS; stage++) {
			
			switch(stage) {
			
				case 1:
					
					final int STRING_LEN = 6;
					
					System.out.println("");
					System.out.println("===========================================");
					System.out.println(" \t   S T A G E     O N E ");
					System.out.println("===========================================");

					System.out.print("Enter a string greater than six characters: ");
					String replyOne = userInput.next();

					if(replyOne.length() < STRING_LEN) {
						stage--;
						System.out.println("Not quite.");
					} else {
						System.out.println("Nice!");
					}
					break;
					
				case 2:
					
					final String LOWER_A = "a";
					
					System.out.println("");
					System.out.println("===========================================");
					System.out.println(" \t   S T A G E     T W O ");
					System.out.println("===========================================");
					
					System.out.print("Enter a string that contains at least one lowercase 'a': ");
					String replyTwo = userInput.next();
					
					if(!replyTwo.contains(LOWER_A)) {
						stage--;
						System.out.println("Oop! Give it another shot.");
					} else {
						System.out.println("Keep it up!");
					}
					break;
					
				case 3:
					
					final String UPPER_Z = "Z";
					final String LOWER_Z = "z";
					
					final int MAX_VAL3 = 15;
					final int MIN_VAL3 = 5;
					
					System.out.println("");
					System.out.println("===========================================");
					System.out.println(" \t   S T A G E     T H R E E ");
					System.out.println("===========================================");
					
					System.out.print("Enter a string between 5 and 15 characters long that doesn't contain a 'z': ");
					String replyThree = userInput.next();
					
					if(replyThree.contains(LOWER_Z) || replyThree.contains(UPPER_Z)) {
						stage--;
						System.out.println("Nice... try.");
					} else if(replyThree.length() < MIN_VAL3 || replyThree.length() > MAX_VAL3) {
						stage--;
						System.out.println("Nice... try.");
					} else {
						System.out.println("Halfway done.");
					}
					break;
					
				case 4:
					
					final int MAX_VAL4 = 500;
					final int MIN_VAL4 = 5;	
					
					System.out.println("");
					System.out.println("===========================================");
					System.out.println(" \t   S T A G E     F O U R ");
					System.out.println("===========================================");

					System.out.print("Enter an integer between 5 and 500: ");
					String replyFour = userInput.next();
					
					int value4 = intChecker(replyFour);
					if(value4 < MIN_VAL4 || value4 > MAX_VAL4) {
						stage--;
						System.out.println("Nope.");
					} else {
						System.out.println("Slay!");
					}
					break;
					
				case 5:
					
					System.out.println("");					
					System.out.println("===========================================");
					System.out.println(" \t   S T A G E     F O U R ");
					System.out.println("===========================================");
					
					System.out.print("Enter a negative integer: ");
					String replyFive = userInput.next();
					
					int value5 = intChecker(replyFive);
					if(value5 >= ZERO) {
						stage--;
						System.out.println("Try again");
					} else {
						System.out.println("As you should.");
					}
					break;
				
				case 6:
					
					System.out.println("");
					System.out.println("===========================================");
					System.out.println(" \t   S T A G E     F O U R ");
					System.out.println("===========================================");
					
					System.out.print("Enter a positive, odd integer: ");
					String replySix = userInput.next();
					
					int value6 = intChecker(replySix);
					if(value6 < ZERO) {
						stage--;
						System.out.println("So close.");
					} else if (value6 % EVEN == ZERO) {
						stage--;
						System.out.println("So close.");
					} else {
						System.out.println("Yassss!");
					}
					break;	
			}	
		}
		
		System.out.println("");
		System.out.println("===========================================");
		System.out.println(" \t   C O N G R A T S !");
		System.out.println("===========================================");
		System.out.println("YOU DID IT!");

	}
}
