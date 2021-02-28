package Homework.Homework10;

import java.util.Scanner;

public class Task5 {
    /*
    Description
Write a program in Java to display the any number in reverse order.
Test Data :
Input a number: 12345
Expected Output :
The number in reverse order is : 54321
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int number=input.nextInt();
        System.out.print("the number in reverse order is : ");
    int digit=0;
    while(number>0){
        digit=number%10;
        System.out.print(digit);
        number= number/10;

      }
    }
}
