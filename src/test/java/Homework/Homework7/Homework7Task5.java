package Homework.Homework7;

import java.util.Scanner;

public class Homework7Task5 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes a year from user and print whether that year is a leap year or not.
Input the year: 2016 Output :2016 is a leap year
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter a year ");
        int year = input.nextInt();


        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Year " + year + " is a leap year");
        } else
            System.out.println("Year " + year + " is not a leap year");
        System.out.println();
    }
}
