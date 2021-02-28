package ScannerPractice;


import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);

        // short cut to import for mac Option+Enter

        System.out.println("What is your height?");

        double height=input.nextDouble();

        System.out.println("what is your weight?");

        int weight= input.nextInt();

        System.out.println("what is your name ?");

        String name= input.next();

        System.out.println("The height is "+height);
        System.out.println("the weight is " + weight);

    }
}
