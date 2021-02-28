package Homework.Homework10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Write a Java program to find the perfect numbers within a given number of range.
        Perfect perfect number is a positive integer that is equal to the sum of its positive divisors
        excluding the number itself

        1, 2, and 3=6
        1+2+3=1*2*3
         1+2+4+7+14 ==> 28

Test Data :
Input the starting range or number : 1 Input the ending range of number : 50
Expected Output :
The Perfect numbers within the given range : 6 28
NOTE: you need to use the nested loop.
         */
        int x1, x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number");
        x1 = input.nextInt();
        System.out.println("Enter ending number");
        x2 = input.nextInt();
        int sum = 0;
        int SumOfDivisors=1;

        for (int currentNumber = x1; currentNumber <= x2; currentNumber++) {
            SumOfDivisors=1;
         // we need to check if the currrentNumber is perfect number
            if(!(currentNumber<2)) {

                for (int i = 2; i <= currentNumber / 2; i++) {
                    if (currentNumber % i == 0) {
                        SumOfDivisors = SumOfDivisors + i;
                    }
                }

                // when we find sum of divisors of the currentNumber
                //we check if it make the perfect number
                if (SumOfDivisors == currentNumber) {
                    System.out.println("The perfect number in given range " + currentNumber);
                }
            }
        }

    }
}
