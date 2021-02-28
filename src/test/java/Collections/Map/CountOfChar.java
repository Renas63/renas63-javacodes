package Collections.Map;

import java.util.LinkedHashMap;


public class CountOfChar {

    public static LinkedHashMap<Character, Integer> getCount(String str){
        LinkedHashMap<Character,Integer> letters= new LinkedHashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            if(letters.containsKey(ch)){
                int count=letters.get(ch);
                letters.put(ch,++count);
            }else{
                letters.put(ch,1);
            }
        }
        return letters;
    }

    public static void main(String[] args) {

        System.out.println(getCount("parameter"));
        // "paramater" --> create one method that will take String as a paramater
        // and it will return count of letters from the map.
        /*
        p-1
        a-2
        r-2
        m1
        e-2
        t-1
         */
    }
}
