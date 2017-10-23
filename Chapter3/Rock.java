// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        //Get player's play -- note that this is stored as a string
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter your play: ");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        //Translate computer's randomly generated play to string
        if (computerInt == 0) {
            computerPlay = "R";
        }
        else if (computerInt == 1) {
            computerPlay = "P";
        }
        else if (computerInt == 2) {
            computerPlay = "S";
        }
        else {
            computerPlay = "None";
        }
        //Print computer's play
        System.out.println ("Computer play is " + computerPlay);
        //See who won.
        if (computerPlay.equals(personPlay)) {
            System.out.println ("You Tied");
        }
        else if ((computerPlay.equals( "R")) && (personPlay.equals("P"))) {
            System.out.println ("Paper beats rock, you win!");
        }
        else if ((computerPlay.equals("R")) && (personPlay.equals("S"))) {
            System.out.println ("Rock beats scissors, you lose!");
        }
        else if ((computerPlay.equals("P")) && (personPlay.equals("S"))) {
            System.out.println ("Scissors beats paper, you win!");
        }
        else if ((computerPlay.equals( "P")) && (personPlay.equals( "R"))) {
            System.out.println ("Paper beats rock, you lose!");
        }
        else if ((computerPlay.equals( "S")) && (personPlay.equals( "R"))) {
            System.out.println ("Rock beats scissors, you win!");
        }
        else if ((computerPlay.equals( "S")) && (personPlay.equals( "P"))) {
            System.out.println ("Scissors beats paper, you lose!");
        }
        else {
            
        }
    }
}
