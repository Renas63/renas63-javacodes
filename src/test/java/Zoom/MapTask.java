package Zoom;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask {
        /*
create a method that will accept a String array with duplicate values // mehmet=6
using map print unique String values with their sizes next to them.
 */

    public static void namesSize (String [] str){
        Map<String, Integer> nameMap=new LinkedHashMap<>();
        for (int i = 0; i < str.length; i++) {
            if(nameMap.containsKey(str[i])){
                System.out.println(str[i]);
            }else
            nameMap.put(str[i], str[i].length());
        }
        System.out.println(nameMap);
    }
    public static void main(String[] args) {
        String[] str2={"ayhan", "ridvan", "renas","army","serhat","mehmet","ayhan","renas","army"};
        namesSize(str2);
    }
}


