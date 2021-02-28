package RecapAndMentoring;

import java.util.Scanner;

public class Project3T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Using a scanner ask a user to provide one int number.
        if the number is a prime number then print "Prime Number"
        otherwise print it is not a prime number.
    NOTE:
    A prime number is a whole number greater than 1 whose only factors are 1 and itself.
    A factor is a whole number that can be divided evenly into another number.
    The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
         */
        System.out.println("Enter a int number");
        int number = input.nextInt();
        boolean prime=true;
        for(int i=2; i<=number/2; i++){
            if(number%i==0){
                prime=false;
            }
        }
        if(prime==true){
            System.out.println(number+ " is prime number");
        }else{
            System.out.println(number+" is not a prime number");
        }

    }
}
