package Homework.Hwk13;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*
Create one method takes one int array. This methods needs to print all unique element
 from array in descending order.
Input: [2,3,4,4,7,2,1]
Output: 7, 4, 3, 2, 1
 */
public class Task2DescendingArray {
    private static void descendingNums(int[] arr) {
        /*TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }*/
        Arrays.sort(arr);
        LinkedHashSet<Integer> bananas=new LinkedHashSet();
        for (int i = arr.length-1; i >=0 ; i--) {
            bananas.add(arr[i]);
        }
        for (int num : bananas) {
            System.out.print(num + ", ");
        }
    }
    public static void main(String[] args) {
        int [] array={2,3,7,4,1,5,1,6,3,5,7};
        descendingNums(array);
    }
}

