package Homework.Homework5;

import java.util.Scanner;

public class Homework5Task5 {

    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
        /*
        Using Scanner ask user to enter one of the three string value.
        1- Print first char of those three string together.
        2- Print last char of each string together
        3- Print true if each of the string length are equals to each other. Example:
        Input -1 : We Input -2: Love Input -3: Java Output:
        WLJ
        eea
        false (since each string length is not equals to each other)
         */

        System.out.println(" please enter one of the string value: "+ "  " + "  (We    Love    Java)");
        String str= input.nextLine();
        System.out.println("please enter 3 string values ");
        String str1= input.nextLine();
        System.out.println("please enter the first word ");

        String firstWord= input.nextLine();
        System.out.println("Please enter second word ");
        String secondWord= input.nextLine();
        System.out.println("please enter third word");
        String thirdWord= input.nextLine();
        String firstLetter=firstWord.substring(0,1) + secondWord.substring(0, 1) + thirdWord.substring(0, 1);
        String lastLetter=firstLetter.substring(firstLetter.length()-1)+ secondWord.substring(secondWord.length()-1)+thirdWord.substring(thirdWord.length()-1);
        boolean result= firstLetter.length()==secondWord.length() && secondWord.length() == thirdWord.length();

        System.out.println(firstLetter);
        System.out.println(lastLetter);
        System.out.println(result);





    }
}
