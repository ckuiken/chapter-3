 
import java.util.Scanner;
import java.text.NumberFormat;
public class ChargeAccount
{
    double previousBalance;
    double additionalBalance;
    double newBalance;
    double interest;
    String rating;            
 
    Scanner scan = new Scanner(System.in);

    public ChargeAccount()
    {
        
    }
    
    public void setPreviousBalance() {
        System.out.print ("Enter the Current Balance: ");
        previousBalance = scan.nextDouble();
    }

    public void setAdditionalCharges() {
        System.out.print ("Enter the Additional Balance: ");
        additionalBalance = scan.nextDouble();
    }

    public void setNewBalance() {
        newBalance=previousBalance+additionalBalance;
    }
    
    public void interest() {
        double percent = 1; 
        if (newBalance < 0) {
        interest = 0;
    }
    if (newBalance >= 0 && newBalance <= 49.99) {
        interest = 0;
    }
    if (newBalance >= 50 && newBalance <= 300) {
        interest = 50.0;
    }
    if (newBalance > 300) {
        interest = (newBalance * 0.2) + newBalance;
    }
            
        interest = percent*newBalance;
        
        newBalance = previousBalance + additionalBalance + interest;
    }

           
    public void printResults() {
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println();
           System.out.println("Previouis Balance:           " + money.format(previousBalance));
           System.out.println("Additional Charges:          " + money.format(additionalBalance));
           System.out.println("Interest:                    " + money.format(interest));
           System.out.println();
           System.out.println("New Balance                  "+ money.format(newBalance));  
           System.out.println();
           System.out.println("Minimum Payment              "+ money.format(interest));
    }
      
        }