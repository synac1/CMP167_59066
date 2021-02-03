/**
 * 
 * @author Yanilda
 * created: 2/3/21
 *
 **/
import java.util.Scanner;
public class SumOfTwo {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);// Scanner object to get input from users
		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt(); //waits for the enter an int num, store number
		System.out.print("Enter Second number: ");
		int secondNum = sc.nextInt(); //waits for the enter an int num, store number
		
		//process
		int result  = firstNum + secondNum;
		
		//output
		System.out.println("Result: "+ result);
		
		
	}
}
