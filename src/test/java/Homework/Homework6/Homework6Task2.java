package Homework.Homework6;

public class Homework6Task2 {
    public static void main(String[] args) {

        /*
        Please use method chaining for the following Strings. Methods are provided next to the String.
String “ Snicker “; —> trim, toUpperCase, substring and charAt methods
String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’, concat with ’s’, starts with ‘C’
         */

        String word1="   Snicker  ";
       char result =word1. trim().toUpperCase().substring(2,5).charAt(0);
        System.out.println(result);

        String word2= "Cookie";
        boolean result1= word2.toLowerCase().replace('o', 'u').concat("s").startsWith("C");
        System.out.println(result1);


       // String snicker= " Snicker ";
        //char ch=snicker.trim().toUpperCase().substring(2,4).charAt(0);



    }
}
