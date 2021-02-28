package Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetPractice2 {
    public static void main(String[] args) {
       String [] arrayOfString={"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry",
               "Blueberry", "Blackberry", "Apple", "Pear", "Banana", "Grapefruit"};
       // find a unique items in the  String Array
        HashSet<String> setOfString= new HashSet<String>();
        HashSet set1= new HashSet(Arrays.asList(arrayOfString));// convert array to list!!!

        System.out.println(set1);
        for (int i = 0; i < arrayOfString.length; i++) {
            boolean isUnique= false;

            for (int j = 0; j < arrayOfString.length ; j++) {
                if(i!=j && arrayOfString[i]==arrayOfString[j]){
                    isUnique= true;
                    break;
                }

                }if(!isUnique){
                System.out.println("unique :" +arrayOfString[i]);
            }

        }
//        HashSet<String> setOfString1= new HashSet<String>();
//        HashSet set1= new HashSet(Arrays.asList(arrayOfString));// convert array to list!!!
//        for (int i = 0; i < arrayOfString.length; i++) {
//            boolean duplicate = false;
//
//            for (int j = 0; j < arrayOfString.length; j++) {
//                if (i != j && arrayOfString[i] == arrayOfString[j]) {
//                    duplicate = true;
//                    continue;
//                }
//            }if(duplicate){
//                System.out.println(arrayOfString[i]+" ");
//            }
//        }
         // set.add(object)---> true, false. if the values exist it return false
        HashSet<String> set2= new HashSet<>();
        ArrayList<String> list1= new ArrayList<>();
        HashSet<String> set3= new HashSet<>();
        for(String item:arrayOfString){
            if(!set2.add(item)){
               set3.add(item);
            }
        }
        // using for loop instead of for each lop
        // for(int i=0; i< arrayOfString.length; i++){
        //    if(!set.add(arrayOfString[i])){
        //            set3.add( arrayOfString[i])
        //     }
        // }
        System.out.println(set3);
    }
}
