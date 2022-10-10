class students2
{
    int sno;
    String sname;
    double savg;
    students2(int a,String b,float c )
    {
      sno=a;
      sname=b;
      savg=c;
      
    }
    void display()
    {
      System.out.println("Student number is:"+sno);
      System.out.println("Student name is:"+sname);
      System.out.println("Student average is:"+savg);
    }class students
  
  }
class students2
  {
    public static void main(String[] args)
    {
      
      studens1 s=new studens1();
      s.display();
    }