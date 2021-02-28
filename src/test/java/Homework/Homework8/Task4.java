package Homework.Homework8;

import java.util.Scanner;

public class Task4 {
    /*
    Write the program to check whether a triangle is Equilateral, Isosceles or Scalene.
Test Data :50 50 60
Expected Output :This is an isosceles triangle.
Equilateral: an equilateral triangle is a triangle in which all three sides have the same length
Isosceles: an isosceles triangle is a triangle that has two sides of equal length.
Scalene: of a triangle having all sides unequal in length
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter a number for triangle");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        if(num1==num2&& num1==num3 ){
            System.out.println(" The Triangle is Equilateral");
        }else if (num1==num2 || num1==num3 || num2 ==num3){
            System.out.println(" The Triangle is Isosceles");
        }else{
            System.out.println(" The Triangle is Scalene");
        }


    }
}
