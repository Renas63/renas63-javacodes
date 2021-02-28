package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> map= new LinkedHashMap<>();
        HashMap<String, Integer> map1= new HashMap<>();
        TreeMap<String, Integer> map2= new TreeMap<>();
        map.put("Banana", 1);   map1.put("Banana", 1);    map2.put("Banana", 1);
        map.put("Apple", 4);    map1.put("Apple", 1);     map2.put("Apple", 1);
        map.put("Peach", 5);    map1.put("Peach", 1);     map2.put("Peach", 1);
        map.put("Orange", 10);   map1.put("Orange", 1);   map2.put("Orange", 1);
        map.put("Kiwi", 12);     map1.put("Kiwi", 1);      map2.put("Orange", 1);
        map.put("Melon", 11);    map1.put("Melon", 1);      map2.put("Melon", 1);

        map.put("Kiwi", null);     map1.put("Kiwi", null);      map2.put("Orange", null);
        map.put("Melon", null);    map1.put("Melon", null);      map2.put("Melon", null);


        // how many null keys can HashMap and LinkedHashMap can hold?
        // what is the type of keys of each Map? What collection type Map uses for its keys?
        //      HashMap -> HashSet
        //      LinkedHashMap -> LinkedHashSet
        //      TreeMap -> TreeSet
        // Sets can hold only unique elements, null value will only be once
        // Map can only one null key

        System.out.println(map);
        System.out.println(map1);
        System.out.println(map2);


    }
}
