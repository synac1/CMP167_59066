//Login Program 
//Ask the user for their credential
//compare user's input to the original password and username
//If the user enters the correct credentials print the correct message
//else print access denied
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner( System.in );

		File fileCred = new File("C:\\Users\\Yanil\\Desktop\\credentials.txt"); //accessing

		Scanner sc = new Scanner(fileCred); // Reading 

		String storedUser = sc.nextLine();
		String storedPwd  = sc.nextLine();
		//Input
		System.out.println("Welcome to Login 360");
		System.out.print("Enter Username: ");
		String username = keyboard.next();
		System.out.print("Enter Password: ");
		String password = keyboard.next();

		if(username.equals(storedUser) && password.equals(storedPwd)) 
			
			System.out.println("Access successful");

		else {
			System.out.println("Access Denied"); }
		}
}
