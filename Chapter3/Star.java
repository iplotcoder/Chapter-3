
/**
 * Write a description of class Star here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Star
{
   public static void main (String[] args) {
      // draw stars
      drawA(10, 10);
      drawB(10, 10);
      drawC(10, 10);
      }
      
   public static void drawA(int row, int column) {
       for (int j = 0; j <= column; j++) {
           for (int i = 0; i <= row; i++) {
             System.out.print("*");
            }
           row--;
           System.out.println();
        }
       
    }
   public static void drawB(int row, int column) {
       for (int j = 0; j <= column; j++) {
           for (int i = 10; i <= row; i++) {
             System.out.print("*");
            }
           row++;
           System.out.println();
        }
    }
   public static void drawC(int row, int column) {
       int spaces = 0;
       for (int j = 0; j <= column; j++) {
           for(int x = 0; x < spaces; x++) {
                 System.out.print(" ");
                }
           for (int i = 0; i <= row; i++) {
             System.out.print("*");
            }
           spaces ++; 
           row--;
           System.out.println();
        }
    }
   public static void drawD(int row, int column) {
       int spaces = 5;
       for (int j = 0; j <= column; j++) {
           for(int x = 0; x < spaces; x++) {

                }
           for (int i = 0; i <= row; i++) {
             System.out.print("*");
            }
           spaces ++; 
           row--;
           System.out.println();
        }
    }
   public static void printItem(int amount) {
       for(int x = 0; x < amount; x++) {
                 System.out.println();
                }
       System.out.println();
    }
   } // end of main
