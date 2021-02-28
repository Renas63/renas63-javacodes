package Primitives;

public class CompoundAssignment {
    public static void main(String[] args) {


        int inventory=100;
        inventory=inventory+50;
        // the result will be assign to the inventory
        System.out.println(inventory);

        inventory+=50;
        System.out.println(inventory);

        inventory/=4; // inventory=200/4 ---result 50
        System.out.println(inventory);

        inventory*=5; // inventory= inventory*5;  result --> 250
        System.out.println(inventory);



        byte price=90;
        price+=42;
        System.out.println(price);


    }
}
