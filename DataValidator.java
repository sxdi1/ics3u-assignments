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
			}
		}
		return value;
	}

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		final int LOCATED = 1;
		final int NOT_POS = 0;
		
		for(int stage = 0; stage < 5; stage++) {
			
			switch(stage) {
			
				case 1:
					
					final int STRING_LEN = 6;
					int decimal = 0;
					
					System.out.println("stage one");
					System.out.println("Enter a string greater than six characters");
					String replyOne = userInput.next();
					
					if(replyOne.indexOf(".") > LOCATED) {	
						decimal = 1;
					}
					
					if((replyOne.length() - decimal) < STRING_LEN) {
						stage--;
					}
					break;
					
				case 2:
					
					final String UPPER_A = "A";
					final String LOWER_A = "a";
					
					System.out.println("stage two");
					System.out.println("Enter a string that contains at least one 'a'");
					String replyTwo = userInput.next();
					
					if((replyTwo.indexOf(UPPER_A) > LOCATED) || (replyTwo.indexOf(LOWER_A) > LOCATED)  ) {
						stage--;
					}
					break;
					
				case 3:
					
					final String UPPER_Z = "Z";
					final String LOWER_Z = "z";
					
					final int MAX_VAL3 = 15;
					final int MIN_VAL3 = 5;
					
					System.out.println("stage three");
					System.out.println("Enter a string between 5 and 15 characters long that doesn't contain a 'z'");
					String replyThree = userInput.next();
					
					if(replyThree.length() < MIN_VAL3 || replyThree.length() > MAX_VAL3 && 
					  (replyThree.indexOf(UPPER_Z) > LOCATED) && replyThree.indexOf(LOWER_Z) > LOCATED) {
						stage--;
					} 
					break;
					
				case 4:
					
					final int MAX_VAL4 = 500;
					final int MIN_VAL4 = 5;	
					
					System.out.println("stage four");
					System.out.println("Enter an integer between 5 and 500");
					String replyFour = userInput.next();
					
					int value4 = intChecker(replyFour);
					if(value4 < MIN_VAL4 || value4 > MAX_VAL4) {
						stage--;
					}
					break;
					
				case 5:
										
					System.out.println("stage 5");
					System.out.println("Enter a negative integer");
					String replyFive = userInput.next();
					
					int value5 = intChecker(replyFive);
					if(value5 > NOT_POS) {
						stage --;
					}
					break;
				
				case 6:
					
					System.out.println("stage 6");
					System.out.println("Enter a positive, odd integer");
					String replySix = userInput.next();
					
					int value6 = intChecker(replySix);
					if(value6 < NOT_POS && (value6%2)!= LOCATED) {
						stage--;
					}
					break;
			}
			
		}
		
		System.out.println("Congrats, you did it!");

	}
}
