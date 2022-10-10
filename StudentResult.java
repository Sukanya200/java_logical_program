/* JFM1T7_Assignment2:

   Create a Student Result Processing System for 3 students.
   
   Sample inputs: Console input roll numbers, names and 5 subject marks for each student
   
   Sample output: Display roll numbers, names and percentage obtained by all 3 students in the following format:
   Roll Number: 1
   Name: Shree Balaji
   Percentage: 99%

*/
import java.util.Scanner;
public class StudentResult 
  {
    public static void main(String args[])
    {
      Student s1=new Student();
      Student s2=new Student();
      Student s3=new Student();

      Scanner sc=new Scanner(System.in);

      Student a[]={s1,s2,s3};
      float p[]=new float[3];
       for(int i=0;i<3;i++)
         {
           System.out.println("enter roll number: ");
           a[i].rollnum=sc.nextInt();
           System.out.println("enter name: ");
           a[i].name=sc.nextLine();
           a[i].name=sc.nextLine();
           System.out.println("enter physics marks: ");
           a[i].phy=sc.nextInt();
           System.out.println("enter maths marks: ");
           a[i].maths=sc.nextInt();
           System.out.println("enter chemistry marks: ");
           a[i].chem=sc.nextInt();
           System.out.println("enter biology marks: ");
           a[i].bio=sc.nextInt();
           System.out.println("enter computer marks: ");
           a[i].comp=sc.nextInt();
           System.out.println();
           int sum=(a[i].phy+a[i].maths+a[i].chem+a[i].bio+
a[i].comp);
         p[i]=sum;    
             }
      for(int j=0;j<3;j++)
        {
          p[j]=(p[j]/500)*100;
        }
      for(int i=0;i<3;i++)
        {
          System.out.println("roll number: "+a[i].rollnum);
          System.out.println("Name: "+a[i].name);
          System.out.println("Percentage: "+p[i]+"%");
        }
      
    }
  }
class Student
  {

    int rollnum,phy,maths,chem,bio,comp;
    String name;
  }
//main method

//initialize student constructor 3 times with different names

//Create an array and add the 3 student to it

//create displayPercentage static method in that add a for loop for student array

//calculate percentage

//display student details

//create getStudentInput method in that create a Scanner object and take input from user

//print 5 subject marks using for loop
     


//create Student class 

//declare and initialize variables

//add getters and setters method
