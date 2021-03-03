//Write a program that welcomes the user and ask their name
//then ask the user for 3 numbers and print out the product and the sum of those numbers
import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		System.out.println("Hello this is a cool program");
		
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		
		
		System.out.println("Ok "+name+", now enter 3 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//process
		int product = num1*num2*num3;
		int sum 	= num1+num2+num3;
		
		//output
		System.out.println("The product is: "+product);
		System.out.println("The product is: "+sum);
		
	}

}
