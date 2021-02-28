package Homework.Homework6;

import java.util.Scanner;

public class Homework6Task4 {
    public static void main(String[] args) {

        /*
        Using scanner enter String (two words) value with spaces in the beginning and at the end.
 In this input the second word is not starting with upper case,
  using string methods change the letter with upper case and print it
Example 1:
Please enter the String with following format “ word “ Natural black
The output is:
Natural Black */
        Scanner input= new Scanner(System.in);

        // Natural black
        System.out.println("Please enter two words: ");
        String twoWord=input.nextLine();
        twoWord=twoWord.trim();
        String firstLetter=twoWord.substring(0, twoWord.indexOf(" "));
        String firstWordFirstChar=firstLetter.charAt(0)+"";
        firstWordFirstChar=firstWordFirstChar.toUpperCase();
        String secondLetter=twoWord.substring(twoWord.indexOf(" ")+1);
        String secondWordFirstChar=secondLetter.charAt(0)+"";
        secondWordFirstChar=secondWordFirstChar.toUpperCase();

        String newTwoWord =firstWordFirstChar+firstLetter.substring(1)+" "+secondWordFirstChar+secondLetter.substring(1);
        System.out.println(newTwoWord);



        /*
        System.out.println("Please enter two words:");
        String twoWords=input.nextLine();
        twoWords=twoWords.trim();
        String wordOne=twoWords.substring(0, twoWords.indexOf(" "));
        String firstWordFirstChar=wordOne.charAt(0)+"";
        firstWordFirstChar=firstWordFirstChar.toUpperCase();
        String wordTwo=twoWords.substring(twoWords.indexOf(" ")+1);
        String secondWordFirstChar=wordTwo.charAt(0)+"";
        secondWordFirstChar=secondWordFirstChar.toUpperCase();
        String newTwoWords=firstWordFirstChar+wordOne.substring(1)+" "+secondWordFirstChar+wordTwo.substring(1);
        System.out.println(newTwoWords);
        */




    }
}
