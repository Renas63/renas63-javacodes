package Collections.Map;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample2 {
    public static void main(String[] args) {
        String[] arrayOfString = {"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry", "Blueberry", "Blackberry", "Apple", "Pear", "Banana",
                "Grapefruit", "Apple", "Pear", "Grapefruit"};
        // print out unique elements!!!!
        HashMap<String , Integer> map= new HashMap<>();
        for (int i = 0; i < arrayOfString.length; i++) {// Solution with HashMap!!!
            map.put(arrayOfString[i],0);

        }
        System.out.println(map);


        HashSet<String> set1= new HashSet<String>();// solution with HASHSET
        for (int i = 0; i < arrayOfString.length; i++) {
            set1.add(arrayOfString[i]);

        }
        System.out.println(set1);

        HashMap<String , Integer> map1= new HashMap();
        for (int i = 0; i < arrayOfString.length; i++) {

            if (!map1.containsKey(arrayOfString[i])) {
                map1.put(arrayOfString[i], 1);
            } else {
                Integer currentAmount = map1.get(arrayOfString[i]);
                map1.put(arrayOfString[i], currentAmount + 1);
            }
        }
        // i => 11
        // arrayOfString[i] => Apple
        // map.containsKey(arrayOfString[i]) => false  - > true
        //          map.put("Apple", 1)
        // currentAmount - 2
        // map.put(arrayOfString[i],
        System.out.println(map1);
    }
}
