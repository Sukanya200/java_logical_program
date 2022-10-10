//program to find All occurence of character in string
import java.util.*;
class strall
  {
    public static void main(String arg[])
    {
     
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter  String to find first occurence of string:");
      String st1=sc.nextLine();
       System.out.println("Enter the character:");
      ch=sc.next().charAt(0);
      int count=0;
      for(int i=0;i<st1.length();i++)
        {
          if(st1.charAt(i)==ch)
          {
            System.out.println("The character"+ch+" appear at index"+i);
            count++;
          }
           System.out.println("The character"+ch+" appear "+count+" time");
        }
     
    }
  }
     

    
