package Homework.Homework4;

import java.util.Scanner;

public class Homework4Task2 {
    public static void main(String[] args) {

        /*
        Write a program to take three integer inputs from user.
         First find the square of the number and print them
         then find sum of those number after finding squares and print it.
Example:
Please enter three number: 2  3   4
Square of Number: 4  9 16
Sum Of number: 29
         */
        Scanner input=new Scanner(System.in);

        System.out.println("my first number is ");
        int number1= input.nextInt();
        System.out.println("my second number is " );
        int number2= input.nextInt();
        System.out.println("my second number is " );
        int number3= input.nextInt();

        System.out.println("my square of numbers  is " );



        int squareOfNumbers= (number1*number1)+ (number2*number2)+ (number3*number3);
        System.out.println(squareOfNumbers);

    }
}
