package Homework.Hwk11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    /*
    Create the int array with given numbers 10,4,3,55,32,145,443,234,98,32
Using scanner user to provide any number from given array,
 then remove the value from array and put 0 instead of that.
Example:
Given Number:
234
Output:
10, 4, 3, 55, 32, 145, 443, 0, 98, 32
     */
    public static void main(String[] args) {
        int array[] ={ 10,4,3,55,32,145,443,234,98,32};
        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter a number");
        int number=input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(number==array[i]){
                array[i]=0;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
