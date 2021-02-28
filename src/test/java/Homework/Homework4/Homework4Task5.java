package Homework.Homework4;


import java.util.Scanner;

public class Homework4Task5 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter 3 integral number.
        Print true if any following two digits are equals to each other.
Example-1:
Three Number:4 7 7

Output: true (because after first 7 the user enters the 7 one more time) Example-2:
Three Number: 5 2 5

Output: false (I have two 5 but they are not following two digits.
One of them is in the beginning and other one is at the end)
         */

        Scanner input =new Scanner(System.in);
        System.out.println("First integral number ");//4
        int num1= input.nextInt();
        System.out.println("Second integral number ");//7
        int num2= input.nextInt();
        System.out.println("Third integral number ");//7
        int num3= input.nextInt();
        boolean integralNumber= num1==num2 || num2==num3;// true ---> num2==num3 ??????????????????/ ask
        System.out.println("the following two digits are equal"  + integralNumber);

        Scanner input1 =new Scanner(System.in);
        System.out.println("First integral number ");//5
        int number1= input.nextInt();
        System.out.println("Second integral number ");//2
        int number2= input.nextInt();
        System.out.println("Third integral number ");//5
        int number3= input.nextInt();
        boolean integralNumber1= number1==number2 && number2==number3;// true ---> num2==num3
        System.out.println("the following two digits are equal"  + integralNumber1);


    }
}
