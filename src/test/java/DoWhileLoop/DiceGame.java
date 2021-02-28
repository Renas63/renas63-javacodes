package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random random= new Random();
        // 12, 6
        // we will roll the dices till sum of the dices are equals to user input

        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter your number between 2-12");
        int number= input.nextInt();
        int sum;
        int count=0;
        int balance=100;

        // while the sum of the dices are not equal to given number then keep continue to roll the dices
        //first roll the dice
        // then find the sum of dices
        // while sum is not equals to the number then roll again. Do this steps until
        // sum is equals to given number
        do{
        int dice1=random.nextInt(6);//0-5
        int dice2= random.nextInt(6);
        dice1++;
        dice2++;
         sum= dice1+dice2;
            System.out.println("Dice one is " +dice1+ " dice two is " +dice2);
            count++;

            if(count<=5 && sum==number){
                balance+=200;
                System.out.println(" you earned $200");
            }else{
                balance-=10;
                System.out.println("Table gets $10");
            }
        } while (sum!=number && count<=5) ;
        System.out.println("Balance is " + balance);

            System.out.println("you have rolled the dice " +count+ " times to find the  "+number);


        }
    }

