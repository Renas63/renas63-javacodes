package ArrayConcept;


import java.util.Arrays;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] numbers = {7, 6, 5, 3, 3, 1};
        // from given array print all missing array between 1 to 9

        Arrays.sort(numbers);

        for (int i = 0; i <= 9; i++) {// print numbers from 1 to 9

            boolean missinNumber=true;
            for (int j = 0; j < numbers.length; j++) {
                if(i==numbers[j]){
                    missinNumber=false;
                }

            }
            if(missinNumber=true){
                System.out.println(i);
        }

        }

    }
}
