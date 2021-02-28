package ScannerPractice;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

         Scanner input=  new Scanner(System.in);

        System.out.println("What is your name?" );
        String name= input.next();
        System.out.println(" Please provide our date of birth: (mm/dd/yyyy)");

        String dob=input.next();

        System.out.println("Please enter your height and weight for BMI calculator:");

        System.out.println("Height");
        double height= input.nextDouble();
        System.out.println("Weight");
        double weight= input.nextDouble();

        double bmiResult= weight/(height*height);

        System.out.println("Name: "+ name);
        System.out.println("DOB:"+dob);
        System.out.println("Weight:"+ weight);
        System.out.println("height :" + height);
        System.out.println("BMI : "+ bmiResult);
        // 18.5 to 24.9
        boolean idealBMI= bmiResult>=18.5 && bmiResult<=24.9;
        System.out.println(" Is it ideal bmi ?" +idealBMI);



    }
}
