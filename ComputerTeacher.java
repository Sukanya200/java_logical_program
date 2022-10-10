/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/
class Teacher {
  
  String designation;
  String collegename;
  void work()
  {
    System.out.println("Sample Output:");
    System.out.println("Designation: "+designation);
    System.out.println("CollegeName: "+collegename);
  }

}

class ComputerTeacher extends Teacher {
  public void getDetails(String desgn ,String cname)
  {
    this.designation=desgn;
    this.collegename=cname;
  }
  public static void main(String args[])
  {
    ComputerTeacher ct= new ComputerTeacher();
    ct.getDetails("ComputerTeacher","IIT");
    ct.work();
  }
}

