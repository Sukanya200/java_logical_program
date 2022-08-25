import java.util.*;
class swap
  {
    public static void main(String args[])
    {
      int m,n,p;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of m and n");
      m=sc.nextInt();
      n=sc.nextInt();
      System.out.println("Before swap"); 
      System.out.println("First number="+ m);
      System.out.println("Second number="+n);
       p=m;
       m=n;
       n=p;
      System.out.println("After swap");
      System.out.println("First number="+m);
      System.out.println("Second number="+n);
    }
  }