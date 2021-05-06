import java.util.Arrays;

public class MergeSort {

	static void merge(int [] arr , int leftStart, int middle,  int rightEnd ) {
		// create temp arrays to hold halve of the elements
		int [] left = new int [middle-leftStart+1];
		int [] right = new int [rightEnd -middle];

		int i,  j;

		int k = leftStart;

		for ( i = 0; i < left.length; i++)
			left[i] = arr[leftStart+i];
		for ( j = 0; j < right.length; j++)
			right[j] = arr[middle +1+j];

		i = 0;
		j = 0;

		while(i < left.length && j < right.length ) {
			if( left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	static void mergeSort(int [] arr) {
		int n = arr.length; 
		int leftStart, arr_size;

		for (arr_size = 1; arr_size < n ; arr_size = 2*arr_size)
			for (leftStart = 0; leftStart < n-1 ; leftStart += 2*arr_size)
			{
				int middle  = Math.min(leftStart + arr_size -1, n-1 );
				int right   = Math.min(leftStart + 2*arr_size -1, n-1 );
				merge(arr, leftStart, middle, right );
			}

	}
	public static void main(String[] args) {
		int [] numbers  = {63, 23, 12, 0, 2, 7};
		System.out.println(Arrays.toString(numbers));
		mergeSort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		//Swapping element at index 1 with element at index 4
		numbers[1]= numbers[1] +numbers[4];
		numbers[4] = numbers[1]- numbers[4];
		numbers[1] = numbers[1] - numbers[4];
		
		System.out.println(Arrays.toString(numbers));
		
	}


}
