import java.util.*;
class perfect{
static int perfecto(int n)
  {
    int num,i=1,sum=0;
    
    num=n;
    while(i<n)
     {
        if(n%i==0)
        {
          sum=sum+i;
        }
       i=i+1;
      }
    return sum;
  }
}
 public class perfectnumber
{
  public static void main(String args[]){
     int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number range");
     n=sc.nextInt();
    int b=perfect.perfecto(n);
    if(b==n)
    {
       System.out.println("perfect number");
    }
    else
    {
      System.out.println("Not a perfect number");
    }
  }
}
