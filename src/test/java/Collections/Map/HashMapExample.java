package Collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap <String, String> map= new HashMap();
        map.put("Serhan", "312 111,2222");
        map.put("Mehmet", "312 333,4321");
        map.put("Kushal", "312 543,2343");
        map.put("Pryanka", "312 923,1222");
        map.put("Yermek", "773 621,9876");

        map.put("Serhan", "614 324 4455");// it will reject bc it doesnt accept duplicate!
        map.put(null," 000 000 0000");
        map.put("Michael", null);

        map.put(null,"111 111 1111");
        System.out.println(map);//

        map.remove("Yermek");
        System.out.println(map);
        System.out.println(map.get("Yermek"));

        Set<String> keySet= map.keySet();
        System.out.println(keySet);

        map.replace("Kushal","314 345,2340");
        System.out.println(map);

        map.containsKey("Yermek");// return true or false
        map.containsValue("773 621,9876");//// return true or false

        System.out.println(map.put("Raj", "123 487333"));
        System.out.println(map.put("Raj", "123 463 2111"));
        // set.add(" " )--> false then it means value is already exist
        // map.put(obj, obj)---> origin value, if the key already exist and replace the value


        // solve the problem of funding element inside the array with using Map!
        String[] arrayOfString = {"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry", "Blueberry", "Blackberry", "Apple", "Pear", "Banana",
                "Grapefruit", "Apple", "Pear", "Grapefruit"};
            // map.put

        //2. count the items inside of tge Fruits array and give the number of each
        // Banana-2, Apple- 3

    }
}
