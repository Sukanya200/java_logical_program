import java.util.Scanner;

public class Boolean {
  public static void main(String[] args) {
    boolean x;
    boolean y;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the x value :");
    x= sc.nextBoolean();
    System.out.println("Enter the y value :");
    y= sc.nextBoolean();
    System.out.println("x && y = " + (x && y));
    System.out.println("x || y = " + (x || y));
    System.out.println("!x = " + !x);
    System.out.println("!x = " + !y);

  }
}