package Zoom;

import java.util.*;

public class SetTask {
    public static void uniqueOdd(int [] arr){
        Set<Integer> nums= new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                nums.add(arr[i]);
            }
        }
        for(int odd:nums){
            System.out.print(odd+ " ");

        }
        System.out.println("**************");

    }
    public static void evenLength(String [] names){
        HashSet<String> set= new HashSet<>(Arrays.asList(names));// []---->ArrayList--> set pr Map
        for(String name:set){
            if(name.length()%2==0){
                System.out.println(name+ "s length is "+name.length());

            }
            //System.out.println("*********************");
        }

    }
    private static void middleChar(String[] str){ //{pen, Apple, Banana, pear, apple, Bnana}
        LinkedHashSet<String> set= new LinkedHashSet<>(Arrays.asList(str));
        for (String word:set) {
            if(word.length()%2==1){
                //System.out.println(word.charAt(word.length()/2));
                String reversed="";
                for (int i = word.length()-1; i>=0 ; i--) {
                    reversed+=word.charAt(i);
                }
                System.out.println(reversed);
            }
        }

    }

    public static void main(String[] args) {
        int [] array= {23,31,1,1,4,54,54,15,150};
        uniqueOdd(array);
        String [] names ={"Ayhan","Renas","Mehmet","Hocine","Ceko","Mehmet","Ceko"};
        evenLength(names);
        String[] word={"pen", "Apple", "Banana", "peach", "Apple", "Banana"};
        middleChar(word);
    }
}
