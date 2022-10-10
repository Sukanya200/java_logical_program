/*to check the given number is even odd using switch case*/
import java.util.Scanner;
  class evenodd
    {
      public static void main(String args[])
      {
      int  n=0;
      Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
    System.out.println("enter the positive  integer value");
      
    switch (n % 2) {
      case 1:
      System.out.println("its even");
        break;
      case 2:
            System.out.println("its odd");
        break;
        }
    }
}