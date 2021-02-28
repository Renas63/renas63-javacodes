package IfStatements;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter number 1: ");
        int num1=input.nextInt();
        System.out.println("enter number 2: ");
        int num2=input.nextInt();
        System.out.println("enter number 3 : ");
        int num3=input.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("first is greater " + num1);
        } else if(num2>num1){
            System.out.println("second is bigger " + num2);
        } else {
            System.out.println("third is bigger " + num3);
        }
}
}