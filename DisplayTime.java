package myjavaprograms;

import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter an integers for seconds: ");
		int seconds = input.nextInt();
		
		//Find minutes
		int minutes = seconds/60;
		
		//Seconds remaining
		int remaining_seconds = seconds%60;
		
		//Display results
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remaining_seconds + " seconds");

	}

}
