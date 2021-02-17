/**
 * 
 * @author yanil
 *
 */
import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int celsius = 30;
		
		System.out.println("Hello, would you like to know the temp? ");
		String answer = sc.next();
		//if - else
		if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")) {
			
			System.out.printf("The temperature is: %d degrees celsius%n", celsius);
			
		}
		else {
			System.out.println("Aww, OK");
		}
		
		System.out.println("Please enter temperature in your favorite country");
		celsius = sc.nextInt();
		if(celsius > 35) {
			System.out.println("It is hot there");
		}
		else if (celsius > 25  ) {
			System.out.println("It is chilly");
		}
		else if ( celsius > 10) {
			System.out.println("It is a bit cold");
		}
		else {
			System.out.println("It is very cold");
		}
		
	}
}
