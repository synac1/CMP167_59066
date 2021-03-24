/*
Write a method that takes in array of numbers as argument and returns a new array of numbers with  
original numbers multiplied by two 
*/
public class Exercise {
	public static int [] newMultBy2(int [] nums) {
		int [] newNums = new int [nums.length];
		
		for (int i = 0; i < nums.length; i++ ) {
			newNums [i] = nums[i] * 2;
		}
	
		return newNums;
	}

}
