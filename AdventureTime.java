import java.util.Scanner;

/* A choose your own adventure story game in which the user's goal is to obtain treasure
 * 
 * due date  20220325
 * @filename AdventureTime
 * @author   Sadiksha Dahal
 */


public class AdventureTime {

	public static void main(String[] args) {
		
		Scanner userReply = new Scanner(System.in); 
		
		String userName = null;
		String ansOne = null;
		String ansTwo = null;
		String ansThree = null;
	
		final String INCOR = "You typed a response that wasn't an option:(, try again from the beginning and respond using the letter before the bracket.";

		
		System.out.println("Welcome to the treasure hunting edition of a choose your own story game. Here are some instructions before you get started.\n"
				+ "Whenever you're asked to make a decision your options will be listed in the following format:\n"
				+ "a) Tomorrow      b) Yesterday  c) Never \n\n"
				+ "When responding, simply just type the letter before the bracket, it can be lower case or uppercase\n"
				+ "Let's give it a try:\n\n\n"
				+ "What language is this coded in?\n\n"
				+ "a) Java        b) Python        c) Html\n");
		
		String userCheck = userReply.next();
		String firstAnswer = "a";
		
		if(userCheck.equalsIgnoreCase(firstAnswer)) {
			System.out.print("Well done! All you need to do to begin is type your name: ");
			userName = userReply.next();
		} else if(userCheck.equalsIgnoreCase("b") || userCheck.equalsIgnoreCase("c")) {
			System.out.print("Oops! Wrong language but it seems like you've got the hang of this!\n"
					+ "All you need to do to begin is type your name: \n");
			userName = userReply.next();
		} else {
			System.out.println("Hmm, this isn't a valid option. Rerun the program and carefully read the instructions");
			System.exit(1);
		}
		
		
		System.out.println("\nYou wake up one morning and realize you're not at home. You're stuck in the middle of nowhere!\n"
				+ "All you see before you is a huge body of water that seems like it extends on forever, and ever, and EVER!\n"
				+ "You look down and notice a note on the ground, it states the following:\n"
				+ "'Hello " + userName + " , every decision you make from this point on will lead you to treasure or doom.\n"
				+ "Turn this sheet over and follow the map to begin your adventure.'\n");
		
		
		System.out.println("After following the path on the map, you see two boats in front of you,\n"
				+ "one of them has a red sail, while the other has a blue sail. Which boat will you take?\n\n"
				+ "a) red boat     b) blue boat\n");
		ansOne = userReply.next();		
		
		if(ansOne.equalsIgnoreCase("a")) {
			System.out.println("After getting on the red boat, you notice there is lots and lots of food, enough to feed you for weeks!\n"
					+ "As you continue rowing on, you notice the water in front of you splits into two directions and a sign reads:\n"
					+ "'CAREFUL! one of these paths lead to VERY deep water.'\n"
					+ "Do you take the right path or the left?\n"
					+ "a) right path     b) left path\n");
			ansTwo = userReply.next();
			
			if(ansTwo.equalsIgnoreCase("a")) {
				System.out.println("Oh no! You've steered yourself towards the deepest part of the water.\n"
						+ "Unfortunately, your ship is too heavy and will start sinking soon. \n"
						+ "Will you jump off the boat?\n"
						+ "a) Yes!      b) No!\n");
				ansThree = userReply.next();
						
				if(ansThree.equalsIgnoreCase("a")){
					System.out.println("Lucky for you, you're able to swim to safety and survive. Unfortunately, you were unable to find the treasure.");
				} else if(ansThree.equalsIgnoreCase("b")) {
					System.out.println("You thought your ship would be able to hold the weight of one person. \n"
							+ "To your surprise, Amanda had been hiding in your ship all along! Unable to hold the weight of two people, \n"
							+ "the boat flips over, leaving your last moments to be drowining with Amanda. ");
				} else {
					System.out.println(INCOR);
				}
				
			} else if(ansTwo.equalsIgnoreCase("b")) {
				System.out.println("You continue travelling on the left path, when suddenly you notice a boat near you.\n"
						+ "Do you head towards the boat? \n"
						+ "a) YES!      b) No, not a good idea...\n");
				ansThree = userReply.next();
				
				if(ansThree.equalsIgnoreCase("a")) {
					System.out.println("When approaching the nearby boat you notice something shining...\n"
							+ "You realize it's a treasure chest! WOOOHOOOO YOU FOUND THE TREASURE PURRRRR");
				} else if(ansThree.equalsIgnoreCase("b")) {
					System.out.println("The ship you had decided to avoid begins to speed towards you...\n"
							+ "It's destroying everything in its path including you, " + userName);
				} else {
					System.out.println(INCOR);
				}
			}
			
		} else if(ansOne.equalsIgnoreCase("b")) {
			System.out.println("You get on the blue boat only to notice that the wood is extremely thin and you doubt it'll hold you up.\n"
					+ "Despite your fear, the thought of obtaining treasure makes you debate what to do. \n"
					+ "Do you decide to continue straight or head back to where you started?\n"
					+ "a)I'm not afraid. Let's go straight!       b)I don't trust this boat, I'm going back. \n");
			ansTwo = userReply.next();
			
			if(ansTwo.equalsIgnoreCase("a")) {
				System.out.println("You decide to keep going. Unfortunately for you, the flimsy boat is not the only obstacle you face.\n"
						+ "The largest wave you have ever seen is rushing right towards you. \n"
						+ " Do you turn back now or have you already commited to getting some treasure.\n"
						+ "a)Maybe I am a little afraid... let's go back     b)I'd rather die trying, let's get this treasure!\n");
				ansThree = userReply.next();
				
				if(ansThree.equalsIgnoreCase("a")) {
					System.out.println("You return to shore safely. However, you remain broke and treasure less");
				} else if(ansThree.equalsIgnoreCase("b")) {
					System.out.println("The giant wave gets closer and closer...\n"
							+ "It sucks you in! But to your surprise, you have been lead to a room of treasure! WOOHOO YOU WIN");
				} else {
					System.out.println(INCOR);
				}
				
			} else if(ansTwo.equalsIgnoreCase("b")) {
				System.out.println("You head back to shore afraid. AFRAID AND POOR!");
			} else {
				System.out.println(INCOR);
			}
					
		}
		
		System.out.println("\n Game Over!");

	}
}
