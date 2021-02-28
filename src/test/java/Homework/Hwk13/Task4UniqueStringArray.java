package Homework.Hwk13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
/*
Create one method takes one String Array and needs to return ArrayList with unique elements with
ascending from String Array. Input: [“java”, “phython”, “javascript”, “c++”, “java”, “c++”]
Returns new ArrayList —> [“c++”,“java”, “javascript”,“phython”]
 */

public class Task4UniqueStringArray {
    private static ArrayList<String> uniqueString(String [] str){
        TreeSet<String> tree= new TreeSet<>(Arrays.asList(str));
        ArrayList<String> newStr= new ArrayList<>(tree);
       return newStr;

    }
    public static void main(String[] args) {
        String [] str= new String[5];
        Scanner input = new Scanner(System.in);
        /*int num=4;
        while(num>=0){
            System.out.println("Enter a String:");
            str[num]=input.next(); // {"0","1","2","3","4"}
            num--;
        }*/
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter " +(i+1)+". String" );
            str[i]= input.next();
        }
        System.out.println(uniqueString(str));
    }


}
