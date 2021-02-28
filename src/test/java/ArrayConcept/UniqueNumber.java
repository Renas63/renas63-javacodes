package ArrayConcept;

import java.util.Arrays;

public class UniqueNumber {
    public static void main(String[] args) {

        int numbers[] = {4, 5, 6, 1, 7, 1, 4, 6, 5};
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    if (numbers[i] == numbers[i + 1]) {
                    i++;
                    }
                }
            }
            if (count == 1) {
                System.out.println(numbers[i]);
                break;
            }
        }

    }
}