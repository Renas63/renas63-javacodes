package RecapAndMentoring;

import java.util.Scanner;

public class Project3T6 {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to enter one string value and
        print only unique letters combined as String also without any space in the beginning and at the end.
Example -1 :
Given Value: "i am happy"
Output: i am hpy
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string value");
        String word=input.nextLine();
        String result="";
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)==' '){
                result=result.concat(" ");
            }else{
                String letter=word.charAt(i)+"";
                if(!result.contains(letter)){
                    result=result.concat(letter);
                }
            }

        }
        System.out.println(result);
    }
}
