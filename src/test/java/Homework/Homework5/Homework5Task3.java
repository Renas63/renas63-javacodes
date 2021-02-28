package Homework.Homework5;

import java.util.Scanner;

public class Homework5Task3 {
    public static void main(String[] args) {
        /*
        1. Create a class with main method.
2. Create a Scanner object inside main method
3. Ask the user to enter random word
4. Then ask the user to input number of letters that word consist
5. Your code should print True if user entered right number of letters in word,
False if wrong number is entered.
6. Then code should ask to enter a letter that user wants to find index of.
7. Your code should print index of entered letter,
if word doesn’t consist the letter then code should print -1 */

        Scanner input= new Scanner(System.in);

        System.out.println(" enter a random word");
        String word=input.next();
        System.out.println("enter a number");
        int num=input.nextInt();
        boolean result= word.length()==num;

        System.out.println(result);

        System.out.println("please a letter you want the index of ");
        String letter= input.next();
        int indexLetter=word.indexOf(letter);
        System.out.println(indexLetter);
    }
}
