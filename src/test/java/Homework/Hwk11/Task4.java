package Homework.Hwk11;

import java.util.Arrays;

public class Task4 {
    /*
    Write the application to find the second largest value from given array.
Example:
Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
Output: 8
     */
    public static void main(String[] args) {

        int numbers[] = {3, 2, 8, 9, 1, 5, 4, 3, 7, 8, 5, 9, 9};
        Arrays.sort(numbers);

        for (int i = numbers.length-1;i>=0; i--)
            if (numbers[i - 1] < numbers[i]) {
                System.out.println(numbers[i - 1]);
                break;
            }
        /*
        int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] > largest){
        secondLargest = largest;
        largest = numbers[i];
    }else if (numbers[i] > secondLargest && numbers[i] != largest)
        secondLargest = numbers[i];
}
System.out.println("Second largest number is: " + secondLargest);
         */
        }
    }