//Write a program that calculates the average of the sum of all
//natural numbers from 1 up to n where n is given by the user
//Should only print the average, with 4 decimal points
//Must use a while loop
import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Please enter a natural number: ");
		int n = scanner.nextInt();
		double sum = 0.0;
		int count = 1 ;
		while(count <= n){
			sum += count++; // sum = sum + count// accumulator pattern
		}
		/*
		1. Evaluate the condition
		2. If condition is true execute the inner statements and go back to step 1
		3. If condition is false end the loop

		*/
		//count ++ or ++ count 
		//count ++ --> count = count +1   --> count += 1
		double avg = sum/n;
		System.out.printf("The average %.4f", avg);
	}
}
