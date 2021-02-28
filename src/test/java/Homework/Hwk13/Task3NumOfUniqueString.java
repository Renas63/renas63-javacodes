package Homework.Hwk13;

import java.util.HashSet;

public class Task3NumOfUniqueString {
    /*
    Create one method takes one String array. This method needs to return how many unique element you have in array.
Input: [“java”, “phython”, “javascript”, “c++”, “java”, “c++”]
Output: 4
     */
    private static void numOfUniqueStrings(String[] strs){
        HashSet<String> set=new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            set.add(strs[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
    public static void main(String[] args) {
        String [] strs={"java", "phython", "javascript", "c#", "java", "c++"};
        numOfUniqueStrings(strs);
    }
}
