import java.util.Scanner;
class factorial
{
   int i,fact=1,n;
    
  void fact()
  {
   
    for(int i=1;i<=n;i++)
      {
    fact=fact*i;
      }
     System.out.println("The factorial  is:"+fact);
  }
}
class oopsfact
  {
     public static void main(String args[])
    {
      int m=10;
      Scanner sc = new Scanner(System.in);
    System.out.println("enter the m value");
      m = sc.nextInt();
       factorial a1=new factorial();
       a1.fact(m);
    }
}