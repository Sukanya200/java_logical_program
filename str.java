import java.util.*;
class str
{
  public static void main(String args[]) 
  {
    String st1 ="SUKANYA";
    String st2 ="HELLO";

    System.out.println("The 2rd Character in String :" + st1.charAt(2));

    System.out.println("The 'K' character position in String :" + st1.indexOf('K'));

    System.out.println("The 'A' character position in String :" + st1.indexOf('A'));

    System.out.println("The 'A' character position in String :" + st1.lastIndexOf('A'));

    System.out.println("The 'B' character position in String :" + st1.indexOf('B'));

    System.out.println("The Sub String in the given String :" + st1.substring(3));
    System.out.println("The Sub String in the given String :" + st1.substring(2, 6));

    System.out.println("The length of the given String :" + st1.length());

System.out.println("The String1 in Lowercase :" + st1.toLowerCase());

System.out.println("The String2 in Uppercase :" + st2.toUpperCase());

System.out.println("The String joining :" + st2.concat(st1));  

  System.out.println("The Compareing Two  String:"+ st1.equals[st2]);
}
  }
