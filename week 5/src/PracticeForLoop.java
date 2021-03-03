/**
 * 
 * @author Yanilda
 *
 */
public class PracticeForLoop {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int  i = 1 ; i <= 5 ; ++i) {
			sum += i;
		}
		
		System.out.println("Sum: "+sum); // 15
		sum = 0;
		
		for(int  i = 100 ; i <= 500 ; i += 100) {
			sum += i;
		}
		System.out.println("Sum: "+sum);
		
		int n = 15;
		System.out.println("Multiplication table of n");
		for (int i = 1; i <= n ; i++) {
			for(int j = 1; j <= n ; j++ ) {
				System.out.print(j*i + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i < n ; i ++) {
			for(int j = 1; j < i ; j ++ ) {
				System.out.print( "*" +" " );
			}
			System.out.println();
		}
		
		
	}
}
