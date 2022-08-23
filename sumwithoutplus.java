import java.util.Scanner;

public class sumwithoutplus {

  public static void main(String[]args){

    Scanner sc=new Scanner(System.in);


    System.out .println("entre first number");
    int a=sc.nextInt();
    System.out.println("entre second number");
    int b=sc.nextInt();
    int c;
    c=a-(-b);

    
    System.out.println("addition of"+a+" and "+b+" are="+c);
  }
}