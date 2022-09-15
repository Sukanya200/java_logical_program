/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/

public class ArraySum {

//Define the main method
public static void main(String args[])
  {
//Declare the variables and initialize
int i,sum=0;
//Take input from user
int a[]={1,2,3,4,5,6,7,8,9,10};
//Check user input values using for loop and add all values
 System.out.println("Enter the 10 elements:");
    for(i=0;i<10;i++)
      {
        System.out.println(a[i]);
      }
//Print the result
//sum of array
    for(i=0;i<10;i++)
      {
        sum=sum+a[i];
      }
    System.out.println("Sum of array elements is:"+sum);
      
      }
}
