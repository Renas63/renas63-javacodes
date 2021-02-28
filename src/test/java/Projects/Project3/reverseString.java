package Projects.Project3;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Reverse a given String and return it, if they have space in the beginning and at the end then remove it.
Example: " Job" -> "boJ"
* " Happy " -> "yppaH"
* "Sun " -> "nuS"
* " Dream Job!" -> "!boJ maerD"
         */
        System.out.println(" please enter a string value: ");
        String word = input.nextLine();
        String reverse = " ";
        for (int i = word.length() - 1; i >= 0; i--) { // opposite of for(int i=0; i<word.length;i++
            reverse += word.charAt(i);// reverse= reverse+word.charAt(i)

           // System.out.print(word.charAt(i));

        }
        System.out.println(reverse.trim());
    }
}
