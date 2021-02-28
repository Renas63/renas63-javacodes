package RecapAndMentoring;

import java.util.Scanner;

public class Hwk9T4 {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to provide String value.
        Then replace all the char of the String with 'a' using loop and print in every step.
        For example: Input: Success Output: "auccess" "aaccess" “aaacess”
        ... “aaaaaaa”
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string value");
        String word = input.nextLine();
        int  wordLeght= word.length();
        char aChar='a';
        String str="a";
        for (int i = 0; i <word.length(); i++) {
            word=word.replaceFirst("" +word.charAt(i),"a");
            System.out.println(word);
        }
        String aa="";
        String success="success";
        for (int i = 0; i <=word.length(); i++) {
            aa+='a';
            System.out.println(aa+success.substring(i));
        }
    }
}
