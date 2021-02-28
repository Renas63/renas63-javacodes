package WhileLoop;

import java.util.Scanner;

public class AskThePrice {
    public static void main(String[] args) {
        // phone=500
        //100
        // please enter 400 more
        // 100
        // please enter 300
        //300
        // here is the phone
        // input<pricePhone
        Scanner input= new Scanner(System.in);
        System.out.println(" the phone price is $500 . Please enter the amount");
        double userInput= input.nextDouble();
        while(userInput<500){
            double requiredAmount=500-userInput;
            System.out.println(" Please input : " +requiredAmount);
            userInput+=input.nextDouble(); // 100 more +250
        }

        double exchange=userInput-500;
        System.out.println("Here is the phone. The exchange amount is " +exchange);

    }         //WE DON'T HAVE A ELSE IN WHILE LOOP
}
