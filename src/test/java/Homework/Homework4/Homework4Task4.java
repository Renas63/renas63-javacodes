package Homework.Homework4;

import java.util.Scanner;

public class Homework4Task4 {
    public static void main(String[] args) {

        /*
        Using scanner ask user to enter 3 integral number.
        If those 3 inputs are equals to each other print true otherwise print false.
        Example-1:
        Three Number: 8  8  8
        Output: true
        Example-2: Three Number: 5  5  4
        Output: false (since last number 4 is different than others)
         */

        Scanner input= new Scanner(System.in);

        System.out.println("Enter first integer number ");
        int num1=input.nextInt();

        System.out.println("Enter second integer number ");
        int num2= input.nextInt();

        System.out.println("Enter third integer number");
        int num3= input.nextInt();

        boolean integerNumber= num1==num2 && num2==num3;
        System.out.println("Three numbers are equal? "+ integerNumber);





    }
}
