import java.util.Scanner;
class factorial
{
   int i,f=1;
    
  void fact(int n)
  {
  
    for(int i=1;i<=n;i++)
    f=f*i;
        return f;
      }
   }

class OOPS_fact
  {
     public static void main(String args[])
    {
      int m,n;
      Scanner sc = new Scanner(System.in);
    System.out.println("enter the m value");
      m = sc.nextInt();
       factorial a1=new factorial();
       a1.fact(m);
    }
}