import java.util.Scanner;
class armstrong
  {
    int n,digit=0,sum=0;
  boolean armstrong(int x)
    {
      n=x;
      for(int i=1;i<=n;i++)
        {
          digit=n%10;
          sum=sum+(digit*digit*digit);
          n=n/10;
        }
      if(sum==x)
        return true;
      else 
      return false;
    }
  }
class OOPS_1
  {
    public static void main(String args[])
    {
      int n,z;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the value");
       n=sc.nextInt();
      armstrong a1=new armstrong();
       z=a1.armstrong(n);
      if(z==n)
        System.out.println("It is an armstrong number");
      else
        System.out.println("It is not an armstrong number");
    }
  }
  