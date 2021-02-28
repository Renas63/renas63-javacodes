package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSetExample {
    public static void main(String[] args) {
        ArrayList <String> names= new ArrayList<>();
        names.add("Erkan");
        names.add("Ela");
        names.add("Aya");
        names.add("Kushal");
        names.add("Priyanka");
        names.add("Army");
        System.out.println(names);
        // I want to replace Aya with Priyanka
        names.set(3,"Kayla" );
        //names.set(names.indexOf("Aya"),"Adam" ); this way work as well!!!
        System.out.println("Changed names after using set method: ");
        System.out.println(names);



        Object[] namesArray = names.toArray();     // converts our list to the array
        String[] convertedArray;
        String[] lastNamesArray = {"John", "Abba"};
        List<String> list = Arrays.asList(lastNamesArray);     // converts Array to the List

    }
}
