/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/

import java.util.Scanner;

 class Employee {

//Declare the variables
int Empid,salary;
  String name;
//Create a method getInput() 
public void getInput(){
  //create Scanner object
  Scanner sc=new Scanner(System.in);
  //take input from user
   System.out.println("Enter Empid:");
      Empid=sc.nextInt();
      System.out.println("Enter Name:");
      name=sc.next();
      System.out.println("Enter Salary:");
      salary=sc.nextInt();

}
//create display method
  public void display(){
    
//Print Employee details
    System.out.println();
   System.out.println("Employee id=" +Empid);     
   System.out.println("Employee name=" +name);
   System.out.println("Employee salary=" +salary);

  }
    public static void main(String args[])
    {
  //Create a Employee constructor with the two employees
    Employee emp1=new Employee();
      Employee emp2=new Employee();
//check for loop to print two employee details
emp1.getInput();
      emp2.getInput();
      emp1.display();
      emp2.display();
    }
}
