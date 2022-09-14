import java.util.*;
class palindrome
  {
    public static void main(String args[])
    {
      String st1="madam";
      String st2="";
     
      for(int i=st1.length();i>0;i--)
        {
        st2=st2+st1.charAt(i-1);
        }
      if(st1.equals(st2))
      {
        System.out.println("String is palindrome");
      }
      else{
        System.out.println("String is not palindrome");
      }
    }
  }