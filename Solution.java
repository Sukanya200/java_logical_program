import java.util.Scanner;
class Mycalculator{
  public long power(int n, int p)throws Exception
  {
    if(n==0 && p==0)
      throw new Exception("n and p should not be zero");
    else if(n<0||p<0)
      throw new Exception("n and p should not be negative");
    else 
      return (long)(Math.pow(n,p));
  }
}
  public class Solution {
    //public static final Mycalculation my_calculator= new mycalculator();
    //public static final Scanner sc=new Scanner(System.in);
    public static void main (String args[])
    {
Scanner in=new Scanner(System.in);
 Mycalculator my_calculator= new Mycalculator();
      
      
          int n=in.nextInt();
          int p=in.nextInt();
          try{
            System.out.println(my_calculator.power(n,p));
        }
          catch(Exception e){
            System.out.println(e);
          }
    }
  
  }
