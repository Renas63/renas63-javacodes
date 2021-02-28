package Homework.Homework8;

import java.util.Scanner;

public class Task5 {
    /*
    Write the program to check whether a character is an alphabet, digit or special character.
    NOTE: you can use the ascii numbers to check the value of the character.
Test Data :@
Expected Output :This is a special character.
     */
    public static void main(String[] args) {
        System.out.println("please enter a character");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "  is a alphabet!");
        } else if (ch > '0' && ch < '9') {
            System.out.println(ch + " is a digit!");
        } else {
            System.out.println(ch + " is a special character!");
        }
    }
}
