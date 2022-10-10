import java.util.Scanner;
class table4
  {
  public static void main(String args[])
    {
    int i, n,fact=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
     n = sc.nextInt();

    for (i=1; i <=n; i++) 
    {
     fact=fact*i;;
    }
       System.out.println( "factorial value is: "+fact);
  }
  }
