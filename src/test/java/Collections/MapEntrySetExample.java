package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetExample {
    public static void main(String[] args) {
        // {Banana, 1}, { Orange,2} {Kiwi, 5} {Pear, 4}
        HashMap<String, Integer> fruits= new HashMap<>();
        fruits.put("Banana",1);
        fruits.put("Orange",2);
        fruits.put("Kiwi",5);
        fruits.put("Pear",0);

        // how can you iterate the Set or List?
        //for(String item:set) {....}--> iterating a Set
        //for(String item:List) {....}--> iterating a List
        // how can You iterate the Map?

        System.out.println(" *******Approach 1. Use .keySet()*****");
        // Approach 1. Use .keySet()
        Set<String> keys= fruits.keySet();
        for(String key: keys){
            System.out.println(key + " " +fruits.get(key));

            System.out.println("Using Map.Entry to iterate");
           //Approach 2. use EntrySet()
            Set<Map.Entry<String, Integer>> entries= fruits.entrySet();
           for(Map.Entry entry: entries){
               System.out.println(entry.getKey()+ " - "+entry.getValue());
           }
        }
    }
}
