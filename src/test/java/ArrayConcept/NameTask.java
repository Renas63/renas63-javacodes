package ArrayConcept;

import java.util.Arrays;
import java.util.Scanner;

public class NameTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter the number of names");
        int num = input.nextInt();
        String names[] = new String[num];
        // store the names if the name size bigger than 5
        int index=0; // to be able to print the names that match the condition, we can use that
        for (int i = 0; i < num; i++) {

            System.out.println("please enter a name");
            String name = input.next();
            if (name.length() > 5) {
                names[index++] = name;
            }
        }
        String arrayValue = Arrays.toString(names);
        System.out.println(arrayValue);
    }
}
