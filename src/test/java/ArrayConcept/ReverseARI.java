package ArrayConcept;

import java.util.Arrays;

public class ReverseARI {
    public static void main(String[] args) {

        int[] nums = {23, 43, 5, 7, 8, 9, 34, 646};
        int reversed[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int k = nums.length - 1; k >= 0; k--) {
                reversed[k] = nums[i];
            }
            System.out.println(Arrays.toString(reversed));
        }
    }
}