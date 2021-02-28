package Homework.Homework9;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Using a scanner enter the number of eggs in the box.
        Then ask the user, how many eggs are eaten at the end of the day
        and keep asking the same question until your number of eggs is equaled to 0 in the box.
Example:
Input: 13
How many eggs did you eat today? 2
There are 11 eggs left
How many eggs did you eat today? 5
There are 6 eggs left
How many eggs did you eat today? 6
You have finished all the eggs
         */

        Scanner input = new Scanner(System.in);
        System.out.println(" How many eggs in the box?");
        int eggNumber = input.nextInt();

        while(eggNumber>0){
            System.out.println(" How many egg been eaten at end of the day?");
            int eatenEgg = input.nextInt();
            if(eatenEgg>eggNumber){
                System.out.println("You can not eat more than available");
            }else{
                eggNumber-=eatenEgg;
            }
            System.out.println("there are  " +  eggNumber + " eggs left " );

            }
                System.out.println(" no more eggs left");
            }
        }
