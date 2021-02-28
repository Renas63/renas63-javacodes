package Zoom;

import java.util.Set;
import java.util.TreeSet;

public class ascendingOrder {
    private static void ascendingOrder(int[] arr) {
        Set<Integer> intArr= new TreeSet<>();
        String str="";
        for (int a = 0; a < arr.length; a++) {
            intArr.add(arr[a]);
        }
        for(int num:intArr){
            str+=num+",";
        }
        System.out.println(str.substring(0, str.length()-1));
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 4, 2, 6, 2, 1, 4};
        ascendingOrder(arr);
    }
}