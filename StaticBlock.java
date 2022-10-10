/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
import java.util.Scanner;
class Student
  {
    Scanner sc=new Scanner(System.in);
    int no;
    String name;
    static String clg = "IIT";
    Student()
    {
      System.out.println("enter the student name:");
      name=sc.next();
      System.out.println("enter the student roll no:");
      no=sc.nextInt();
    }
    void display()
    {
      System.out.println("Student name:" +name);
      System.out.println("Student roll no:" +no);
      System.out.println("College Name:"+clg);
    }
  }
public class StaticBlock
  {

    //main method
      public static void main(String args[])
        {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.display();
        s2.display();
        s3.display();
        }
    }




//initialize Student class constructor for three times

//Create an array and add the 3 student to it

//take input from user 3 times using for loop 

//creating Student class and declaring variables

//creating staticBlock in that give collegename

//add getters and setters

//creating dispCollegename static method 
     


