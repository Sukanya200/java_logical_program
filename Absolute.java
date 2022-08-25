import java.util.Scanner;
class Absolute
  {
    public static void main(String args[])
    {
    
     Scanner sc=new Scanner(System.in);
    System.out.println("Absolute Value");
    System.out.println("--------------");
    System.out.println(" Enter float number:");

    float number=sc.nextFloat();
    float absNumber=Math.abs(number);
    System.out.println("Absolute numeric to given numeric"+number+":"+absNumber);
    
    }
  }
