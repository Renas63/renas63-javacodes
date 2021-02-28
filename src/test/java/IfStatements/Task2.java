package IfStatements;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("what is the time? ");
        int time= input.nextInt();

        if(time<11&& time>=6){
            System.out.println("good morning");
        }
        if(time>=12 && time<=18){
            System.out.println("good afternoon");
        }
        }
    }
