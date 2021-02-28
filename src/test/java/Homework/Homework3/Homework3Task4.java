package Homework.Homework3;

public class Homework3Task4 {
    public static void main(String[] args) {
        /*

        Write the application that prints true if the number is odd number
Example:
Given number is 9 Output:
"9 is odd number true"
Example:
Given number is 10 Output:
"10 is odd number false"
         */
        int num=9;
        int remainder=num%2;
        boolean odd=remainder==1;

        System.out.println("9 is odd number "+ odd );


    int number=10;
    int remainder1=number%2;

    boolean oddNum=remainder1==1;

        System.out.println("10 is odd number " + oddNum);



    }
}
