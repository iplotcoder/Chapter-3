// ***************************************************************
//   CreditCard.java
//.
// ***************************************************************
 
import java.util.Scanner;
 
public class CreditCard
{
   public static void main (String[] args)
   {
           double previousBalance;  // previous balance on card
           double additionalCharges;              // additional charges in one month
           double interest;         
           double newBalance;             // previous + additional + interest
           double minPayment;
           
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the additional charges during the month: ");
           additionalCharges = scan.nextDouble();
 
           // Initializing interest
           if (previousBalance != 0) {
               interest = .02 * (previousBalance + additionalCharges); 
             }
           else {
               interest = 0;
            }
            
           //Initializing newBalance
           newBalance = previousBalance + additionalCharges + interest;
           
           //Initializing minimum payment due
           if (newBalance < 50) {
               minPayment = newBalance;
            }
           else if (newBalance >= 50 && newBalance <= 300) {
               minPayment = 50;
            }
           else if (newBalance > 300) {
               minPayment = .2 * newBalance;
            }
           else {
               minPayment = 0;
            }
 
           // Print the results
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println();
           System.out.println("Previous Balance: " + previousBalance + "$");
           System.out.println("Additional Charges: " + additionalCharges + "$");
           System.out.println("Interest: " + interest + "$");
           System.out.println();
           System.out.println("New Balance: " + newBalance + "$");
           System.out.println();
           System.out.println("Minimum Payment: " + minPayment + "$");
        }
}