// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess = 0;                //The user's guess
          int numGuesses = 0;
          int highGuesses = 0;
          int lowGuesses = 0;
          
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          numToGuess = generator.nextInt(10) + 1;
          while(guess < 1 || guess > 10) {
              System.out.print("Guess a number between 1-10: ");
              guess = scan.nextInt();
              numGuesses++;
              if(numToGuess > guess) {
                      lowGuesses++;
                    }
                  else {
                      highGuesses++;
                    }
           }
          
          numGuesses++;    
          
          while (numToGuess != guess)  //keep going as long as the guess is wrong
            {
                  System.out.println("Your guess was wrong. ");
                  if(numToGuess > guess) {
                      System.out.print("Guess higher: ");
                      lowGuesses++;
                    }
                  else {
                      System.out.print("Guess lower: ");
                      highGuesses++;
                    }
                  numGuesses ++;
                  guess = scan.nextInt();
          }
 
          System.out.println("You guessed correctly!");
          System.out.println("Number of low guesses: " + lowGuesses);
          System.out.println("Number of high guesses: " + highGuesses);
          System.out.println("Total number of guesses: " + numGuesses);
        }
}