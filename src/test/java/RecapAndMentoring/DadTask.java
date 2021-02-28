package RecapAndMentoring;

import java.util.Scanner;

public class DadTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a string value");
        String word= input.nextLine().toLowerCase();

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='d'){
                if(i+2<word.length() && word.charAt(i+2)=='d'){
                    System.out.println("dad");
                    break;
                }
            }
        }
    }
}
