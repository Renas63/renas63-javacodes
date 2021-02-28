package Zoom.interviewQuestion;

import java.util.Arrays;

public class SortArray {
    public static void sortArray() {
        // sorting array without using Array.sort method!!!
        int[] nums = {3, 7, 6, 2, 9};
        for (int i = 0; i < nums.length; i++) {

            int temp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void sortIntArray2() {
        int[] numbers = {2, 32, 1, 7, 54, 67, 8, 3};
        for (int i = 0; i < numbers.length; i++) {

            int temp = 0;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void reverseStringArray(){
        String str= "I love Baby Jo";

        String reversed= "";
        for (int i =str.length()-1; i>=0 ; i--) {
            reversed= reversed+str.charAt(i);

        }
        System.out.println(reversed);
    }



    public static void main(String[] args) {
        sortArray();

        sortIntArray2();

        reverseStringArray();
    }
}
