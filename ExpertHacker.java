/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.*;
class BankAccount { 
//declare account_number , account_balance
private int account_number;
  private double account_balance;
  void read()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter BankAccount Number :");
    account_number=sc.nextInt();
    System.out.println("Enter Current Balance    :");
    account_balance=sc.nextDouble();
    
  }
//create getters and setters
  public void setNo(int account_number)
  {
  this.account_number=account_number;
  }
  public int getNo()
  {
    return account_number;
  }
  public void setBalance(double account_balance)
  {
    this.account_balance=account_balance;
  }
  public double getBalance()
  {
    return account_balance;
  }
  public void display()
  {
    System.out.println("Expected Output:");
    System.out.println("BankAccount Number :" + account_number);
     System.out.println("Current  Balance  :" + account_balance);
    
  }
  
   
}  

class ExpertHacker { 
//main method
public static void main(String args[]) { 
//create Scanner object
BankAccount Ba = new BankAccount();
  Ba.read();
  Ba.display();
}
}
//Take input from user

//Create an object of BankAccount class and set account_number and the account_balance

// Try accessing fields of BankAcccount class and check whether it's accessible 

// or not. If not then try accessing it with it’s setter and getter methods. 

// Print account_number and account_balance 

