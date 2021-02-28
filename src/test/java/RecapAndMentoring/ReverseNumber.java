package RecapAndMentoring;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" please enter a number");
        int number=input.nextInt();
        int reverse=0;
        int digit;
        for ( ; number>0;) {
             digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        }
        System.out.println("Reverse " + reverse);
    }
}
