package RecapAndMentoring;

import java.util.Scanner;

public class LetterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // print the numbers between 0 to length of the string
        // print all the letter from this string using for loop
        // print only the char which is 'e'
        System.out.println(" Please enter a string value");
        String str=input.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            //System.out.println(i);
           // System.out.println(str.charAt(i));
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("the total count is : "+count);
    }
}
