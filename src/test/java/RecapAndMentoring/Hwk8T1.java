package RecapAndMentoring;

import java.util.Scanner;

public class Hwk8T1 {
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
        boolean LeapYear=(year%4==0 && year%400==00 && year%100 !=0);
        switch (month){
            case 1:
                System.out.println(" January " + year + " had 31 days "); break;
        }

    }

}
