package Homework.Homework7;

import java.util.Scanner;

public class Homework7Task2 {
    public static void main(String[] args) {
    /*
    Using scanner ask user to enter any String value.
    If this String has the color like red or blue with lower case print the red or blue.
EXAMPLE-1: Input: "xxredyy" Output: red EXAMPLE-2: Input: "xbxltue" Output: blue
     */
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter a string value: ");
        String word = input.nextLine();
        if (word.contains("r") && word.contains("e") && word.contains("d")) {
            System.out.println("red");
        }
        if (word.contains("b") && word.contains("l") && word.contains("u") && word.contains("e")) {
            System.out.println("blue");

        } else {
            System.out.println("no color name found ");
        }
    }
}
