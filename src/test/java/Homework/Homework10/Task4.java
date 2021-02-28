package Homework.Homework10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Write a program in Java to find the prime numbers within a range of numbers.
    Test Data :Input starting number of range: 1 Input ending number of range : 50
    Expected Output :
    The prime number between 1 and 50 are :
    2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 NOTE: you need to use the nested loop.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a starting  number: ");
        int starting = input.nextInt();
        System.out.println("Please enter a ending number");
        int ending=input.nextInt();
        System.out.println(" The prime numbers between" + starting + " and " + ending + " are : ");
        int counter=0;
        for(int i=starting; i<=ending;i++){
            counter=0;
            if(!(i<2)){
               for(int j=2; j<=i/2; j++){
                   if(i%j==0){
                       counter++;
                   }

               }
               if(counter==0){
                   System.out.print(i+" ");
               }
               //counter=0;
            }
        }

    }

}