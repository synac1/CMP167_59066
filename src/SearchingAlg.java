
public class SearchingAlg {
	public static int binarySearch(int [] arr, int target, int  leftStart, int rightEnd) {
		int middle ;
		if( rightEnd >= leftStart && leftStart< arr.length-1) {
			middle = leftStart + (rightEnd - leftStart)/2;
			if (target == arr[middle])
				return middle;
			if( target > arr[middle])
				return binarySearch(arr, target, middle + 1, rightEnd);
			else 
				return binarySearch(arr, target, leftStart, middle-1);
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] a = { 1, 5, 9, 67, 100, 190};
		System.out.println(binarySearch(a, 6, 0, a.length-1));// expected 3
	}
}
