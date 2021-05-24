# Binary Search 
## Searching algorithm that instead of traversing the array to search for an element it 
## goes to the middle of the array and checks if the element at the middle index is the 
## same as the target.
## If the target is greater than element at the middle index check on the right side of the 
## array. If target  is smaller than the element at the middle index, then check on the left of the array

a ->{3, 23, 50,56, 61, 78 }

target = 61

middle= leftStart + (rightEnd-leftStart)/2
rightEnd = 5 

middle = 0 + (5-0)/2  ==> 2

a[2] == target  :: false

target > a[2]  :: true

leftStart = middle +  1 ==> 3 

middle = leftStart + (rightEnd - leftStart)/2 ==>

middle = 3 + (5-3)/2 ==> 4 

target  == a[4] ::  true

return middle


