/**
 * 
 * utilizes different subroutines to return a mathematical calculation  
 * 
 * due date     20220506
 * @filename    MathCalculator.java
 * @author      Sadiksha Dahal
 * 
 * */

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

 
public class MathSubroutines {
	
	public static double rectArea(double base, double height) {
		double area = base*height;
		return area;
	}
	
	public static double rectPerim(double base, double height) {
		double perim = (base+height)*2;
		return perim;
	}
	
	public static double triArea(double base, double height) {
		double area = (base*height)/2;
		return area;
	}
	
	public static double circArea(double radius) {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public static double cirCirc(double radius ) {
		double circ = Math.PI*2*radius;
		return circ;
	}
	
	public static double calcMean(double n1, double n2, double n3, double n4, double n5) {
		double mean = (n1+n2+n3+n4+n5)/5;
		return mean;
	}
	
	public static double calcMed(double n1, double n2, double n3, double n4, double n5) {
		double[] values = {n1, n2, n3, n4, n5};
		Arrays.sort(values);
		double med = values[2];
		return med;
	}
	
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		Scanner userReply  = new Scanner (System.in);
		
		int decision = 0;
		
    	while(decision != 8) {
    		
    		System.out.println("=============================================================");
        	System.out.println("\t\t Random Math Calculations!" );
        	System.out.println("=============================================================");
        	System.out.println("\tEnter the option you would like to execute:\n");
        	System.out.println("1. Calculate area of a rectangle");
        	System.out.println("2. Calculate perimeter of a rectangle");
        	System.out.println("3. Calculate area of a triangle");
        	System.out.println("4. Calculate area of a circle");
        	System.out.println("5. Calculate circumference a of a circle");
        	System.out.println("6. Calculate the mean of five numbers");
        	System.out.println("7. Calculate the median of five numbers");
        	System.out.println("8. Exit the program");
        	
            decision = userReply.nextInt();

    		if(decision == 1) {

    			System.out.println("Please enter the base length of your rectangle in metres: ");
    			double base = userReply.nextDouble();
    			System.out.println("Please enter the base height of your rectangle in metres: ");
    			double height = userReply.nextDouble();
    			
    			double area = rectArea(base, height);
    			System.out.println("The area of your rectangle is: " + df.format(area) + "m²");
    			
    			
    			
    		} else if(decision == 2) {
    			System.out.println("Please enter the base length of your rectangle in metres: ");
    			double base = userReply.nextDouble();
    			System.out.println("Please enter the base height of your rectangle in metres: ");
    			double height = userReply.nextDouble();
    			
    			double perim = rectPerim(base,height);
    			System.out.println("The perimeter of your rectangle is: " + df.format(perim) + "m");

    		} else if(decision == 3) {
    			System.out.println("Please enter the base length of your triangle in metres: ");
    			double base = userReply.nextDouble();
    			System.out.println("Please enter the base height of your triangle in metres ");
    			double height = userReply.nextDouble();
    			
    			double area = triArea(base,height);
    			System.out.println("The area of your triangle is: " + df.format(area) + "m²");

    		} else if(decision == 4) {
    			System.out.println("Please enter the radius of your circle in metres: ");
    			double radius = userReply.nextDouble();
    					
    			double area = circArea(radius);
    			System.out.println("The area of your circle is: " + df.format(area) + "m²");

    		} else if(decision == 5) {
    			System.out.println("Please enter the radius of your circle in metres: ");
    			double radius = userReply.nextDouble();
    					
    			double circ = cirCirc(radius);
    			System.out.println("The circumference of your circle is: " + df.format(circ) + "m");
    			
    		} else if(decision == 6) {
    			System.out.println("Please enter your first number: ");
    			double n1 = userReply.nextDouble();
    			
    			System.out.println("Please enter your second number: ");
    			double n2 = userReply.nextDouble();

    			System.out.println("Please enter your third number: ");
    			double n3 = userReply.nextDouble();

    			System.out.println("Please enter your fourth number: ");
    			double n4 = userReply.nextDouble();

    			System.out.println("Please enter your fifth number: ");
    			double n5 = userReply.nextDouble();

    			double avg = calcMean(n1,n2,n3,n4,n5);
    			System.out.println("The average or mean of your five numbers is "+ avg);
    		
    		} else if(decision == 7) {
    			System.out.println("Please enter your first number: ");
    			double n1 = userReply.nextDouble();
    			
    			System.out.println("Please enter your second number: ");
    			double n2 = userReply.nextDouble();

    			System.out.println("Please enter your third number: ");
    			double n3 = userReply.nextDouble();

    			System.out.println("Please enter your fourth number: ");
    			double n4 = userReply.nextDouble();

    			System.out.println("Please enter your fifth number: ");
    			double n5 = userReply.nextDouble();

    			double median = calcMed(n1,n2,n3,n4,n5);
    			System.out.println("The median of your five numbers is "+ median);

    		} else if(decision == 8) {
    		
    		} else {
    			System.out.println("Please enter a valid single digit option.");
    		}
    	}
    	
		System.out.println("bye!");

	}

}
