/*JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class

//Add MathTeacher class

//Add EnglishTeacher class

//Add MusicTeacher class

class Teacher
  {
   
    static String college="IIT";
  }
    
class MathTeacher extends Teacher
  {
    void work()
    {
    System.out.println("Math Teacher      "+college);
    }
  }
    class EnglishTeacher extends Teacher
  {
    void work()
    {
    System.out.println("English Teacher   "+college);
    }
    
  }
    class MusicTeacher extends Teacher
  {
    void work()
    {
    System.out.println("Music Teacher     "+college);
    
  }
  }
class CollegePrincipal {
public static void main(String args[])
  {
    MathTeacher m1=new MathTeacher();
    EnglishTeacher e1=new EnglishTeacher();
    MusicTeacher mu=new MusicTeacher();
    m1.work();
    e1.work();
    mu.work();
  }
}
    
  
//Add the main method here and create all different types of Teacher objects and print there college name designation.
   