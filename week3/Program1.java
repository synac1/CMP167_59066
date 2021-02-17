import java.util.Scanner;

//Write a program that asks the user for an integer and prints out the absolute value
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an Integer:");
		//input
		int userVal = sc.nextInt();
		//process
		if(userVal <0) {
			userVal = -userVal;
		}
		//output
		System.out.println(userVal);
	}
	
}
