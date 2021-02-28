package Homework.HWK12;

import java.util.Arrays;

public class Task2StringToArray {
    /*
    Create one method that will take as a String and will return int array with all of the digits from String.
Example:
String str="Java1is2best3coding4language5";
Output:
[ 1, 2, 3, 4, 5 ]
NOTE: you need to convert char to String and then String to primitive
     */

    public static void method() {

        String str = "Java1is2best3coding4language5";
        String temp = "";
        //char [] ch= new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if(Character.isDigit(ch)){
             System.out.print(str.charAt(i)+ " ");
                temp+=String.valueOf(ch);
            }
        }
       // int result= Integer.parseInt(temp);

        System.out.println(temp);

        int [] temp1= new int[temp.length()];
        for (int j = 0; j <temp.length(); j++) {
            char ch= temp.charAt(j);
            String num = String.valueOf(j);
            int number= Integer.parseInt(num);
            temp1[j]= number;
        }
       System.out.println(Arrays.toString(temp1));

        }

    public static void main(String[] args) {
        Task2StringToArray test= new Task2StringToArray();
        test.method();

//    String input="Java1is2best3coding4language5";
//     input=input.replaceAll("[^0-9]+",",");
//            System.out.println(Arrays.asList(input.trim().split(" ")));
    }


             }