import java.util.Scanner;
class table3
  {
  public static void main(String args[])
    {
    int i, n,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
     n = sc.nextInt();

    for (i=1; i <= 10; i++) 
    {
     sum=sum+i;
    }
       System.out.println( "the sum of n natural number is:"+sum);
  }
  }
