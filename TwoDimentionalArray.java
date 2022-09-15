/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
public static void main(String args[])
  {
//Declare the variables
int i,j=0,r1,c1,max,index=0,index1=0;
//Take number of rows and columns from user in two-dimensional array
Scanner sc =new Scanner(System.in);
    System.out.println("Enter Row Size:");
    r1=sc.nextInt();
    System.out.println("Enter Column Size:");
    c1=sc.nextInt();
    int a[][]=new int[r1][c1];
    
//assume first element is largest and use for loop to compare the largest element with all the reamaining elements
System.out.println("Enter array  elements to Matrix:");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
        a[i][j]=sc.nextInt();
        }
      }
    
      
    System.out.println(" The elements in an  Matrix:");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            System.out.print("\nThe value of a["+i+"]["+j+"] is:"+a[i][j]);
          }
        System.out.println(" ");
      }
//Calcualte the maximum element based on index poistion
max=a[0][0];
    System.out.println("Expected Output:");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            if(max<a[i][j])
              max=a[i][j];
              index=i;
            index1=j;
              
              
          }
      }
//Print result
System.out.println("Largest element array is "+max+" and its index position is arr ["+index+"]["+index1+"]");
  }
}