package Homework.Homework8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to input the month number and year number.
        Then print the number of the days in a month.
Test Data
Input a month number: 2 Input a year: 2016 Expected Output :
February 2016 has 29 days
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a month ");
        int month= input.nextInt();
        System.out.println(" please enter a year");
        int year= input.nextInt();
        boolean leapYear=(year%4==0 ||year%400==0 && year%100 !=0 );
        switch (month){
        case 1: System.out.println(
                "January " + year + " had 31 days"); break;
        case 2: System.out.println("February " + year + " had" +
                ((leapYear) ? " 29 days" : " 28 days")); break;
        case 3: System.out.println(
                "March " + year + " had 31 days"); break;
        case 4: System.out.println(
                "April " + year + " had 30 days"); break;
        case 5: System.out.println(
                "May " + year + " had 31 days"); break;
        case 6: System.out.println(
                "June " + year + " had 30 days"); break;
        case 7: System.out.println(
                "July " + year + " had 31 days"); break;
        case 8: System.out.println(
                "August " + year + " had 31 days"); break;
        case 9: System.out.println(
                "September " + year + " had 30 days"); break;
        case 10: System.out.println(
                "October " + year + " had 31 days"); break;
        case 11: System.out.println(
                "November " + year + " had 30 days"); break;
        case 12: System.out.println(
                "December " + year + " had 31 days");
    }

    }
}