import java.io.*;
import java.lang.*;
class NumberException extends Exception
{
             int no;
                  NumberException(int no)
     {
     this.no=no;
      }
      public String toString()
      {
       return "Error .."+no+"...Is Greater";
      }
}
public class NewThrow
{
              static void test(int no)throws NumberException
              {
      if(no >500)
                   {
             throw new NumberException(no);
                    }
       System.out.println("Value is.."+no);
     }

 public static void main(String args[])
  {
        try
     {
                     test(800);
      }
             catch(NumberException ae)
       {
System.out.println("NumberException :"+ae);
        }
   }
}