/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/

import java.util.Scanner;
class Student1
{
  private String rollnum;
  private String name;
  Student1()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter student name:");
    name=sc.nextLine();
    System.out.println("enter student roll num:");
    rollnum=sc.nextLine();
    System.out.println();
  }
  public void setRollnum(String rollnum)
  {
    this.rollnum=rollnum;
    
  }
  public String getRollnum()
  {
    return this.rollnum;
    
  }
  public void disp()
  {
    System.out.println("Expected Output");
    System.out.println("Name: "+name+" Rollnum:" +this.rollnum);
  }
}
public class StudentConstructor
  {
    public static void main(String args[])
    {
      Student1 s=new Student1();
      s.disp();
    }
  }
//main method

//initialize Student class using constructor

//Get student name and rollno from user and set it to the Student object  

//print result

//Create Student class in that declare variables name and roll number 

//add  setter method for rollno

 

//add getter method for rollno

//add setters and getters for name fields also