package everyhting;

import java.util.Scanner;

public class game {

    Scanner user_input = new Scanner(System.in);
    //Produce your own Number Guessing Game
    //• 1 Human and 1 Computer Player
    //• Must use a Java object
    //• Must produce a random number by the computer player which
    //the human player guesses
    //• Computer announces if the guess is higher or lower than
    //generated number
    //• Number of guesses is limited
    //• Must announce the winner
    //• Must play best of three
    int userInput = user_input.nextInt();
    int random_int = (int)Math.floor(Math.random()*100);
}
