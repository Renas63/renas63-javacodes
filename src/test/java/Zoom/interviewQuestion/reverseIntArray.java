package Zoom.interviewQuestion;

import java.util.Arrays;

public class reverseIntArray {
    public static void reverseIntArr(){
        int [] nums={45,62,7,67,23,35,11};
        for (int i = 0; i < nums.length/2 ; i++) {
            int temp= nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;

        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        reverseIntArr();
    }
}
