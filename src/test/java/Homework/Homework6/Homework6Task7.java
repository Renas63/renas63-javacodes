package Homework.Homework6;

import java.util.Scanner;

public class Homework6Task7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter any number please: ");
        int number= input.nextInt();
        if(number>0){
            System.out.println("number is positive");

        }else {
            System.out.println("number is negative");
        }
    }
}
