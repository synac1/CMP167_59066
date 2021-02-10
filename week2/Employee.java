

/**
 * 
 * @author yanil
 *
 */
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		//Declaring variables
		String name;
		double salary;
		double paid;
	    double moneyBalance;
		
		System.out.println("Welcome");
		//assigning 
		salary = 8000.78f;
		paid = 0;
		moneyBalance = 20000f;
		
		/*
		 %d integer
		 %f floating point numbers
		 %s String
		 %c char
		 %% %
		 %n newline
		 flag, width, precision points, specifier
		 0, -, +
		 Width: amount of char 
		 .2 how many decimal places after the point
		 d, f, s, c  
		 %-20.2f  left justified, 20 characters, 2 decimal points
		  		//System.out.print();
		 */
		System.out.println("Enter name: ");
		name = sc.next(); //waits for the user to enter input 
		
		System.out.printf("Hello, %s, preparing profile..,%nbalance:%.2f", name, moneyBalance);
		
		
		// Modify this  Employee class so that the program displays
		// all the user's information in a well formatted way 
		//and asks the user for the amount to pay to this employee
		//then adds this amount to the the paid and the moneyBalance
		//Display the updated information at the end
		
		
		
		
		
	}
}
