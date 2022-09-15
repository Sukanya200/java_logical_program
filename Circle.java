//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle { 

//Define main method
  public static void main(String args[])
  {

//Declare the variables
int radius;
float pi=3.14f,circumference;
    


//Use the scanner class to provide radius at execution time

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter radius as a positive integer");
radius= scanner.nextInt();
*/
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of circle:");
radius=sc.nextInt();

//Caluculate the circumference of the circle
    circumference=2*pi*radius;

//Casting the floating-point value to int
    //Narrowing casting
    float f = 30f;
    int a;
    a=(int)f;

//Print the Result
System.out.println("The circumference of circle:"+circumference);
System.out.println("floating point value:"+f);
System.out.println("int value:"+a);
  }
}