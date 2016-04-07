package day3Labs;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("Get squared away!");
		System.out.println();
		
		// Scanner to initialize user input and also check for "Y" loop
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		
		// Get input from user
		System.out.print("Enter a number from 1-10: ");
		int myNumber = sc.nextInt();
		sc.nextLine();
		
		while (choice.equalsIgnoreCase("y")) {
			
			for (int i = 1; i <= myNumber; i++) {
				
				int square = i * i;
				int cubed = i * i * i;
				
				System.out.println("Number     Squared     Cubed");
				System.out.println("======     =======     =====");
				System.out.println("" + i + "" + square + "" + cubed);
			}
			
			
			// see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
		
			
		}
sc.close();
System.out.println("Bye!");
	}

}
