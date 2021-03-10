

public class MethodsExample {
	
	public static int sumOfTwo( int a, int b){
		if (a >=0 && b >= 0)  
			return a + b ;
		return -1;
	}
	
	//Method that calculates sum from n to m, returns results
	public static int sumFromN2M(int n, int m) {
		int sum = 0;
		for( int i = n ; i <= m ; i++ ) {
			sum  = sum + i  ; 
		}
		return sum;
	}
	

}
