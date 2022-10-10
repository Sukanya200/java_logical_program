//to find first index position
import java.util.*;
class strfirst
  {
    public static void main(String args[])
    {
      String st1;
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first string to find first");
      st1=sc.nextLine();
      System.out.println("Enter the character");
      ch= sc.next().charAt(0);
    int index=st1.indexOf(ch);
    System.out.println("The index position of the given word is "+index);
  }
}
  