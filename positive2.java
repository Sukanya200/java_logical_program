import java.util.Scanner;
  class positive2
  {
  public static void main(String args[])
    {
      int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a  number: ");
    n=sc.nextInt();
      if(n>=1&&n<=9)
      {
        System.out.println("digit");
        
      }
      else
      {
        System.out.println("grater than 9");
      }
    }
  }