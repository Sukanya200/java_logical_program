
import java.util.Scanner;
class array1
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements :");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the elements of array is :");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("enter the index of number to be deleted");
      int index=sc.nextInt();
      for(i=index;i<n-1;i++)
        {
          a[i]=a[i+1];
        }
      n=n-1;
      System.out.println("the new array is ");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
  }

    import java.util.Scanner;
class removeIndex{​​​​​​​
  public static void main(String args[]){​​​​​​​
    int i,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the  array ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Ente the array");
    for(i=0;i<n;i++)
      {​​​​​​​
        a[i]=sc.nextInt();
      }​​​​​​​
    System.out.println("Enter the index position which element to be deleted ");
      m=sc.nextInt();
     
    System.out.println("The array after removind is ");
    for( i=0;i<=n;i++)
      {​​​​​​​
        if(m==i)
        {​​​​​​​
          continue;
        }​​​​​​​
        System.out.print(a[i]);
       }​​​​​​​
  }​​​​​​​
}​​​​​​​


[3:20 PM] Harshitha Suresh (Guest) was invited to the meeting.
​

[3:20 PM] harshitha (Guest) no longer has access to the chat.
​
[3:21 PM] Harshitha Suresh (Guest)
//copying elements of one array to other import java.util.Scanner; class copy {​​​​​​​​​​ public static void main(String args[]) {​​​​​​​​​​ int i,n; Scanner sc=new Scanner(Systemin); System.out.println("enter the array size"); n=sc.nextInt(); int a[]=new int[n]; int b[]=new int[n]; System.out.println("enter the array elements of array A"); for(i=0;i<n;i++) {​​​​​​​​​​ a[i]=sc.nextInt(); }​​​​​​​​​​ for(i=0;i<n;i++) {​​​​​​​​​​ b[i]=a[i]; }​​​​​​​​​​ System.out.print("Array B is :"); for(i=0;i<n;i++) {​​​​​​​​​​ System.out.print(" "+b[i]); }​​​​​​​​​​ }​​​​​​​​​​ }​​​​​​​​​​

​
[3:22 PM] Sharath (Guest)

import java.util.*;

class copy_array {​​​​​​​​​​​​​​​   public static void main(String args[])   {​​​​​​​​​​​​​​​     int i, n;     Scanner sc = new Scanner(System.in);     System.out.print("Enter the size of array : ");     n = sc.nextInt();     System.out.println("Enter the array elements : ");     int a[] = new int[n];     int b[]= new int[n];

    for (i = 0; i < n; i++) {​​​​​​​​​​​​​​​       a[i] = sc.nextInt();     }​​​​​​​​​​​​​​​     for(i=0;i<n;i++)       {​​​​​​​​​​​​​​​     b[i]=a[i];       }​​​​​​​​​​​​​​​ System.out.println("The elements in first array are ");     for (i = 0; i < n; i++) {​​​​​​​​​​​​​​​       System.out.print(" " + a[i]);     }​​​​​​​​​​​​​​​          System.out.println("\n The elements in first copied from first array are ");    for (i = 0; i < n; i++)      {​​​​​​​​​​​​​​​       System.out.print(" " + b[i]);     }​​​​​​​​​​​​​​​   }​​​​​​​​​​​​​​​ }​​​​​​​​​​​​​​​




​
[3:25 PM] Pavan Kumar Allada

Write a JAVA program to delete an element from an array at specified position.


​
[3:26 PM] Gunti prudhviraj (Guest)

//write a JAVA program to copy all elements from an array to another array import java.util.Scanner; class Arraycopy   {​​​​​​​​​​​​​​​     public static void main(String args[])     {​​​​​​​​​​​​​​​       int i;       Scanner sc= new Scanner(System.in);       System.out.println("enter the array size:");       int n=sc.nextInt();       int a[]=new int[n];       int b[]=new int[n];       System.out.println("enter the elements of an array:");       for(i=0;i<n;i++)         {​​​​​​​​​​​​​​​           a[i]=sc.nextInt();         }​​​​​​​​​​​​​​​       for(i=0;i<n;i++)         {​​​​​​​​​​​​​​​           b[i]=a[i];         }​​​​​​​​​​​​​​​       System.out.println(" the elements in an array:");       for(i=0;i<n;i++)         {​​​​​​​​​​​​​​​           System.out.print(+a[i]);         }​​​​​​​​​​​​​​​       System.out.println();       System.out.println("the elements  in an copied array:");       for(i=0;i<n;i++)         {​​​​​​​​​​​​​​​           System.out.print(+b[i]);         }​​​​​​​​​​​​​​​       System.out.println();     }​​​​​​​​​​​​​​​           }​​​​​​​​​​​​​​​


​
[3:30 PM] Narasimha banka(Guest)

// a JAVA program to copy all elements from an array to another array import java.util.*;  class Array_copy {​​​​​​​​​​​​​​​   public static void main(String args[]){​​​​​​​​​​​​​​​     int i;     Scanner sc=new Scanner(System.in);     System.out.println("Enter the array size :");     int n=sc.nextInt();     int a[]=new int[n];     int b[]=new int[n];     System.out.println("enter the element of the array");     for(i=0;i<n;i++)       {​​​​​​​​​​​​​​​         a[i]=sc.nextInt();       }​​​​​​​​​​​​​​​            for(i=0;i<n;i++)       {​​​​​​​​​​​​​​​         b[i]=a[i];               }​​​​​​​​​​​​​​​     System.out.println("The elements copied from the first array is :");           for(i=0;i<n;i++)       {​​​​​​​​​​​​​​​         a[i]=b[i];       }​​​​​​​​​​​​​​​       System.out.println(b[i]);   }​​​​​​​​​​​​​​​ }​​​​​​​​​​​​​​​


