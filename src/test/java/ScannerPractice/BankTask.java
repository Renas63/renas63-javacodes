package ScannerPractice;

import java.util.Scanner;

public class BankTask {
    public static void main(String[] args) {

        /*Scanner input= new Scanner(System.in);

        System.out.println(" David first deposit? ");
        int dep1= input.nextInt();
        System.out.println("David second deposit? ");
        int dep2= input.nextInt();
        System.out.println("David third deposit? ");
        int dep3= input.nextInt();
        System.out.println("David total deposit?");
        int totalDeposit=dep1+dep2+dep3;
        System.out.println(totalDeposit);
        System.out.println("How much is computer cost?");

        int compCost= input.nextInt();

        System.out.println("how much is phone cost?");

        int phoneCost= input.nextInt();

        System.out.println("How much did David spend for computer and phone?");
        int totalCost= 350+259;
        System.out.println(totalCost);
        System.out.println("How much money David has in his bank account");
        int accountBalance= input.nextInt();
        int remainder= 1200-609;
        System.out.println(remainder);*/

        Scanner input= new Scanner(System.in);

        double deposit=100;

        System.out.println("what is your deposit amount");
        deposit+=input.nextDouble();
        System.out.println("what is your deposit amount");
        deposit+= input.nextDouble();
        System.out.println("what is your deposit amount");
        deposit+= input.nextDouble();
        System.out.println("Your balance " + deposit);

        System.out.println("How much money you spend on your Computer: ");
        deposit-=input.nextInt();
        System.out.println("How much money you spend on your phone: ");
        deposit-=input.nextInt();
        System.out.println("Your balance is: "+"$"+deposit);

    }
}
