// Write a program that is going ask the user for a number and displays the table of multiplication of the n*n
//Also asks the user if they want to do it again 
//if user says no, print goodbye
// if user says yes, start the process and ask for the number and display new table

import java.util.Scanner;
public class Exercise {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		displayTable();
	}
	
	public static int getNumber() {
		System.out.println("Enter a number : ");
		return input.nextInt();
	}
	
	public static String getAnswer() {
		System.out.println("Do you want to do it again?");
		return input.next();
	}
	
	 public static void display(String message) {
		 System.out.println(message);
	 }
	 
	public static void displayTable() {
		
		String answer = "";
		do {
			int number = getNumber();

			for(int i = 1 ; i <= number ; i++ ) {
				for( int j = 1; j <= number; j++) {
					System.out.print(i*j+"\t");
				}
				System.out.println();
			}
			answer = getAnswer();
		}while(answer.equalsIgnoreCase("yes"));
		
		display("Good Bye Friend");
	}
}
