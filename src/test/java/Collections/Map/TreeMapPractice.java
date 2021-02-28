package Collections.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {

        // 60018---> Des Plaines
        // 60606--> Chicago

        TreeMap<Integer, String> cities= new TreeMap<>();
        cities.put(60018,"Des Plaines");
        cities.put(60606,"Chicago");
        cities.put(960630,"Albany Park");
        cities.put(60641,"Portage");
        cities.put(60659,"Lincoln");

        // entrySet();---> <Set<Map.Entry<Integer, String> return
        // entrySet method will return everything from map as a SET. Data type of set is Map.Entry
        /*
        Map.Entry interface has two methods which are getValue and getKey
         */


        Set<Map.Entry<Integer, String>> data= cities.entrySet();

        for(Map.Entry<Integer, String> city:data){
            System.out.println(city.getKey());
            System.out.println(city.getValue());
        }
    }
}
