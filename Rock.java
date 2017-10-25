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
        char personP;
        String computerPlay;   //Computer's play -- "R", "P", or "S"
        char computerP;
        int computerInt;      //Randomly generated number used to determine
        String winAction;
        String loseAction;
        
        Scanner scan = new Scanner(System.in);                      //computer's play
        Random random = new Random();
        
        Random generator = new Random();
        System.out.println("Enter your play: R, P, or S");
        personPlay = scan.next();
        
        personPlay = personPlay.toUpperCase();
        
        computerInt = random.nextInt(3);
        if(computerInt == 0) {
            computerPlay = "Rock";
            winAction = " smashes ";
            loseAction = " covers ";
        }
        else if(computerInt == 1) {
            computerPlay = "Paper";
            winAction = " covers ";
            loseAction = " cuts ";
        }
        else {
            computerPlay = "Scissors";
            winAction = " cuts ";
            loseAction = " smashes ";
        }
        System.out.println("The computer choses " + computerPlay);
        
        computerP = computerPlay.charAt(0);
        
        personP = personPlay.charAt(0);
        
        
        if (personP == 'P') {
            personPlay = "Paper";
        }
        else if (personP == 'S') {
            personPlay = "Scissors";
        }
        else {
            personPlay = "Rock";
        }
        
        if(computerP == personP) {
           System.out.print("You and the computer have both chosen " + computerPlay);
           System.out.print(", it's a tie!");
        }
        else {
         if((computerP == 'R' && personP == 'S') || (computerP == 'S' && personP == 'P') || (computerP == 'P' && personP == 'R')) {
            personPlay = personPlay.toLowerCase();
             System.out.println(computerPlay + winAction + personPlay + ", you lose.");
         }
         if ((personP == 'R' && computerP == 'S') || (personP == 'S' && computerP == 'P') || (personP == 'P' && computerP == 'R')) {
             computerPlay = computerPlay.toLowerCase();
             System.out.println(personPlay + loseAction + computerPlay + ", you win!");
         }
        }
    }
}


