import java.util.*;
class count1
  {
    public static void main(String args[])
    {
      String st1="Hello$113%";
      int i, alph,dig,spl; 
      char ch;
     
      for(i=0;i<st1.length();i++)
        {
          ch=st1.charAt(i);
          
          if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
          {
          alph++;
          }
          else if(ch>='0' && ch<='9')
            {
            dig++;
            }
              else 
                 {
                    spl++;
                  }
            }
          System.out.println("alpabet is:" +alph);
           System.out.println("digit is:" +dig);
           System.out.println("special is:" +spl);
        }
    }