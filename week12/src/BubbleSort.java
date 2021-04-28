import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length -1 ; i++)
			for (int j = 0; j< arr.length  -1 -i; j++ ) {
				if(arr[j]> arr[j+1]) {
					int old = arr[j];
					arr[j] = arr[j +1];
					arr[j + 1] = old;
				}
			}
	}
	
	public static void main(String[] args) {
		int [] numbers  = {6, 8, 2 , 3, 0, 1};
		System.out.println(Arrays.toString(numbers));
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
