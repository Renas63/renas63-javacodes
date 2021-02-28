package WhileLoop;

import java.util.Scanner;

public class SumOfNumber {
    /*
    Using scanner ask user starting number and ending number
Print sum of numbers between starting and ending number
Starting number
5
Ending
8
5+6+7+8
Print Sum
sum= 26
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" please enter a starting  number" );
        int start= input.nextInt();
        System.out.println("please enter a ending number");
        int ending= input.nextInt();
        int sum=0;

        while(start<=ending){

            if(start%2!=0){
                sum+=start;
            }
            start++;// yuzde 90 while in curly brace inden once yapariz.
                    // WE DO start++ INSIDE THE WHILE CURLY BRACES!!!!!
        }
        // find sum of the odd number
        System.out.print("Sum of the numbers " +sum);

    }
}













