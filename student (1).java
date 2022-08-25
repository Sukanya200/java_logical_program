import java.util.Scanner;
class student
  {
    public static void main(String args[])
    {
      int stdnum, sub1,sub2,sub3,totalmarks=0,avg=0;
      String sname;
      Scanner sc=new Scanner(System.in);
      System.out.println("given student number is");
       stdnum=sc.nextInt();
      System.out.println("given a student name is");
      sname=sc.next();
      System.out.println("given  a sub1 is");
      sub1=sc.nextInt();
      System.out.println("given a sub2 is");
      sub2=sc.nextInt();
      System.out.println("given a sub3 is");
      sub3=sc.nextInt();
      totalmarks=sub1+sub2+sub3;
      avg=totalmarks/3;
      System.out.println("the student num:"+stdnum );
      System.out.println("the student name is:"+sname );
      System.out.println("the sub1 is:"+sub1 );
      System.out.println("the sub2 is:"+sub2);
      System.out.println("the sub3 is:"+sub3);
      System.out.println("the total marks is:"+totalmarks);
      System.out.println("the average is:"+avg);
      
      if(sub1>=40 && sub2>=40 && sub3>=40)
      {
        System.out.println("the result:pass");
      
      else if(avg<50)
      {
        System.out.println("the grade is C");
      }
      else if(avg>=51 && avg<=70)
      {
        System.out.println("the grade is B");
      }
      else if(avg>=71 && avg<-80)
      {
        System.out.println("the grade is A");
      }
      else if(avg>80)
      {
        System.out.println("student pass in distension");
      }
    }
      else
      {
        System.out.println("result is fail");
      }
      }
    }
  