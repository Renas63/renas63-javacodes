package Homework.Homework7;

import java.util.Scanner;

public class Homework7Task4 {
    public static void main(String[] args) {
        /*
        Given a string, if a length 2 substring appears at both its beginning and end,
        print a string without the substring at the beginning, so "HelloHe" yields "lloHe".
         The substring may overlap with itself, so "Hi" yields "".
          Otherwise, print the original string unchanged.
    Example:
    "TestTe" --> print stTe "TestTi" --> print TestTi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string");
        String string = input.nextLine();
        if (string.substring(0, 2).equals(string.substring(string.length()- 2))) {
            System.out.println(string.substring(2));
        }else{
            System.out.println("print original "+string);
        }
    }
}