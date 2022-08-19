import java.util.Scanner;
class swap1
  {
    public static void main(String args[])
    {
      int a;
      int b;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of a and b");
       a =sc.nextInt();
       b =sc.nextInt();
      System.out.println("Before swap");
      System.out.println("a="+a);
      System.out.println("b="+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("after swap");
      System.out.println("a="+a);
      System.out.println("b="+b);
    }
  }