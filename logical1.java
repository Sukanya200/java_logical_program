import java.util.Scanner;
class logical1
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter any Charector");
      ch=sc.next().charAt(0);
    
      
      if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
      {
        System.out.println("It is vowel");
        
      }
      else
      {
        System.out.println("It is consonant");
      }
    }
  }