package myjavaprograms;

import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		
		//Prompt the users to enter three number
		System.out.print("Enter the three numbers: ");
		double numberone = input.nextDouble();
		double numbertwo = input.nextDouble();
		double numberthree = input.nextDouble();
		
		//Compute average
		double average = (numberone + numbertwo + numberthree)/3;
		
		//Display results
		System.out.println("The average of "+ numberone + ", " + numbertwo +", " + numberthree + " is " + average + ".");

	}

}
