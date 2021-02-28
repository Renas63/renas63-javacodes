package Homework.Homework10;

import java.util.Scanner;

public class Task3 {
    /*
    Write a Java program to check whether a given number is an armstrong number or not.
Test Data :Input a number: 153
Expected Output :153 is an Armstrong number.
NOTE:
An Armstrong number, also known as narcissistic number, is
a number that is equal to the sum of the cubes of its own digits.
For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        int initialNumber=number;
        int remainder;
        int total=0;
        int digit;
        int cube;
        //number= 370;
        // you can use String to get digits. if number is 370;
        // use charAt to get 3,7,0 and cube and then sub them
        while (number > 0) {
            remainder = number % 10;//0 7 3  remainder is our digit

            number = number / 10;  //37 3 0
            //System.out.println("Digit- "+remainder);

            cube= remainder*remainder*remainder;// gettting the cube of digits
            total=total+cube;
        }
        if(total==initialNumber){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Its not a Armstrong Number");
        }


      /*
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,3);
            num/=10;
        }
        boolean ifArmstrong=original==sum
                System.out.println(original+ "is armstrong number" +ifArmstrong);*/

    }
}


