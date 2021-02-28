package Homework.Homework6;

import java.util.Scanner;

public class Homework6Task1 {
    public static void main(String[] args) {

    /*
    Write the program to get the string value from the specified position.
    First, ask the user to enter one String value.
    Then ask the user the enter starting number and ending number.
    After that, print the value between the given starting and ending numbers.
    (Note: since the user does not know the java, the user starts counting from 1 and ending number will be included)
     Example:
Please enter the String value: Definition of Science
Please enter the starting number: 2
Please enter the ending number 5
The output is:
efin
 */
        Scanner input= new Scanner(System.in);
        System.out.println("please enter a string value");
        String value=input.nextLine();
        System.out.println(" enter the staring point");
        int num1= input.nextInt();
        System.out.println(" enter the ending point");
        int num2= input.nextInt();
        System.out.println(value.substring(num1-1,num2));


    }
}
