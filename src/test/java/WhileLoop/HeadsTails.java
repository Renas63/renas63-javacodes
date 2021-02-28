package WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class HeadsTails {
    public static void main(String[] args) {
        // first we will filip the coin then we will ask user to guess the result.
        // if the user guessed correctly we will say you are lucky otherwise we will print "you are loser
        // Ask user that Do you want to play again or not? Yes/No

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String answer;
        int count=0;
        do {
            int number = random.nextInt(2);

            String flippedCoin = number == 0 ? "Head " : "Tail";
            System.out.println(" The coin is flipping ...");
            System.out.println(" please enter your guess");
            String userGuess = input.next();

            if (userGuess.equalsIgnoreCase(flippedCoin)) {
                System.out.println(" you are lucky. your guess is right");
            } else {
                System.out.println("You are loser. your. The correct one is " + flippedCoin);
            }

            System.out.println(" do you want to play again?");
            answer = input.next();
            count++;
        } while (answer.equalsIgnoreCase("yes")&& count<5);

        System.out.println(" Thank you for playing the game.");
    }
}