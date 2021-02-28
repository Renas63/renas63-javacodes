package StringExample;

import java.util.Scanner;

public class StringMethodPractice {
    public static void main(String[] args) {
        /*Using scanner ask user to provide one string value, then
        1. print last char from string
        2, print first char from given
        3.
        print second matching index number of 'c'
        4. print length of string
        5. print middle char from string
        6. print index number of 'g'*/




        Scanner input= new Scanner(System.in);

        System.out.println(" what is my city name? ");
        String cityName= input.nextLine();
        // chicago    6
        // new york    7
        // last char index number= length-1
        int length=cityName.length();
        System.out.println(cityName.charAt(length-1));// last char
        System.out.println(cityName.charAt(0));// first char
        System.out.println(cityName.length());
        System.out.println(cityName.charAt(6/2));// it will give middle char
        System.out.println(cityName.indexOf("g")); // 5
        System.out.println(cityName.indexOf("c",cityName.indexOf("c")+1));


    }
}
