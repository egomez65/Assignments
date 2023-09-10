
/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: This program prompts the user to guess the number the program is 
 * “thinking” of by printing statements that gives the user instructions, collects, and then stores the 
 * input. This input is then used to determine the number of correctly guessed colors by the user as 
 * well as to relay the user’s information back to them at the end of the program.
 * Due: o9/05/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or 
 * any source. I have not given my code to any student.
 * Print your Name here: Ema Gomez
*/

import java.util.Scanner;
import java.util.Random;
public class ESPGame {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Random randomNumbers= new Random();
		int colorNumber;
		String userColor="";
		String computerColor="";
		int correct=0;
		String name="";
		String description="";
		String due="";
		int round=1;
		final String COLOR_RED = "Red";
		final String COLOR_BLUE = "Blue";
		final String COLOR_YELLOW = "Yellow";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_GREEN = "Green";
		final String COLOR_PURPLE = "Purple";
		final String COLOR_PINK = "Pink";
		
		
		System.out.print("Enter your name: ");
		name=scanner.nextLine();
		System.out.print("Describe yourself: ");
		description=scanner.nextLine();
		System.out.print("Due Date: ");
		due=scanner.nextLine();
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		
		while(round<=10) {
			System.out.println("Round "+round);
			System.out.println("");
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Blue, Yellow, Orange, Green, Purple, or Pink?");
			System.out.println("Enter your guess: ");
			userColor=scanner.nextLine();
			System.out.println("");
			
			
			while(!userColor.equals(COLOR_RED.toLowerCase()) && !userColor.equals(COLOR_BLUE.toLowerCase()) && !userColor.equals(COLOR_YELLOW.toLowerCase()) && 
					!userColor.equals(COLOR_ORANGE.toLowerCase()) && !userColor.equals(COLOR_GREEN.toLowerCase()) && !userColor.equals(COLOR_PURPLE.toLowerCase())
					&& !userColor.equals(COLOR_PINK.toLowerCase()) && !userColor.equals(COLOR_RED) && !userColor.equals(COLOR_BLUE) && !userColor.equals(COLOR_YELLOW) && 
					!userColor.equals(COLOR_ORANGE) && !userColor.equals(COLOR_GREEN) && !userColor.equals(COLOR_PURPLE) && !userColor.equals(COLOR_PINK) && 
					!userColor.equals(COLOR_RED.toUpperCase()) && !userColor.equals(COLOR_BLUE.toUpperCase()) && !userColor.equals(COLOR_YELLOW.toUpperCase()) && 
					!userColor.equals(COLOR_ORANGE.toUpperCase()) && !userColor.equals(COLOR_GREEN.toUpperCase()) && !userColor.equals(COLOR_PURPLE.toUpperCase())
					&& !userColor.equals(COLOR_PINK.toUpperCase())) {
				System.out.println("You entered incorrect color. Is it Red, Blue, Yellow, Orange, Green, Purple, or Pink?");
				System.out.println("Enter your guess again:");
				userColor=scanner.nextLine();
			}
			
			colorNumber = randomNumbers.nextInt(6);
	        if (colorNumber == 0) {
	        	computerColor = COLOR_RED;
	        }
	        else if (colorNumber == 1) {
	        	computerColor = COLOR_BLUE;
	        }
	        else if (colorNumber == 2) {
	        	computerColor = COLOR_YELLOW;
	        }
	        else if (colorNumber == 3) {
	        	computerColor = COLOR_ORANGE;
	        }
	        else if (colorNumber == 4) {
	        	computerColor = COLOR_GREEN;
	        }
	        else if (colorNumber == 5) {
	        	computerColor = COLOR_PURPLE;
	        }
	        else if (colorNumber == 6) {
	        	computerColor = COLOR_PINK;
	        }
	     
	        System.out.println("I was thinking of "+computerColor);
	        if(userColor.toLowerCase().equals(computerColor.toLowerCase())) {
	        	correct++;
	        }
	        round++;
		}
		
		System.out.println("Game Over");
		System.out.println("You guessed "+correct+ " out of 10 colors correctly");
		System.out.println("User Name: "+name);
		System.out.println("User Description: "+description);
		System.out.println("Due Date: "+due);
		
		scanner.close();
	}

}
