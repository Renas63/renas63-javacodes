package RecapAndMentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Hwk2Descending {
    /*
Create one method takes one int array. This methods needs to print all unique element
 from array in descending order.
Input: [2,3,4,4,7,2,1]
Output: 7, 4, 3, 2, 1
 */
    private static void descendingNUmber(int [] arr){

        Arrays.sort(arr);
        LinkedHashSet<Integer> welat= new LinkedHashSet<>();
        for (int i = arr.length-1; i>=0 ; i--) {
            welat.add(arr[i]);
        }
        for(int num:welat){
            System.out.print(num+ ", ");
        }
    }

    public static void main(String[] args) {
        int [] array={1,2,4,6,3,6,8,9};
        descendingNUmber(array);
    }
}
