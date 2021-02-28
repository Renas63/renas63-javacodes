package Zoom.interviewQuestion;

public class Fibonacci {
    public static void fibonacci() {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.
        /*
        Each number equals the sum of the two numbers before it.
         So after 1 and 1, the next number is 1+1=2, the next is 1+2=3, the next is 2+3=5 and so on.
         */


        int a = 0, b = 1, c;
        for (int i = 0; i < 10; i++) {
            System.out.println(a+" ");
            c = a + b;
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
