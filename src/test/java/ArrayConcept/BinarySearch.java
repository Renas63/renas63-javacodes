package ArrayConcept;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        /*
        we must sort the array before using binary search
        Arrays.binarySearch(nameOfTheArray, number
         */
        int[] numbers={4,5,6787,3,6,856};
        Arrays.sort(numbers);
        //{3,4,5,6,856,6787}
        int result=Arrays.binarySearch(numbers,10);// -5
        System.out.println(result);

        // if the  number is inside the array, it will return positive index number of the element.
        // if the  number is not inside the array, binary search  will return expected location of element with
        // counting(count start from -1) and result will be negative
    }
}
