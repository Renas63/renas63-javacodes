package Homework.Homework7;

import java.util.Scanner;

public class Homework7Task3 {
    public static void main(String[] args) {
        /*
        Given a string, if one or both of the first 2 chars is 'x',
        print the string without those 'x' chars, and otherwise print the string unchanged.
"xHi" "Hi" "Hxi" "Hi"
→ →
→
"Tesxt" if(word.substring(0,2).equals("xx") || (word.substring(1).equals("x) || (word.substring(2).equals("x)
"Testxt"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word ");
        String word = input.nextLine();
        if(word.substring(0,2).equals("xx")){
            System.out.println(word.substring(2));
        }else if ((word.charAt(0) + "").equals("x")) {
            int xLocation = word.indexOf("x");
            System.out.println(word.substring(1));

        }else if( (word.charAt(1) + "").equals("x")){
            System.out.println(word.substring(0,1).contains(word.substring(2)));
        }
    }
}