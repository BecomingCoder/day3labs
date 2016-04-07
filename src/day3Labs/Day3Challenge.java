package day3Labs;

import java.util.Scanner;

public class Day3Challenge {

	public static void main(String[] args) {
		
		//Welcome message to user
		System.out.println("Welcome to the Exponential Machine");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base number:      ");
		int myNumber = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the exponent:     ");
		int myExponent = Integer.parseInt(sc.nextLine());
		
		int total = 1;
		
		for (total = 1 ; total <= myExponent; total++ ); {
			total = total * myNumber;
			System.out.print("The Answer is       " + total);
			
			
		}
	

	}

}
