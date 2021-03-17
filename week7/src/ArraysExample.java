
import java.util.HashMap;



/*
 	
 */

public class ArraysExample {
	public static void main(String[] args) {
		
		
		int [] numbers = new int [10]; // created array of ints of size 10
		
		System.out.println(numbers[0]);
		
		numbers[0] = 9;
		
		System.out.println(numbers[0]);
		
		double [] theNumbers = { 2.5, 40.5, 4.5}; 
		
		System.out.println(theNumbers[1]);
		
		int [] nums = new int[] {6,8,7};
		
		System.out.println(nums[0]);
		
		char [] mLetters = {'f', 'l', 'o', 'w', 'e', 'r' };
		
		String word = new String(mLetters);
		
		System.out.println(word);
		
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i)+" ");
		}
		System.out.println();
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		
		String [] words = {"table", "keys", "wall", "window"};
		for(int i = 0; i <words.length; i++)
		{
			System.out.println(words[i]);
		}
		System.out.println("____________________________");
		for(String s: words) {  
			System.out.println(s);
			//you can have a counter if want 
		}
		//
		int index = -1;
		String target = "keys";
		for(int i = 0; i <words.length; i++)
		{
		 if(words[i].equals(target)) {
			 index = i;
		 }
		}
	 HashMap <Integer, String> myMap = new HashMap<Integer, String>();
	 myMap.put(100, "Maria");
	 System.out.println("Result "+myMap.get(100));
	// Map.
	
	}
}
