package RecapAndMentoring;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter a string ");
        String newWord=input.nextLine();
        String reverseWord="";
        for (int i = newWord.length()-1; i>=0; i--) {
            reverseWord+=newWord.charAt(i);

        }
        System.out.println(reverseWord);
    }
}
