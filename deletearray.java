//Write a JAVA program to delete an element from an array at specified position

import java.util.*;

class deletearray   {
  public static void main(String args[])   {
    int i,n,in;    
    Scanner sc = new Scanner(System.in);     
    System.out.print("Enter the size of array : ");   
    n = sc.nextInt();   
    System.out.println("Enter the array elements : ");        int a[] = new int[n];    
    int b[]= new int[n];

    for (i = 0; i < n; i++) 
    {
      a[i] = sc.nextInt();     
    } 
    System.out.println(" The elements in array are ");     for(i = 0; i < n; i++)     
      {
        System.out.print(" " + a[i]);     
      }
    System.out.print(" enter the index need to be deleted : ");    
    in=sc.nextInt();      
    System.out.print("\n the element in array after deleting "); 
    for(i=0;i<n;i++)      
      {
        if(i==in)         
        {
          continue;
        }
        System.out.print(" " + a[i]);     
      }
  }
}


