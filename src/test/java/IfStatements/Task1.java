package IfStatements;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter number between 1-5");
        int dayNumber=input.nextInt();

        if(dayNumber==3){
            System.out.println("Wednesday");

        }
         if (dayNumber==1){
            System.out.println("Monday");
        }
        if (dayNumber==4){
            System.out.println("Thursday");
        }
        if(dayNumber==2){
            System.out.println("Tuesday");
        }
        if(dayNumber==5){
            System.out.println("Friday");
        }
        // if the number is not between 1-5 , i want to print the number is not "correct" output
        if(dayNumber<1 || dayNumber>5);
        System.out.println("Wrong Number"); // 9
    }
}
