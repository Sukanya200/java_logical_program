/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;

public class SubStringWithoutInbuilt {

//main method
public static void main(String args[])
  {
//declare variables
 String st1,st2;
    int count=0;
//take input from user
Scanner sc=new Scanner(System.in);
    System.out.println("Enter sample input");
    st1=sc.nextLine();
    System.out.println("Enter search string");
    st2=sc.nextLine();
    //compare two strings if the search string found or not without using inbuilt method isSubString()
     String s[]=st1.split(" ");
    //creat isSubString method in that declare variable 
    for(String w:s)
      {
        if(w.equals(st2))
        {
          count=1;
        }
      }
    //check two strings if the search string is present then return true else return false
    if(count==1)
    {
      System.out.println(st2+"is found:");
      
    }
    else{
      System.out.println(st2+"is not found:");
    }
  }
}