/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

public class DiamondPattern {

//Add main method here
  public static void main(String args[])
  {

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)
int i,j,k,m,ch=97;
//use for loop and if condition to print a,b,c 
     for(i=1;i<=3;i++)
       {
         
         for(j=1;j<=3-i;j++)
           {
             System.out.print(" ");
           }
         for(k=1;k<=(2*i)-1;k++)
           {
             if(k<i)
              System.out.print((char)ch+++" ");
            else if(k==i)
              System.out.print((char)ch+" ");
            else 
              System.out.print((char)--ch+" ");
           }
         System.out.println();
       }
         for(i=2;i>=1;i--)
           {
             for(j=1;j<=3-i;j++)
               {
                 System.out.print(" ");
               }
             for(m=1;m<=(2*i)-1;m++)
               {
                 if(m<i)
                   System.out.print((char)ch+++" ");
                 else if(m==i)
                  System.out.print((char)ch+" ");
                 else
                  System.out.print((char)--ch+" ");
               }
             System.out.println();
               }
           }
}

               
             
  