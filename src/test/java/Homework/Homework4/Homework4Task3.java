package Homework.Homework4;

import java.util.Scanner;

public class Homework4Task3 {
    public static void main(String[] args) {


        /*Ask user to give two double input for length and width of a rectangle and print area type casted to int.
    Example:
    Please enter length of Rectangle:10.4
    Please enter width of Rectangle: 4.3-------------> ASK WHY MY RESULT IS 44.72
    Output:44
         */
          Scanner input= new Scanner (System.in);

        System.out.println("Length size ");
        double length= input.nextDouble();
        System.out.println("Width size ");
        double width= input.nextDouble();
        System.out.println(" area ");
        double area=(int)length*width;

        System.out.println(area);//
    }
}
