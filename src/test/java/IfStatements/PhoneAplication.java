package IfStatements;

import java.util.Scanner;

public class PhoneAplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which phone do you want to buy? Apple, Samsung, Google ");
        String brand = input.nextLine();

        if (brand.equals("Apple")) {
            System.out.println("Which model do you want to buy ? Iphone10, Iphone11, iphone12");
            String model = input.nextLine();

            if (model.equals("Iphone10")) {
                System.out.println("please enter $800");
                double price = input.nextDouble();
                if (price >= 800) {
                    System.out.println("Congrats!(Iphone10)");
                } else {
                    System.out.println("Sorry try again!");
                }
            } else if (model.equals("Iphone11")) {
                System.out.println("please enter the price $900");
                double price = input.nextDouble();

                if (price >= 900) {
                    System.out.println("Congrats! (Iphone11)");
                } else {
                    System.out.println("Sorry try again!");
                }
            } else if (model.equals("Iphone12")) {
                System.out.println("please enter the price $1000");
                double price = input.nextDouble();
                if (price >= 1000) {

                    System.out.println("Congrats! (Iphone12)");
                } else {
                    System.out.println("Sorry try again");
                }
            }




            }else if(brand.equalsIgnoreCase("Samsung")) {
            System.out.println("Which model do you want? : Note8, Note9, Note10");
            String model = input.nextLine();
            if (model.equalsIgnoreCase("Note8")) {
                System.out.println("Please enter the price: $750");
                double price = input.nextDouble();
                if (price >= 750) {
                    System.out.println("Congrats! Note8");
                } else {
                    System.out.println("Sorry try again");
                }
            } else if (model.equalsIgnoreCase("Note9")) {
                System.out.println(" please enter the price: $850");
                double price = input.nextDouble();
                if (price >= 850) {
                    System.out.println("Congrats! Note9");
                } else {
                    System.out.println("Sorry try again");
                }
            } else if (model.equalsIgnoreCase("Note10")) {
                System.out.println(" please enter the price: $850");
                double price = input.nextDouble();
                if (price >= 950) {
                    System.out.println("Congrats! Note10");
                } else {
                    System.out.println("Sorry try again");
                }
            }
        }else if(brand.equalsIgnoreCase("Google")){
                System.out.println("which model do you want? : Pixel3, Pixel4, Pixel5");
                String model=input.nextLine();
                if(model.equalsIgnoreCase("Pixel3")){
                    System.out.println("Please enter the price: $350");
                    double price=input.nextDouble();
                    if(price>=350){
                        System.out.println("Congarts! Pixel3");
                    }else{
                        System.out.println("Sorry try again");
                    }
                }else if(model.equalsIgnoreCase("Pixel4")){
                    System.out.println("Please enter the price: $450");
                    double price=input.nextDouble();
                    if(price>=450){
                        System.out.println("Congrats! Pixel4");
                    }else{
                        System.out.println("Sorry try again");
                    }
                }else if(model.equalsIgnoreCase("Pixel5")){
                    System.out.println("Please enter the price: $550");
                    double price= input.nextDouble();
                    if(price>=550){
                        System.out.println(" Congrats! : Pixel5");
                    }else{
                        System.out.println("Sorry try again");
                    }
                }
            }
        }


        }

