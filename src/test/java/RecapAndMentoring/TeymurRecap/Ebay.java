package RecapAndMentoring.TeymurRecap;

import java.util.ArrayList;
import java.util.List;

public class Ebay {

        /*
        You will be given String, and you have to give back int
        1. If you see vowel letter it means 1
        2. If you will see consonant letter, it means 2
        3. Sum everything and give it back to us

        Example 1:
            Input: Techtorial
            Explanation: T e c t o r i a l
                         2 1 2 2 1 2 1 1 2
            Output: 14

        Example 2: I love Java, Java is easy!
            Input: I _ l o v e _ J a v a , _ J a v a _ i s _ e a s y !
                   1 0 2 1 2 1 0 2 1 2 1 0 0 2 1 2 1 0 1 2 0 1 1 2 2 0
            Output: 28
         */

        /*
        Solution 1:
            1. For loop it
            2. With ASCI table check if it is letters
            3. Count using if statement, checking if they are vowel or not

        Solution 2:
            1. Create List of vowels
            2. For loop it
            3. With Character.isLetter() check if it is letters
            4. Count using if statement, checking if that character is in vowels List

        Solution 3:
            1. Create List of vowels
            2. Delete everything besides letters using regex
            3. For loop it
            4. Count using if statement, checking if that character is in vowels List
         */

    static int countVowelConsonantSolution1(String str) {
        int result = 0;
        for(int i=0; i<str.length(); i++) {
            char letter = str.toLowerCase().charAt(i);

            if(letter>= 'a' && letter <= 'z'){
                if(letter == 'a' || letter == 'e' || letter == 'u' || letter == 'i' || letter == 'o'){
                    result += 1;
                }else {
                    result += 2;
                }
            }

        }
        return result;
    }

    static int countVowelConsonantSolution2(String str) {
        int result = 0;

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('u');
        vowels.add('i');
        vowels.add('o');

        for(int i=0; i<str.length(); i++) {
            char letter = str.toLowerCase().charAt(i);

            if(Character.isLetter(letter)){
                if(vowels.contains(letter)){
                    result += 1;
                }else {
                    result += 2;
                }
            }

        }
        return result;
    }

    static int countVowelConsonantSolution3(String str) {
        int result = 0;

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('u');
        vowels.add('i');
        vowels.add('o');

        str = str.toLowerCase().replaceAll("[^a-z]","");

        for(int i=0; i<str.length(); i++) {
            result += (vowels.contains(str.charAt(i))) ? 1 : 2;
        }
        return result;
    }

    public static void main(String[] args) {
        String input1 = "Techtorial";
        String input2 = "I love Java, Java is easy!";

        System.out.println(countVowelConsonantSolution1(input1));
        System.out.println(countVowelConsonantSolution1(input2));
        System.out.println("------------------------");

        System.out.println(countVowelConsonantSolution2(input1));
        System.out.println(countVowelConsonantSolution2(input2));
        System.out.println("------------------------");

        System.out.println(countVowelConsonantSolution3(input1));
        System.out.println(countVowelConsonantSolution3(input2));
    }
}