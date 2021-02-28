package Homework.Homework10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
Test Data :
Input the number of terms : 5 Expected Output :
1 + 11 + 111 + 1111 + 11111 The Sum is : 12345
         */
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int number=input.nextInt();
        int sum=0;
        int total=0;
        for (int i = 1; i <= number; i++)
        {
            sum = sum * 10 + 1;
            total+=sum;
            System.out.print(sum + " ");
            if(i<number){
               System.out.print(" + ");
            }

        }
        System.out.println("= "+total);

    }
}

