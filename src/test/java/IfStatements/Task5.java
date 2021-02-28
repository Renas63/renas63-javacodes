package IfStatements;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        using scanner enter the number
        if this number is bigger than 10, print bigger than 10

        if this number is bigger than 8, print bigger than 8

        if this number is bigger than 4, print bigger than 4
        otherwise print it is less than 4
         */
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        System.out.println("Please enter a number");
        if (number > 10) {
            System.out.println("Print the number is bigger than 10");

        } else if (number > 8) {
            System.out.println("print bigger than 8");

            }else if(number > 4){
                System.out.println("print bigger than 4 ");
            } else if (number==4) {
            System.out.println(" number is equal to 4");
            } else{
            System.out.println("less than a 4");
        }
    }
}
