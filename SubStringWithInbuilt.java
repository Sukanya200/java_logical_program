/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {

//main method
public static void main(String args[])
  {
//declare variables
String st1,st2;
//take input from user
Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    st1=sc.nextLine();
    System.out.println("Enter search");
    st2=sc.nextLine();
    boolean result=st1.contains(st2);
//check if the string contains substring or not if contains print found else print not found
System.out.println("Expected output:");
    if(result)
    {
      System.out.println(st2+" is found");
    }
    else{
      System.out.println(st2+" is not found");
    }
}
}