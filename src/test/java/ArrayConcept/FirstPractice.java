package ArrayConcept;

import java.util.Arrays;

public class FirstPractice {
    public static void main(String[] args) {
         // we have to give the size of Array!
        int[] ages=new int[5];
        //{18,22,44,33,19}
        System.out.println(ages[0]);
        ages[0]=18;
        ages[1]=22;
        ages[2]=54;
        ages[4]=33;
        ages[3]=45;
       // ages[9]=60;// OutOfBoundryException and it will print out 0!
        // because the size of the array is 5.
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        //System.out.println(ages[10]);OutOfBoundryException and it will print out 0!
        System.out.println(ages.length);

        System.out.println("Using loop print all the elements from array");


        for (int i = 0; i <ages.length; i++) { // print all elements of array
            System.out.println(ages[i]);


        }
        System.out.println(Arrays.toString(ages));// this method will convert array to String

    }
}
