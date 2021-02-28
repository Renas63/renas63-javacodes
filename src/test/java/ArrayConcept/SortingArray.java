package ArrayConcept;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] numbers = {10, 6, 14, 8, 45, 34};

        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];// WE HAVE TO CREATE A TEMP STORAGE TO DO SWAP BETWEEN TWO COMPARISON NUMBERS!!!
            for (int j = i + 1; j < numbers.length; j++) {// THE REASON WE SAID J=I+1 IS THAT WE DONT NEED TO COMPARE
                // SAME INDEX NUMBER WITH EACH OTHER
                if (numbers[i] > numbers[j]) {
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    temp = numbers[i];

                }
            }
        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("******************************");

        int[] num={10,6,14,8,40,32};  // SORTING ARRAY WITHOUT TEMP
        for (int i = 0; i < num.length; i++) {

            for (int j = i+1; j < num.length ; j++) { // for this imp we might modify it for different data types and nagative numbers.
                if(num[i]>num[j]){
                    num[i]+=num[j]; // now num[i] is became 16 and num[j] is still 6
                    num[j]=num[i]-num[j]; // num[j] now became 10
                    num[i]=num[i]-num[j];// now num[i] become 6
                }

            }

        }
        System.out.println(Arrays.toString(num));
    }
}