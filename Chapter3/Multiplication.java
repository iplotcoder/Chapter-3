// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Multiplication
{
   public static void main (String[] args) {

      // print main table
      for (int i = 1; i <= 12; i++) {
         if (i<10) {
             System.out.print(" " + i + "|");
            }
         else if (i>=10) {
             System.out.print(i + "|");
            }
         for (int j = 1; j <= 12; j++) {
            if (i*j < 10) {
                System.out.print("   " + i*j );
            }
            else if (i*j >= 10 && i*j < 100) {
                System.out.print("  " + i*j );
            }
            else if (i*j >= 100) {
                System.out.print(" " + i*j );
            }
         }
         System.out.println();
      }
   } // end of main
}