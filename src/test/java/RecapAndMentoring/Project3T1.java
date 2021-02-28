package RecapAndMentoring;

import java.util.Scanner;

public class Project3T1 {
    /*
        Reverse a given String and return it, if they have space in the beginning and at the end then remove it.
Example: " Job" -> "boJ"
* " Happy " -> "yppaH"
* "Sun " -> "nuS"
* " Dream Job!" -> "!boJ maerD"
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String word=input.nextLine();
        String reverse=" ";

        for(int i=word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse.trim());

        System.out.println("*****************************************************");

        String newWord=input.nextLine();
        String reverseWord="";
        for (int i = newWord.length(); i>0; i--) {
            reverseWord+=newWord.charAt(i);

        }
        System.out.println(reverseWord);
    }
}
