package RecapAndMentoring;

import java.util.Scanner;

public class AskPrice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Pc price is $500. Please enter the amount");
        double inputAmount= input.nextDouble();

        while(inputAmount<500){
            double requiredAmount=500-inputAmount;
            System.out.println("Please input amount "+requiredAmount);
            inputAmount+= input.nextDouble();


        }
        double exchange=inputAmount-500;
        System.out.println("Here is the pc. The exchange amount" + exchange);
    }
}
