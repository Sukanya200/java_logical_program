/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

//Define the main method
public static void main(String args[])
  {
//Declare the variables and initialize
int i,n;
    float min;
//Take temperature of 7 days as a input from user
Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of days:");
    n=sc.nextInt();
    float a[]=new float[n];
    System.out.println("Enter temperature of 7 days:");
    for(i=0;i<n;i++)
      {
        a[i]=sc.nextFloat();
      }
    System.out.println("The elements in an array is:");
    for(i=0;i<n;i++)
      {
        System.out.print("\t"+a[i]);
      }
    System.out.println();
    
//Calculate the lowest temperature
min=a[0];
    System.out.println("Expected output:");
    for(i=0;i<n;i++)
      {
        if(min>a[i])
          min=a[i];
      }
//Print the result
System.out.println("The lowest temperature of the week 3 celsius is:"+min);
}
}