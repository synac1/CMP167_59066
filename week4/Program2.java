//Write a program that prints out all the cubes from 1 to n
//where n is given by the user
//Must use a while loop  
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double counter= 1.0;
		System.out.println("Enter  number");
		int userNum = scnr.nextInt();
		while(counter<userNum) {
			System.out.println(Math.pow(counter, 3.0));
			counter +=1.0;
		}
	}
}
