import java.util.Scanner;
class palindrome
  {
    int n,r=0,d,t;
    void prime(int x)
    {
      n=x;
      t=n;
      while(n>0)
        {
          d=n%10;
          r=r*10+d;
          n=n/10;
        }
      if(r==t)
        System.out.println("It is a palindrome");
      else
        System.out.println("It is not a palindrome");
    }
  }
class  palindrome_oops
  {
    public static void  main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the value");
      int n=sc.nextInt();
      palindrome a1=new palindrome();
      a1.palindrome(n);
    }
  }