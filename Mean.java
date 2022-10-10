/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.Scanner;

 class Object {
int num1,num2,num3,sum=0;
  int Object(int x,int y,int z)
  {
    num1=x;
    num2=y;
    num3=z;
    sum=(num1+num2+num3)/3;
    return sum;
  }
}

  
public  class Mean{
//main method
public static void main(String args[]){
//declare variables and initialize sum=0
  int a,b,c,d;
//create scanner object
Scanner sc=new Scanner(System.in);
//take input from user
  System.out.println("Enter num1 value");
 a=sc.nextInt();
System.out.println("Enter num2 value");
b=sc.nextInt();
System.out.println("Enter num3 value");
c=sc.nextInt();
  Object o=new Object();
  d=o.Object(a,b,c);
  
//check the for loop for number of values entered in input

//print result
System.out.println("result:"+d);
}
}