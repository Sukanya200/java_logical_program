import java.util.Scanner;

 class bill {
  public static void main(String args[]) {
    int no;
    String name;
    int pmr,lmr;
    double bill=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("given cus num is:");
    no=sc.nextInt();
    System.out.println("given cus name is:");
    name=sc.next();
    System.out.println("given present month reading is:");
    pmr=sc.nextInt();
    System.out.println("given last month reading is:");
    lmr=sc.nextInt();
    
    int tu;
    tu=pmr-lmr;

   
    System.out.println("given cus num is:"+no);
    System.out.println("given cus name is:"+name);
    System.out.println("given present month reading is:"+pmr);
    System.out.println("given last month reading  is:"+lmr);
    if(tu<=50)
    {
      bill=tu*3.40;
      System.out.println("the given bill is:"+bill);
    }
    else if(tu<=100)
    {
      bill=50*3.40+(tu-50)*4.56;
      System.out.println("the given bill is:"+bill);
    }
    else if(tu<=200)
    {
      bill=50*3.40+50*4.56+(tu-100)*5.43;
      System.out.println("the given bill is:"+bill);
    }
    else if(tu<=300)
    {
      bill=50*3.40+50*4.56+100*5.43+(tu-200)*6.54;
      System.out.println("the given bill is:"+bill);
    }
    else if(tu>300)
    {
      bill=50*3.40+50*4.56+100*5.43+200*6.54+(tu-300)*7.54;
      System.out.println("the given bill is:"+bill);
    }
    else
    {
      System.out.println("the given bill is:"+bill);
    }
  }
 }
