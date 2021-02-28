package Homework.Homework8;

import java.util.Scanner;

public class Task3 {
    /*
    Write to code to read temperature in centigrade and display a suitable message according to temperature state below:
  Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather Temp 20-30 then Normal in Temp Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot
Expected Output :Its very hot.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter temperature number");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Freezing weather");
        } else if (number > 0 && number < 10) {
            System.out.println("Very cold weather");
        } else if (number > 10 && number < 20) {
            System.out.println("Cold weather");
        } else if (number > 20 && number < 30) {
            System.out.println("Normal weather");
        } else if (number > 30 && number < 40) {
            System.out.println("Hot weather");
        } else {
            System.out.println("Very hot weather");
        }
    }
}