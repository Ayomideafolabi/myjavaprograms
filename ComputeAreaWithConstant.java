package myjavaprograms;

import java.util.Scanner;

public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a constant
		final double PI = 3.14159;
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the users to enter the input
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//compute area
		double area = radius * radius * PI;
		
		// Display the result
		System.out.println("The area for the circle of radius " + radius + " is " + area);

	}

}
