/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

//main method
public static void main(String args[])
  {
    //declare varible
    String st1,st2;
    //take input from user
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    st1=sc.nextLine();
    st2="";
    for(int i=st1.length();i>0;i--)
      {
        st2=st2+st1.charAt(i-1);
      }
    /* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/
     if(st1.equalsIgnoreCase(st2))
      {
        System.out.println(st2+ "is palindrome");
      }
      else
      {
        System.out.println(st2+ "is not palindrome");
      }
    }
  }

