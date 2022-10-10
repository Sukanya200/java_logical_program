import java.util.*;
class Hashmap
  {
    public static void main(String args[])
    {
      PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul"); 
System.out.println(queue);   
Iterator<String> i=queue.iterator();  
while(i.hasNext()){  
System.out.println(i.next());  
    }
 queue.remove(); 
      System.out.println("remove one elements");
Iterator<String> i2=queue.iterator();  
while(i2.hasNext()){  
System.out.println(i2.next());  
  }
  }
  }
