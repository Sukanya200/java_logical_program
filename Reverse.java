import java.util.*;
class Reverse
  {
    public static void main (String args[])
    {
      String st1="Welcome";
      System.out.println("the reverse of the given string is:");
      for(int i=st1.length();i>0;i--)
       {
         System.out.println(st1.charAt(i-1));
       }      
      
    }
  }