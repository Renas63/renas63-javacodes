package IfStatements;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*
        using scanner enter jersey number
        if the jersey number is even print
        "Your jersey number is even"
        otherwise
        "Your jersey number is odd number"
         */


        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your jersey number:");

        int number=input.nextInt();
        if(number<0){
            System.out.println("it is invalid number");
        }else if(number%2==0){
            System.out.println("Your jersey number is even number" );

            } else{
                System.out.println("Your jersey number is odd number");
            }
        }
    }
