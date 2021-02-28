package IfStatements;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter time");
        String time=input.nextLine();

        if(time.endsWith("am")){
            System.out.println("Good Morning");
        }
            if(time.endsWith("pm")){
                System.out.println("Good Afternoon");
            }

        }
    }
