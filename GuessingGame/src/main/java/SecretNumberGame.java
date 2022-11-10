import java.util.Scanner;

public class SecretNumberGame {
    public static void main(String[] args) {

        //prompt the user for input to guess a number
        System.out.println("Guess a number from 1 to 10");

        // collect user input
        Scanner reader = new Scanner(System.in);
        int guessNumber = reader.nextInt();

        System.out.println("You guessed a number: " + guessNumber);

        // Secret Number
        int secretNumber = 4;

        // if guessNumber = 4, print "Yay, you won!"
        // else print "try again"

        if (guessNumber == 4) {
            System.out.println("Yay, you got it correct!");
        } else if (guessNumber < secretNumber) {
            System.out.println("Too low. Try again");
        }
        else if (guessNumber > secretNumber){
            System.out.println("Too high. Try again");
        }
    }
}
