import java.util.*;
class stringvow
  {
    public static void main(String args[])
    {
      String str="Welcome to our home";
      int v=0, c=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u')
          {
             v++;
          }
          else if(str.charAt(i)>='b' && str.charAt(i)<='z')
            {
                c++;
            }
        }
      System.out.println("Its a vowels:"+v);
      System.out.println("Its a consonent:"+c);
    }
  }