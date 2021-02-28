package NaveenAndSDET.SDET;

import java.util.Scanner;

public class StrMetPractise {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        /*Using scanner ask user to provide one string value, then
        1. print last char from string
        2, print first char from given
        3.
        print second matching index number of 'a'
        4. print length of string
        5. print middle char from string
        6. print index number of 'f'*/

        System.out.println("What is my city name?");
        String cityName=input.nextLine();

        // sanliurfa
        int length=cityName.length();
        System.out.println(length);// size of string
        System.out.println(cityName.charAt(length-1));// to find out last char of string
        System.out.println(cityName.charAt(length/2)); // middle char from string
        System.out.println(cityName.indexOf("f"));
        System.out.println(cityName.indexOf("a",cityName.indexOf("a")+1));
        System.out.println(cityName.charAt(0));





    }
}
