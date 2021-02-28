package DoWhileLoop;

import java.util.Scanner;

public class AskPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        System.out.println(" the phone price is $500 . Please enter the amount");
        do {
            userInput += input.nextDouble();

        } while (userInput < 500);

        System.out.println("Here is the Phone");
    }
}
