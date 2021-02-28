package Homework.Homework5;

import java.util.Scanner;

public class Homework5Task2 {
    public static void main(String[] args) {
        /*
        1: Write the program to check Am I able to vote? 1. Create a class with main method.
2. Create a Scanner object inside main method
3. Ask user to enter following input
a. Age
b. Full Name
c. State Code
d. City
e. Gender ( F, M)
f. State Code
4. If Age is more than 18 and Full Name is Staring with ‘A’
and last name is ending with ‘V’ and state code is Starting with ‘I’
and Ending with ‘L’ and City length is not more than 10,
and gender is equals to ‘M’, I am able to vote. Print true If I am able to vote,
 Print False if I am not able to vote.*/
        Scanner input= new Scanner(System.in);
        System.out.println("Your full name?");
        String name=input.nextLine();
        name=name.toUpperCase();
        System.out.println("State code?");
        String state=input.nextLine();
        state=state.toUpperCase();
        System.out.println("City?");
        String city=input.nextLine();
        System.out.println("Gender?");
        String gender=input.nextLine();
        System.out.println("Your age?");
        int age=input.nextInt();


        System.out.println(" I am able to vote ?");

        boolean result= age>18 && name.startsWith("A") && name.endsWith("V") && state.equalsIgnoreCase("IL") && city.length()<=10 && gender.equalsIgnoreCase("M");

        System.out.println(result);
    }
}
