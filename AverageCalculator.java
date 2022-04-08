/* *
 * calculates average of 5 assignments
 * 
 * due date  20220408
 * @filename AverageCalculator
 * @author   Sadiksha Dahal
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		
		Scanner userReply = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");

		
		double[] userMarks = new double[5];
		double avg = 0;
		double total = 0 ;

		System.out.println("==========================================================");
		System.out.println("\t\tAverage mark calculator");
		System.out.println("==========================================================");

		System.out.println("\t \nEnter your last five assignment marks, i.e. '95' or '57': ");
		for(int i = 0; i <= 4; i++) {
			userMarks[i] = userReply.nextDouble();
		}
		
		for(int i = 0; i <= 4; i++) {
			total = total + userMarks[i];
		}
		
		avg = total/5.00;
		
		System.out.println("==========================================================");
		System.out.print("\t\t Result: ");
		System.out.print("Your average is: " + df.format(avg) + "%");

		
	}

}
