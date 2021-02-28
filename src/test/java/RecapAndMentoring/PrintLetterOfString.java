package RecapAndMentoring;

import java.util.Scanner;

public class PrintLetterOfString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string value");
        String word= input.nextLine();
        for(int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));

        }



        int i=0;
        while(i<word.length()){

            System.out.println(word.charAt(i));
            i++;
        }
    }
}
