package RecapAndMentoring;

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" enter a string ");
        String word= input.nextLine();
        String newWord="";
        for (int i=word.length()-1;i>=0; i--) {
            newWord = newWord.concat(word.charAt(i) + "");
        }
            if(newWord.equals(word)){
                System.out.println("The given string " + word + " is Palindrome ");
            }else{
                System.out.println("not a Palindrome");
            }

        }
    }

