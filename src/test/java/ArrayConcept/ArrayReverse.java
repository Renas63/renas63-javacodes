package ArrayConcept;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {


        String[] city = {"Chicago", "indiana", "Denver", "Columbus", "Oklahoma"};

        for (int i = 0; i < city.length ; i++) {
            String reverse="";

            for (int j = city[i].length()-1; j>=0 ; j--) {

                reverse+=city[i].charAt(j);


            }
            System.out.println(reverse+ " ");
        }

    }

}