​

[3:47 PM] Bhargavi Tirumala (Guest) was invited to the meeting.
​
[3:49 PM] Sharath (Guest)

//Write a JAVA program to delete an element from an array at specified position

import java.util.*;

class delete_element   {​​​​​​​​​​​​​​​   public static void main(String args[])   {​​​​​​​​​​​​​​​     int i,n,in;     Scanner sc = new Scanner(System.in);     System.out.print("Enter the size of array : ");     n = sc.nextInt();     System.out.println("Enter the array elements : ");     int a[] = new int[n];     int b[]= new int[n];

    for (i = 0; i < n; i++) {​​​​​​​​​​​​​​​       a[i] = sc.nextInt();     }​​​​​​​​​​​​​​​      System.out.println(" The elements in array are ");     for(i = 0; i < n; i++)       {​​​​​​​​​​​​​​​       System.out.print(" " + a[i]);       }​​​​​​​​​​​​​​​           System.out.print(" enter the index need to be deleted : ");         in=sc.nextInt();      System.out.print("\n the element in array after deleting ");     for(i=0;i<n;i++)       {​​​​​​​​​​​​​​​         if(i==in)         {​​​​​​​​​​​​​​​           continue;         }​​​​​​​​​​​​​​​         System.out.print(" " + a[i]);       }​​​​​​​​​​​​​​​   }​​​​​​​​​​​​​​​ }​​​​​​​​​​​​​​​







​[4:02 PM] unnikrishnan (Guest)
    //remove selected index position and print
import java.util.Scanner;
class removeIndex{​​​​​​​
  public static void main(String args[]){​​​​​​​
    int i,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the  array ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Ente the array");
    for(i=0;i<n;i++)
      {​​​​​​​
        a[i]=sc.nextInt();
      }​​​​​​​
    System.out.println("Enter the index position which element to be deleted ");
      m=sc.nextInt();
     
    System.out.println("The array after removind is ");
    for( i=0;i<n;i++)
      {​​​​​​​
        if(m==i)
        {​​​​​​​
          continue;
        }​​​​​​​
        System.out.print(a[i]);
       }​​​​​​​
  }​​​​​​​
​[4:04 PM] 
      subhash (Guest) no longer has access to the chat.
    ​[4:09 PM] Sharath (Guest)
    
//Write a JAVA program to count total number of even and odd elements in an array



import java.util.*;
class even_array
  {​​​​​​​
    public static void main(String args[])
    {​​​​​​​
      int i,n;
      int ec=0;
      int oc=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      n=sc.nextInt();
     System.out.println("Enter the array elements : ");
      int a[]=new int[n];
      
      
      for(i=0;i<n;i++)
        {​​​​​​​
          a[i]=sc.nextInt();
        }​​​​​​​
      for(i=0;i<n;i++)
        {​​​​​​​
          if(a[i]%2==0)
          {​​​​​​​
            ec++;
          }​​​​​​​
          else 
          {​​​​​​​
           oc++; 
          }​​​​​​​
          
        }​​​​​​​
       System.out.println("Total number of even number in the array is : "+ec);
          System.out.println("Total number of odd number in the array is : "+oc);
    }​​​​​​​
  }​​​​​​​



​[4:09 PM] Harshitha Suresh (Guest)
    //to count total number of even or odd
import java.util.Scanner;
class even_array
  {​​
    public static void main(String args[])
    {​​
      int i,n,count=0,cnt=0;
      Scanner sc=new Scanner(Systemin);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements :");
      for(i=0;i<n;i++)
        {​​
          a[i]=sc.nextInt();
        }​​
      System.out.println("the elements of array is :");
      for(i=0;i<n;i++)
        {​​
          System.out.println("\t" +a[i]);
        }​​
      for(i=0;i<n;i++)
        {​​
          if(a[i]%2==0)
          {​​
            count++;
          }​​
          else
          {​​
            cnt++;
          }​​
        }​​
      System.out.println("the number of even elements are "+count);
      System.out.println("the number of odd elements are "+cnt);
    }​​
  }​​
​[4:10 PM] Sharath (Guest)
    
//Write a JAVA program to count total number of negative elements in an array



import java.util.*;
class negative_element
  {​​​​​​​
    public static void main(String args[])
    {​​​​​​​
      int i,n;
      int nc=0;
      
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      n=sc.nextInt();
     System.out.println("Enter the array elements : ");
      int a[]=new int[n];
      
      
      for(i=0;i<n;i++)
        {​​​​​​​
          a[i]=sc.nextInt();
        }​​​​​​​
      for(i=0;i<n;i++)
        {​​​​​​​
          if(a[i]<0)
          {​​​​​​​
            nc++;
          }​​
        }
       System.out.println("Total number of negative elements in the array is : "+nc);
         
    }​​​​​​​
  }​​​​​​​



