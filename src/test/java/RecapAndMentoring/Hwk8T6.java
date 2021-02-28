package RecapAndMentoring;

import java.util.Scanner;

public class Hwk8T6 {
    /*
    Write the program to print the numbers between 10 to 100
    those number will be increased with 10 every time.
Here is the example output:
10
20 30 40 ..
.. 100
     */
    public static void main(String[] args) {
        System.out.println(" Please enter a number between 10 to 100");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = number; i <=100 ; i+=10) {
            System.out.println(i);
        }
    }
}
