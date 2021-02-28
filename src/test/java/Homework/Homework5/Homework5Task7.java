package Homework.Homework5;

import java.util.Scanner;

public class Homework5Task7 {
    public static void main(String[] args) {
        /*
        Using scanner enter two string input. Print true first input contains the second string or
second input contains the first input.
Example 1:
Please enter First String value: Amazon Product
Please enter Second String value: Product
Result : True
Example 2:
Please enter First String value: Product
Please enter Second String value: Amazon Product
Result: True
         */

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter first string value:");
        String firstValue=input.nextLine();
        System.out.println("Please enter second string value:");
        String secondValue=input.nextLine();

        boolean result=firstValue.contains(secondValue) || secondValue.contains(firstValue);
        System.out.println(result);

    }
}
