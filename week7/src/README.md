# One dimensional Arrays

int [] nums = {0, 2, 3, 4, 8, 7};
## Accessing 
nums[0] => 0
nums[1] => 2
nums[length] => out of bound exception
nums[-1] => out of bound exception
nums[length-1] => 7
## Assigning 
nums[0] = 5;

nums => {5, 2, 3, 4, 8, 7};

nums[0] => 5

## Length------
nums.length

## Creating Arrays
datatype []  identifier =  new datatype [size];
datatype []  identifier2 = {element, element, element};
datatype []  identifier2 = new datatype [] {element, element, element};
-------------
int [] numbers = new int [10];

numbers[1] => 0

double [] arrayD = new double [10];

arrayD[0] => 0.0 

String []  names = new String [10];

names [5] => null

char [] letters = new char [100];

char[7] => space charact '\u0000' => ' ' => null

# Exercise
* Write a method that takes in array of numbers as argument and returns a new array of numbers with original numbers multiplied by two 
 
