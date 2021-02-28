package ForLoop;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        /*
        Using Scanner ask user to enter one number between 1 to 10
        5
        num1:
        num2
        num3
        num4
        num5
         */

        Scanner input =new Scanner(System.in);
        System.out.println(" Please enter a number between 1 to 10");
        int number=input.nextInt();
        //6
        System.out.println("num-1");
        int firstNumber=input.nextInt();
        int biggestNumber=firstNumber;

       // int biggestNum=Integer.MIN_VALUE to find the min value of integer
        // int smallestNum=Integer.MIN_VALUE to find the max value of integar
        for(int i=2;i<=number;i++){
            System.out.println("num-"+i);
            int secondNumber=input.nextInt();
            if(secondNumber>biggestNumber){ // FORMULA FOR BIGGEST NUMBER
                secondNumber=biggestNumber;
            }
        }
        System.out.println("Biggest number is : " +biggestNumber);
    }
}
