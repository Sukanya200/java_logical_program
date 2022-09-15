/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
public static void main(String args[])
  {
//Declare the variables
int r1,c1,i,j;
//Take input from user to enter rows and column values
Scanner sc=new Scanner(System.in);
    System.out.println(" Enter row size:");
    r1=sc.nextInt();
    System.out.println(" Enter column size:");
    c1=sc.nextInt();
    int a[][]=new int[r1][c1];
    int b[][]=new int[r1][c1];
    System.out.println("Enter elements to Matrix:");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            a[i][j]=sc.nextInt();
          }
      }
//Convert the square matrix into transpose
for(i=0;i<r1;i++)
  {
    for(j=0;j<c1;j++)
      {
        b[i][j]=a[j][i];
      }
  }
    System.out.println("The elements in an Matrix:");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            System.out.print("\t"+a[i][j]);
          }
        System.out.println();
      }
//Print the transpose matrix
 System.out.println("The elements after transpose of Matrix:");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            System.out.print("\t"+b[i][j]);
          }
        System.out.println();
      }
//printing j and i instead of i and j

}
}