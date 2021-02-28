package Collections.Map;

import java.util.*;

public class Contacts {
    public static void main(String[] args) {

        /*
        Adam---> 2223456
        David---> 2357821

         */
        Map<String, String> contacts = new HashMap<>();

        contacts.put("Adam", "2222334");
        contacts.put("Olivia", "2222211");
        contacts.put("David", "122334");
        contacts.put("Mark", "3322334");


        System.out.println(contacts.containsKey("Olivia"));
        System.out.println(contacts.containsValue("3322334"));

        // keySet method return keys from the map in Set format
        Set<String> names = contacts.keySet(); // to print all the names
        printAllKeyS(contacts);// print all the keys
        printValues(contacts);// print all the values

        Collection<String> phones = contacts.values();
        for (String phone : phones) {
            System.out.println(phone);
        }
    }

//        for(String name:names){
//            System.out.println(name);
//        }
    // }
    // TASK: Create one method will take one map which has data type of string, string
    // and this method will print all the key from map
    // TASK-2:  Create one method will take the one map which has data type of String, String
    // and this method will print all the values from map

    private static void printAllKeyS(Map<String, String> map) {

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);

        }
    }


    public static void printValues(Map<String, String> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);

        }
    }
}