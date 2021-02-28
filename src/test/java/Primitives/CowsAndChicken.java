package Primitives;

public class CowsAndChicken {
    public static void main(String[]args){

        int cows=23, chicken=42;
        int cowsLegs=4;
        int chickenLegs= 2;
        int totalLegs=cows*cowsLegs + chicken*chickenLegs;

        System.out.println("the total legs in the farm is +" +totalLegs);
        //
        int cowPrice=1253;
        int chicPrice=11;
        int totalPrice= cows* cowPrice +chicken*chicPrice;

        System.out.println("the total price of all animal is "+ totalPrice );

    }
}
