package Homework.Homework10;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Description
    Write a program in Java to check whether a String is a palindrome or not.
    Test Data :
    Input a number: Civic
    Expected Output :
    Civic is palindrome
    NOTE: A string is said to be a palindrome if the string read from left to right is equal to the string read from right to left. For example, ignoring the difference between uppercase and lowercase letters,
    the string "iTopiNonAvevanoNipoti" is a palindrome
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        String word= input.nextLine().trim();
        String newWord="";
        for(int i=word.length()-1;i>=0;i--){
            newWord=newWord.concat(word.charAt(i)+"");
        }
        if(newWord.equals(word)){
            System.out.println("This is  Palindrome");
        }else{
            System.out.println("NO!!!!!");
        }
    }
}
            /*
            boolean isPalindrome=true;
            for(int i=0; i<word.length()/2; i++){
            int end= word.length()-1-i;
            if(word.charAt(i) !=word.charAt(end){
            isPalindrome=false;
            break;
            }
            }
            System.out.println(word+ "is Palindrome: " + isPalindrome);
            */