import java.util.Scanner;
 class leapyear
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
    System.out.print("Enter a year : ");
    int a=sc.nextInt();
   
          
    if (a%4==0&&a%400==0)
    {
      System.out.println(" "+a+" is leapyear");
      
    }
    else
    {
    System.out.println(" "+a+" is not leap year");
    }
  } 
}