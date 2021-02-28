package ArrayConcept;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array={ 1,2,3,4,5,6,7};

        for(int i= array.length-1, k=0; k< array.length/2;i--,k++){
            //{7,2,3,4,5,6,7}
            int temp=array[k];
            array[k]=array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length/2 ; i++) { // /2 helps us to reverse only first 2 and last 2 elements
            int temp=array[i];
            array[i]= array[array.length-i-1];
            array[array.length -i-1]=temp;
        }
        System.out.println(Arrays.toString(array));

     // if we want to do a swap, we have to create a temp to be able to swap them.

                //int temp=array[k]; THIS IS A FORMULA FOR SWAP!!!!!
                //array[k]=array[i];
                  //array[i]=temp;
    }
}
