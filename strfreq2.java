//program to find  lowestfrequency of each character
import java.util.*;
class strfreq2
  {
    public static void main(String args[])
    {
      String str;
      int min=0,charindex=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Stering");
      str=sc.nextLine();
      int n=str.length();
      boolean visited[]=new boolean[n];
      for(int m=0;m<n;m++)
        visited[m]=false;
      System.out.println("Element to count");
      for(int i=0;i<n;i++)
        {
          if(visited[i]==true)
            continue;
          int count=1;
          for(int j=i+1;j<n;j++)
            {
              if(str.charAt(i)==str.charAt(j))
              {
                visited[j]=true;
                count++;
              }
            }
          if(min<count)
          {
            min=count;
            charindex=i;
          }
        }
          System.out.println("Lowest frequency is:"+str.charAt(charindex)+"and occurs"+min+"times");
        }
    }
  