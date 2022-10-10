import java.util.Scanner;
class loop2
  {
  public static void main(String args[])
    {
    int i, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
     n = sc.nextInt();

    for (i=1; i <= n; i++) 
    {
      System.out.println(i);
    }
  }
}