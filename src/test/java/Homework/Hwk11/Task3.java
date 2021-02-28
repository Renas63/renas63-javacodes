package Homework.Hwk11;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    /*
    Create one int array with size of 10 without any value.
    Using scanner ask user to provide the int value until you filled out the array with given numbers.
    Then print the array with all numbers.
Int [] numbers=new int[10];
Example:
Please enter the int number. You have 10 space in array:
11
Please enter the int number. You have 9 space in array:
43
Please enter the int number. You have 8 space in array:
77
.. keep continue to ask user until you don't have any space in the array
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [] array=new int[10];
        int count= array.length;
        for (int i = 0; i <array.length ; i++) {// I could say just array.length()-1 left . no count????
            System.out.println(" Please enter a number: you have " + count + " left");
            array[i]=input.nextInt();
            count--;

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
