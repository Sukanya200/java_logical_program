/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
  class  Sport { 

// Create a member variable for Sport name 
private String name="Football";
// Set member variable for Sport name 
  public void setName(String name)
  {
  this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public void display()
  {
    System.out.println("Sample Output:");
    System.out.println("Sport name:"+name);
  }

public static void main(String args[]) { 

// Create object for Sport class 
Sport s= new Sport();
  s.display();
// Print the value of Sport name using "this" reference

} 

}