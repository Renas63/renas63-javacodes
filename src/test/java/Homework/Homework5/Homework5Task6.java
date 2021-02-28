package Homework.Homework5;

import java.util.Scanner;

public class Homework5Task6 {
    public static void main(String[] args) {
        /*
        Using Scanner ask user to enter one string value with three word 1- Print first letter of each word
        2- Print last letter of each word
        3- Print length of each word (BONUS QUESTION)
        Example: Please enter value: "Java String Test"
        Output: JST         agt
        4  6     4
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three words:");
        String sentence = input.nextLine();

        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String secondWord = sentence.substring(sentence.indexOf(" ") + 1, sentence.indexOf(" ", sentence.indexOf(" ") + 1));
        String thirdWord = sentence.substring(sentence.indexOf(" ", sentence.indexOf(" ") + 1));
        thirdWord = thirdWord.trim();

        char firstCapLetter = firstWord.charAt(0);
        char secondCapLetter = secondWord.charAt(0);
        char thirdCapLetter = thirdWord.charAt(0);
        System.out.print(firstCapLetter);
        System.out.print(secondCapLetter);
        System.out.println(thirdCapLetter);

        char firstEndLetter = firstWord.charAt(firstWord.length() - 1);
        char secondEndLetter = secondWord.charAt(secondWord.length() - 1);
        char thirdEndLetter = thirdWord.charAt(thirdWord.length() - 1);
        System.out.print(firstEndLetter);
        System.out.print(secondEndLetter);
        System.out.println(thirdEndLetter);

        System.out.println(firstWord.length());
        System.out.println(secondWord.length());
        System.out.println(thirdWord.length());


    }


}
