/*returns a square, cube, or number
 * 
 * due date  20220401
 * @filename AdventureTime
 * @author   Sadiksha Dahal
 */

import java.util.Scanner;

public class CubesSquaresPowers {

	public static void main(String[] args) {
		
		final int POWER_TWO = 2;
		final int POWER_THREE = 3;
		
		Scanner userReply = new Scanner(System.in);
		int choice = 0;
		
		while(choice != 4) {
			System.out.println("\n===========================================================================");
			System.out.println("                        CUBES AND SQUARES AND POWERS");
			System.out.println("===========================================================================");
			System.out.println("     Select one of the following options, enter '1', '2', '3' or '4'");
			System.out.println("     1... Find the value of a number squared (NOTE: 2² = 2 x 2)");
			System.out.println("     2... Find the value of a number squared (NOTE: 2³ = 2 x 2 x 2)");
			System.out.println("     3... Find the value of a number to any power");
			System.out.println("     4... EXIT");
			System.out.print("\n     Enter option number: ");
			
			choice = userReply.nextInt();
			
			if(choice == 1) {

				System.out.print("\n     Enter the number you would like to square: ");	
				int square = userReply.nextInt();
				
				System.out.println("     The number " + square + " squared is " + (int)(Math.pow(square, POWER_TWO)));
				
			} else if(choice == 2) {
				
				System.out.print("\n     Enter the number you would like to cube: ");	
				int cube = userReply.nextInt();
				
				System.out.println("     The number " + cube + " cubed is " + (int)(Math.pow(cube, POWER_THREE)));

			} else if(choice == 3) {

				System.out.print("\n     Enter the number you would like to raise to a power(the base): ");	
				int base = userReply.nextInt();
				
				System.out.print("\n     Enter the power: ");	
				int power = userReply.nextInt();
				
				System.out.println("     The number " + base + " raised to the power of " + power + " is " + (int)(Math.pow(base, power)));
			} else if(choice ==4){
				
			}
			else {
				System.out.println("\n              ============================================\n"
						+ "                    INVALID INPUT - PLEASE TRY AGAIN \n"
						+ "              ============================================\n");
			}
		
		}
		
		System.out.println("\tno more cubes, squares, and powers for you ... weirdo.");
		System.out.println("\tBAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");

	}

}
