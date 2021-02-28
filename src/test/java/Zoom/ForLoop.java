package Zoom;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd = 0, even = 0;
        int sumOfOdd = 0, sumOfEven = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            System.out.println("enter a number:");
            int num = input.nextInt();
            if (num % 2 == 1) {
                odd++;
                sumOfOdd += num;
            } else {
                even++;
                sumOfEven += num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("The count of odd numbers is " + odd);
        System.out.println("The sum of odd numbers is " + sumOfOdd);
        System.out.println("The count of even numbers is " + even);
        System.out.println("The sum of even numbers is " + sumOfEven);
        System.out.println("Smallest number is " + smallest);
    }
}

