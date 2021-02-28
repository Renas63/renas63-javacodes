package Zoom;

import java.util.Scanner;

public class PrintOfStringPract {
    public static void main(String[] args) {

        // print every letter of the given string
        Scanner input=new Scanner(System.in);
        System.out.println("enter a String value:");
        String word=input.next();
        String lastThree=word.substring(word.length()-3);
        char third=word.charAt(2);
        System.out.println(lastThree);
        //int index=word.length()-3;
        /*
        while(index<word.length()){
            System.out.println(word.charAt(index));
            index++;
        }
        for(int index=word.length()-3; index<word.length(); index++){
            System.out.print(word.charAt(index));
        }
         */
    }
}

