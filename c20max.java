//write a java program to find the difference between maximum element and minimum element of an array
import java.util.Scanner;
class c20max
  {
    public static void main (String args[])
    {
      int i,n,max,min;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter element to array");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          
        }
       System.out.println("element in an array:");
      for(i=0;i<n;i++)
        {
           System.out.println("\t"+a[i]);
        }
      max=min=a[0];
      for(i=0;i<n;i++)
        {
          if(max<a[i])
            max=a[i];
          if(min>a[i])
            min=a[i];
        }
       System.out.println("the maximum array:"+max);
       System.out.println("the minimum array:"+min);
    }
  }