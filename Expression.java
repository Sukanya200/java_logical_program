import java.util.Scanner;

public class Expression {


//main method
  public static void main(String[]args){
    
  

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
    Scanner sc=new Scanner(System.in);

/*Take input from user
  System.out.println("Enter a value: ");
  int a=sc.nextInt();
*/
    System.out.println("entre a value:");
    int a=sc.nextInt();
    System.out.println("entre b value:");
    int b=sc.nextInt();
    int c= a-- - --a;
    System.out.println("c :"+c);
    int d= a--;
    System.out.println("d :"+d);
    int e=a>>2;
    System.out.println("e :"+e);
    int f=a&b;
    System.out.println("f :"+f);
    

//print appropriate result for Expression operators
  }
}