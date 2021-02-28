package Zoom;

import java.util.Arrays;

public class ArrayFlipNumber {
    public static void main(String[] args) {

        int [][] number={ {1,2,3,4}, {5,6,7,8} }; //{ {4,3,2,1} {8,7,6,5} }
       // { {8,7,6,5} {4,3,2,1} };


        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length/2; j++) {
               int temp= number[i][j];
               number[i][j]=number[i][number[i].length-j-1];
                number[i][number[i].length-j-1]= temp;
            }


            System.out.println(Arrays.toString(number[i]));
        }
        for (int i = 0; i < number.length/2 ; i++) {
            int []temp=number[i];
            number [i]=number[number.length-1-i];
            number[number.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(number[0]));
        System.out.println(Arrays.toString(number[1]));
    }
}
