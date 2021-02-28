package Zoom;

import java.util.Arrays;
import java.util.Scanner;

public class HwkMehmet2 {
    public static void main(String[] args) {
        /*
        using scanner ask user to enter the size of the array.
        using scanner ask user to enter numbers for each element.
         sort them out from least to greatest.
         example: size of array:5, elements { 13, 55, 10, 36, 3}  --> output: {3, 10, 13, 36, 55}
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the size of array : " );
        int size=input.nextInt();
        int numbers[]=new int[size];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Provide a number:");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int temp=numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]>numbers[j]){
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                    temp=numbers[i];
                }

            }

        }
//        for (int i=0;i<numbers.length;i++){
//            int temp=numbers[i];
//            for(int b=i+1;b< numbers.length;b++){
//                if(numbers[i]>numbers[b]){
//                    numbers[i]=numbers[b];
//                    numbers[b]=temp;
////                    temp=numbers[i];
//                }
//
//            }
//        }

        System.out.println(Arrays.toString(numbers));
    }
}
