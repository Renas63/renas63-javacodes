package Homework.Homework3;

public class Homework3Task3 {
    public static void main(String[] args) {
/*
   Write the application that prints true if the number is even
number
Example:
Given number is 8 Output:
"8 is even number true"
Example:
Given number is 9 Output:
"9 is even number false"

 */
   int num=8;
   int remainder=num %2;
   boolean evenNumber= remainder==0;
        System.out.println("Even Number " + evenNumber);


        int number=11;
        int remainder1=number %2;

        boolean oddNumber=number==1;
        System.out.println(number+ " is even number " + oddNumber);

    }
}
