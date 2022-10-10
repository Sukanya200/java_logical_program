/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {

//main method
public static void main (String args[])
  {
//declare variables and take input from user
    String st1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Sample Input");
    st1=sc.nextLine();
    String st3=st1;
//creat stringbuffer object for string reversing
StringBuffer st2=new StringBuffer(st1);
//reverse input string
st2.reverse();
//print entire string result
System.out.println("Enter string:"+st2);
//call reverWordInMyString method
String[] word=st3.split(" ");
    String reverse="";
    for(int i=0;i<word.length;i++)
      {
/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/
        String temp=word[i];
        {
          for(int j=temp.length()-1;j>=0;j--)
            {
  /* 
   Use charAt() function returns the character
   at the given position in a string
*/
              reverse=reverse+temp.charAt(j);
            }
          reverse=reverse+" ";
        }
      }
  //print reverse each word string result
     System.out.println(reverse);
   }
}