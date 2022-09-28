// program to count the words in a string
import java.util.*;
 public class words
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      String[] st1=str.split(" ");
      System.out.println(st1);
      int count=0;
      for(int i=0;i<st1.length;i++)
        count++;
      System.out.println("st1 count:"+count);
    }
  }