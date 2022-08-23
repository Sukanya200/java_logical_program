import java.util.Scanner;

  public class shorthand {

//main method
  public static void main(String[]args){
  

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
  Scanner sc=new Scanner(System.in);

/*
  Take input from user
  System.out.println("Enter first value: ");
  int a=sc.nextInt();
*/
  System.out.println("entre first value");
  int a=sc.nextInt();
  System.out.println("entre second value");
  int b=sc.nextInt();
   a*=b;
   a-=b;
   a/=b;
   a%=b;
  System.out.println("+a+");
  
//print appropriate result for assignment operators
   }
}