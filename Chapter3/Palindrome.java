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
 
public class Palindrome
{
   public static void main (String[] args)
   {
           String word;
           
           Scanner scan = new Scanner(System.in);
           System.out.print ("Enter word: ");
           word = scan.next();
           length = word.length;
           firstLetter = wordAt(0);
           lastLetter = wordAt(length);
           // Compute if palindrome
           if (word.charAt(0) == word.charAt(word.lastIndexOf())) {
               
            }
 
           
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Current Salary:           " + money.format(currentSalary));
           System.out.println("Amount of your raise: " + money.format(raise));
           System.out.println("Your new salary:          " + money.format(newSalary));
           System.out.println();
        }
}