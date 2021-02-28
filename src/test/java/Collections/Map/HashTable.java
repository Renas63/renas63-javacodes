package Collections.Map;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        /*
        1. it is similar to hashmap but its synchronized( step by step in order)
2. stores the value based on key and value
3. key---> Object and every Object has ---> HashCode --> value
4. HashTable stores value based on HashCode of the Key!!!!
5.it only contains unique elemets
6.no null key and  values
7. we dont use multi threading!!!
         */


        Hashtable <Integer, String>className= new Hashtable();
        className.put(201, "Computer");
        className.put(202, "Math");
        className.put(203, "Literature");
        className.put(204, "Test");

        Set<Map.Entry<Integer, String>> classes= className.entrySet();
        for(Map.Entry<Integer, String>class1:classes){
            System.out.println(class1.getValue());
            System.out.println(class1.getKey());
        }
    }
}
