/*
 * Write three methods,  
 * 1-  A method to get 1 input from the user and return the input, empty paramerlist, return a int 
 * 2- A method that takes an int value as argument and returns the product of that value times 100
 * 3- Test the main method, and combine the methods to display the results
 */
import java.util.Scanner;
public class Exercise {
	//input method
	public static int getNumber( ) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		return number;
	}
	
	//calculation method
	public static int multiplyBy100(int value) {
		int result  = value *100;
		return result;
	}
	
	public static void main(String[] args) {
		int theNumber = getNumber();
		
		int result = multiplyBy100(theNumber);
		
		System.out.println("Result " +result);
		
	}
	
}
