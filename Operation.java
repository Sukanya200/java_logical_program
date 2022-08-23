import java.util.Scanner;

public class Operation {
  public static void main(String[]args)
  {
    int num1,num2;
    Scanner sc=new Scanner(System.in);
    System.out.println("to find the difference");
    System.out.println("enter the first number");
    num1=sc.nextInt();
    System.out.println("enter the second number");
    num2=sc.nextInt();
    int diff=num1-num2;
    System.out.println("the difference is : "+diff);
    
    System.out.println("to find the product");
    System.out.println("enter the first number");
    num1=sc.nextInt();
    System.out.println("enter the second number");
    num2=sc.nextInt();
   int prod=num1*num2;
    System.out.println("the product is : "+prod);

    System.out.println("to find division of two numbers");
    System.out.println("enter the first number");
    num1=sc.nextInt();
    System.out.println("enter the second number");
    num2=sc.nextInt();
    int div=num1/num2;
    System.out.println("the division of two numbers is : "+div);

    System.out.println("to increment and decrement");
    System.out.println("enter the number for incrementing and decrementing");
    int num=sc.nextInt();
    int increment=++num;
    int decrement=--num;
    System.out.println("the result of increment is :"+increment);
    System.out.println("the result of decrement is :"+decrement);

    System.out.println("to find the reminder");
    System.out.println("enter the first number");
    num1=sc.nextInt();
    System.out.println("enter the second number");
    num2=sc.nextInt();
   int rem=num1%num2;
    System.out.println("the reminder is : "+rem);
  }      
  }