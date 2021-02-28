package ForLoop;

import java.util.Scanner;

public class ExampleOfStringCount {
    public static void main(String[] args) {

        // write the code which will return the counts of 'a' inside of the given index
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string value : ");
        String str = input.next();
//
        int count = 0;
//
        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == 'a' || str.charAt(k)=='A') {
                count++;
            }
        }
        System.out.println("The total count of 'a' is : " + count);
    }
}
