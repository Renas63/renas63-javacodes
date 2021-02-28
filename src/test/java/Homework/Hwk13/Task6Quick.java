package Homework.Hwk13;

import java.util.LinkedHashMap;

public class Task6Quick {
    private static LinkedHashMap<String,Integer> bigram(String str){
    str=str.toLowerCase();
    LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
    String [] strings=str.split(" "); // ["The", "quick", "brown,....]
    for(int i = 0; i < strings.length-1; i++) { // 8
        //String pair=str.substring(0,str.indexOf(" ",str.indexOf(" ")+1));
        //str=str.substring(str.indexOf(" ")+1);
        String pair=strings[i]+" "+strings[i+1];
        if(!map.containsKey(pair)) { // "army", 5
            map.put(pair, 1);
        }else{
            Integer value=map.get(pair)+1; // 1 +1
            map.put(pair,value);
        }
    }
    return map;
}
    public static void main(String[] args) {
        String str="The quick brown fox and the quick blue hare.";
        System.out.println(bigram(str));
    }
}
