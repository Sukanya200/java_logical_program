import java.util.Scanner;
class Conditional
{
  public static void main(String args[])
  {
    int a=10,b=15;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the age:");
    int age=sc.nextInt();
    if(age>=18)
    {
      System.out.println("The person is eligible to vote");
    }
  }
}