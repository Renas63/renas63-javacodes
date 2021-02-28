package Homework.Homework6;


import java.util.Scanner;

public class Homework6Task6 {
    public static void main(String[] args) {

        /*
           Using scanner ask user to enter one String value.
            If this String length is odd number print middle 3 string from given value.
            (You need to use if statement for this task)
Example 1:
Please enter the String value:
test
The output is:
(Since "test" length is not odd number output should be nothing) Example 2:
Please enter the String value: Chicago
The output is:
ica
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string value");

        String string = input.nextLine();
        int length = string.length();

        if (length % 2 == 1) {
            System.out.println(string.substring(2, length - 2));
        }else{
            System.out.println("nothing");
        }

    }
}