package Homework.Hwk13;

import java.util.TreeSet;

public class Task1UniqueElement {
    /*
    Create one method takes one int array. This methods need to print all unique elements from
    array ascending order.
Input: [2,3,4,4,7,2,1]
Output: 1, 2, 3, 4, 7
     */
    private static void ascendingNums(int[] arr) {
        TreeSet<Integer> newArr = new TreeSet();
        String result= " ";
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        for (int number : newArr) {
            result+=number+",";

        }
        System.out.println(result.substring(0,result.length()-1));

    }
//    public static void printNums(int [] arr1){
//        for (int i = 0; i < arr1.length ; i++) {
//            if(arr1 [i]==arr1[arr1.length-1]){
//                System.out.println(arr1[i]);
//            }else{
//                System.out.println(arr1[i]+",");
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 4, 2, 3, 2, 1, 4};
        ascendingNums(arr);

    }
}