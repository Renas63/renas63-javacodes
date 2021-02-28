package Homework.Hwk13;

public class PrintEvenNum {

    public static void printEven(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[nums.length - 1]) {
                if (nums[i] % 2 == 0) {
                    System.out.print(nums[i]);
                }
            }else{
                if(nums[i]%2==0){
                    System.out.print(nums[i]+",");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7,8,9};
        printEven(arr);
    }
}