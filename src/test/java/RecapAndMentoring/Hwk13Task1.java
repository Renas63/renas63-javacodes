package RecapAndMentoring;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Hwk13Task1 {
    private static void ascendingNumber(Integer[] arr) {
    Set<Integer> newArray = new TreeSet(Arrays.asList(arr));
        System.out.println(newArray);
        Arrays.sort(arr);
     }

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 5, 8, 1, 5, 7, 9};
        ascendingNumber(arr);
        System.out.println(arr[0]);
    }
}
