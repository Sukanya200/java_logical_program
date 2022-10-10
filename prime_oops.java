import java.util.Scanner;
class prime
  {
    int n,i,count;
    void prime(int x)
    {
      n=x;
      count=0;
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
          }
        }
      if(count==2)
        System.out.println("It is a prime number");
      else
        System.out.println("It is not a prime number");
      
    }
  }
class prime_oops
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the value");
      int n=sc.nextInt();
      prime a1=new prime();
      a1.prime(n);
    }
  }