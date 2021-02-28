package Homework.Homework9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        The user using a scanner enters the current speed and target speed .
        In every 1-sec car's speed will increase 10mil.
        Please find the total number of sec to reach your target speed using a while loop.
        Example:
        CurrentSpeed: 6
        Target Speed: 20
        Output: You need 2 sec to reach target speed.
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" enter current speed");
        int current= input.nextInt();
        System.out.println("enter a target speed");
        int target= input.nextInt();
        int seconds = 0;

        while(current<=target){
            current+=10;
            seconds++;
            System.out.println("The total second " + seconds);
        }
    }
}
