package Zoom;

import java.util.Scanner;

public class SumOFDigits {
    public static void main(String[] args) {
        // sum of the digits of a given number 345
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int number=input.nextInt();
        int sum=0;
        int digit=0;
        /*
            while(number>0){
            digit=number%10;
            sum+=digit; // sum+digit
            number=number/10;
        }
        System.out.println("Sum of the digits of given number is "+sum);
         */
        for(; number>0; ){
            digit=number%10;
            sum+=digit; // sum+digit
            number=number/10;
        }
        System.out.println("Sum of the digits of given number is "+sum);
    }
}

