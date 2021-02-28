package RecapAndMentoring;

import java.util.Scanner;

public class ReverseUmut {
    public static void main(String[] args) {

        // print every letter of given string
        Scanner input=new Scanner(System.in);
        System.out.println(" Please enter a word : ");
        String word=input.nextLine();
        String reverse="";
//

        for(int i=word.length()-1;i>=0;i--){
           reverse+=word.charAt(i);


        }

        System.out.println(reverse);

    }
}
