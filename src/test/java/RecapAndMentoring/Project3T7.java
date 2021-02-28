package RecapAndMentoring;

import java.util.Scanner;

public class Project3T7 {
    public static void main(String[] args) {
        /*
        Using a scanner enter a sentence that is not separated by space and each word starts with upper case.
         Print given String as separated words with spaces.
Example:
Given Value: "IWantToLearnJava" Output: I Want To Learn Java Example-2:
Given Value: "ItIsSunnyOutside" Output: It Is Sunny Outside
         */
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter a string value: ");
        String word=input.nextLine();
        String newWord=word.charAt(0)+"";
        for (int i = 1; i <word.length() ; i++) {
            if(word.charAt(i)>=65 && word.charAt(i)<=90){
                newWord+=" "+word.charAt(i);
            }else{
                newWord+=word.charAt(i);
            }

        }
        System.out.println(newWord);
    }
}
