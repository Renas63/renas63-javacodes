package NaveenAndSDET.SDET;

import java.util.Scanner;

public class TableCost {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

         /*
        If the customer wants to buy number of the table between 10 tables to 15 tables,
         the customer get %10 discount. 16 to 20 tables, %15 discount and more than 20 tables, %18  discount.
         write the program to ask user he number of the table and print the final price for all the tables.
        note: 1 table is $110
         */


        System.out.println(" How many table do you like to buy ? ");
        int tableNumber= input.nextInt();

        double totalPrice=tableNumber*110;

        if(tableNumber>20){
            double firstDiscount=tableNumber*0.18;
            totalPrice-=firstDiscount;  ///// ???????????????????????????????
            System.out.println(" %18 discount" + firstDiscount);
            System.out.println(totalPrice);
        }
        else if(tableNumber>=16&& tableNumber<20){
            double secondDiscount=tableNumber*0.15;
            totalPrice-=secondDiscount;
            System.out.println("%15 discount "+ secondDiscount);
            System.out.println(totalPrice);

        }
        else if(tableNumber>=10 && tableNumber<15){
            double thirdDiscount=tableNumber*0.10;
            totalPrice-=thirdDiscount;
            System.out.println("%10 discount "+ thirdDiscount);
            System.out.println(totalPrice);

        }
        else{
            System.out.println(" No discount");
            System.out.println("Total price "+totalPrice);
        }
    }
}
