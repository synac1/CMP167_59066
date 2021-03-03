import java.util.Scanner;

public class LoginProgramV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int i;
		String pwd =  "1234";
		for( i = 0; i < 5; ++i) {
			System.out.println("Enter password: ");
			String password =  scanner.next();
			if (password.equals(pwd) ) {
				System.out.println("welcome");
				break;
			}
		}
		
		if(i == 5 ) {
			System.out.println("Your account has been locked out");
		}
	
	}
}
