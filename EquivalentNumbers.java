/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/
import java.util.Scanner;
class EquivalentNumbers1 
{
  Scanner sc=new Scanner(System.in);
  int n;
  void read()
  {
    System.out.println("enter n value");
    n=sc.nextInt();
  }
  void disp()
  {
    System.out.println("expected output:");
    String binary=Integer.toBinaryString(n);
    String octal=Integer.toOctalString(n);
    String hexa=Integer.toHexString(n);
    System.out.println("Binary equivalent: "+binary+" Octal equivalent:"+octal+" Hexdecimal equivalent:"+hexa);
    
  }
}
public class EquivalentNumbers
{
  //Main method
    public static void main(String args[])
  {
    //take input from user
  EquivalentNumbers1 m=new EquivalentNumbers1();
  m.read();
  m.disp();
  }
 }

  
//initialize Convert class constructor
//create Scanner object



//convert numbers into hexa,octal and binary

//print result
  

//create Convert class in that declare variables

//add getters and setters method
