import java.util.Scanner;
class calculation
  {
    public static void main(String agrs[])
    {
      int a=0,b=0,choice,c;
      Scanner sc=new Scanner(System.in);
      System.out.println(" [1].Addition");
      System.out.println(" [2].Subtraction");
      System.out.println(" [3].Multiplication");
      System.out.println(" [4].Division");
      System.out.println(" [5].Remainder");
      
      System.out.println("you need to enter your choice");
       choice=sc.nextInt();
      if(choice<=5)
      {
      System.out.println(" enter a value");
       a=sc.nextInt();
      System.out.println(" enter b value");
       b=sc.nextInt();
      }
      switch(choice)
        {
          case 1:
            c=a+b;
            System.out.println("addition:");
            break;
            case 2:
            c=a-b;
            System.out.println("subtraction: ");
            break;
            case 3:
            c=a*b;
            System.out.println("multipication:");
            break;
            case 4:
            c=a/b;
            System.out.println("division: ");
            break;
            case 5:
            c=a%b;
            System.out.println("remainder: ");
            break;
          default:
            System.out.println("wrong");
            
        }
    }
  }