// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
public class Salary
{
    double currentSalary;
    double raise; 
    double newSalary;          
    String rating;            
 
    Scanner scan = new Scanner(System.in);

    public Salary()
    {
        
    }

    public void setSalary() {
        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
    }

    public void setRating() {
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();
    }
    
    public void computeRaise() {
        double percent = 0.015; 
        if (rating.equals("Excellent") ){
            percent = 0.06;
        }
        else if (rating.equals("Good")) {
            percent = 0.04;
        }
            
        raise = percent*currentSalary;
        
        newSalary = currentSalary + raise;
    }

           
    public void printResults() {
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Current Salary:           " + money.format(currentSalary));
           System.out.println("Amount of your raise: " + money.format(raise));
           System.out.println("Your new salary:          " + money.format(newSalary));
           System.out.println();
    }
      
        }
