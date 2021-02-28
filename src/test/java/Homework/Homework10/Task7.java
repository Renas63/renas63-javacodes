package Homework.Homework10;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Write a program in Java to make such a pattern like a pyramid with numbers
    increased by 1. For this task ask the user to enter a number of the line.
    Example:
    Please enter line number: 4
    Expected output:
    1
    23
    456
    7 8 9 10
NOTE: You need to use the nested loop
         */
        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter a line  number");
        int numberLine=input.nextInt();
        int num=1;
        for(int i=1; i<=numberLine; i++){//4 line
            for(int j=1; j<=i; j++){
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
