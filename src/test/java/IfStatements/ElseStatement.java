package IfStatements;

import java.util.Scanner;

public class ElseStatement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your balance");
        double balance=input.nextInt();


        /*
        if the balance is more than 10000 apply 8 percent of interest
        else apply 5 percent of interest print the value after interest rate
         */
        if(balance>10000){
            double interestAmount=balance*0.08;
            balance+=interestAmount;
            System.out.println("(8%)Balance is $" + balance);
        } else{
            double interestAmount=balance*0.05;
            balance+=interestAmount;
            System.out.println("(5%)Balance is $" + balance);

        }
    }
}
