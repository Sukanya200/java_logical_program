/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.Scanner;
class Square
  {
    int n,p,r=1;
    int work()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter num1 value");
      n=sc.nextInt();
      System.out.println("enter num2 value");
      p=sc.nextInt();

      for(int i=1;i<=p;i++)
        {
        if(n>=0&&p==0)
        {
          System.out.println("1");
        }
      else if(n==0&&p>=1)
      {
         System.out.println("0");
      }
      else
      {
             r=r*n;
       }
      }
    return r;
      
    }
  }
public class Power {

//main method
public static void main(String args[]){
//declare variables n,p,r and initialize r as one.

//create scanner class object

  //take input from user
Square s= new Square();
  int result=s.work();
  System.out.println("Expected output:");
  System.out.println("result="+result);
  
//check if (n>=0&&p==0) if true then it prints 1 else if check (n==0&&p>=1) if true then print zero else multiply r*n
}
}
