package ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class Methods2 {
    public static void main(String[] args) {
        List<String> animals= new ArrayList<>();

        animals.add("Lion");
         animals.add("Cat");
         animals.set(0, "Dog");

         //animals.set(4,"Bird"); //  indexoutofboundeyexception bc we dont have index num of 4
        System.out.println(animals.isEmpty());// return false bc animals is  not empty
        System.out.println(animals);
        System.out.println(animals.contains("Lion"));// false
        System.out.println(animals.contains("Dog"));// true
        System.out.println(animals.contains("cat"));// false, bc java is case sensitive!!!

        System.out.println("*******************************************");

        animals.clear();// it will delete all the lemenet from arraylist
        System.out.println(animals.isEmpty());// true


        ArrayList<String> animals1= new ArrayList<>();
        animals.add("Dog");
        animals1.add("Cat");

        System.out.println("Result :" +animals.equals(animals1)); // false since we clear all above class element
        //.equals() ---> chek the index number of also case sensitivity so the order has to be same and names has to same
    }
}
