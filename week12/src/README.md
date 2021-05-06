
Lets say I have an array that looks like this

{6, 8, 2 , 3, 0, 1}

What info can you gather from just looking at this array

- It has even and odd number
- It is an integer array 
- with the lenght of 6
- It is not organized, It is not sequential

What do you  think is the advantage of having this array sorted
- Easier to handle
- Quicker way to grab the max and min
- Quicker to find an element 
----
What process would you follow to sort this array in ascending order

- Look through every number in the array?

## BubbleSort

- Look at the first element, compare with the next one
- if the first element is bigger than the next element, then swap, else continue and move on
- Repeat 

{6, 8, 2 , 3, 0, 1}
1 iteration 
{6, 8, 2 , 3, 0, 1}
2 iteration
{6, 2, 8 , 3, 0, 1} swapped
3 iteration
{6, 2, 3 , 8, 0, 1} swapped
4 iteration 
{6, 2, 3 , 0, 8, 1} swapped
5 iteration 
{6, 2, 3 , 0, 1, 8} swapped 

1 iteration 
{2, 6, 3 , 0, 1, 8} swapped
2 iteration 
{2, 3, 6 , 0, 1, 8} swapped
3 iteration
{2, 3, 0, 6, 1, 8} swapped
4 iteration 
{2, 3, 0, 1, 6, 8} swapped
5 iteration
{2, 3, 0, 1, 6, 8}
....
{0, 1, 2, 3, 6, 8}

Time complexity : O(n^2)

# Week 12 exercise is to  write an essay explaining the sorting algorithms below

## Selection Sort  O(n^2)
## Insertion Sort O(n^2)


## MergeSort O(nlogn)
## QuickSort O(nlogn)
