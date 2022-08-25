import java.util.Scanner;
class alphabet
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any character");
       ch=sc.next().charAt(0);
      if(ch>='a' && ch<='z'||ch>='A'&& ch<='Z')
      {
        System.out.println("enter a character");
        if(ch>='A'&&ch<='Z')
        {
           System.out.println("its  capital letter");
        }
        if(ch>='a'&&ch<='z')
        {
           System.out.println("its  small letter");
        }
      }
        else if(ch>='0'&&ch<='9')
                {
           System.out.println("its digit ");
                }
      
        else
        {
           System.out.println("special character");
        }
      }
    }
  