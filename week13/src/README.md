# Sorting Algorithms

# MergeSort 
1- Divide the array into smaller subarrays, sort them and then merge back together

## merge
1- Divide the array into two sub arrays, left and right
2- Sort by grabbing the smaller from the two arrays and adding it to the the original array
3- if all the elments of right have been added to the original and there are still elments in left, then add to the original array
4- if all them the elments of left have been added to the original and there are still elments in right, then add them to the original array


## mergesort 
```
arr
n = length of the array 

leftStart, arr_size

for (arr_size = 1; arr_size < n ; arr_size = 2*arr_size)
	for (leftStart = 0; leftStart < n-1 ; leftStart += 2*arr_size)
	{
		int middle  = Math.min(leftStart + arr_size -1, n-1 );
		int right   = Math.min(leftStart + 2*arr_size -1, n-1 );
		merge(arr, leftStart, middle, right )
	}
```

# quicksort 
1- This algorithm will take the last element of the array as the pivot and compare every element of the array  with the pivot, all elements  smaller than the pivot will be placed to the left and greater to the right.

# Research about binary search 
