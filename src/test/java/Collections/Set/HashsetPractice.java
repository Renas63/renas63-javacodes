package Collections.Set;

import java.util.*;


public class HashsetPractice {
    public static void main(String[] args) {

        ArrayList list= new ArrayList();

        HashSet set= new HashSet();// we are creating a new HashSet with Object

        HashSet<String> setOfString= new HashSet<>();
        Set set2= new HashSet(); //with Object , but uising Set interface(Super class)

        HashSet set3= new HashSet(list); // converting the  arraylist to hASHsET OF object


        setOfString.add("Banana");
        setOfString.add("peach");
        setOfString.add("strawberry");

        System.out.println(setOfString);
        // sets(specifically HashSet
        if(setOfString.contains("Rasberry")){
            System.out.println("the sets contains rasberry");

        }else{
            System.out.println("the sets doesnt contains rasberry");
            setOfString.remove("Banana");
            System.out.println("Banana is removed" +setOfString);

            System.out.println("the size of set is : "+setOfString.size());

            list.add("banana");
            list.add("strwberry");
            list.add("Rasberry");
            list.add("blueberry");
            list.add("Blackberry");
            list.add("Banana");// duplicate entry

            System.out.println("this is our ArrayList : "+list);

            HashSet set4= new HashSet(list);// converting arraylist to HashSet
            System.out.println("This is our HashSet: " + set4);
        // arraylist allow duplicate element but Set doesnt!!
            if(set4.add("Grape")) {
                System.out.println("there is no such value in set I am adding");
            }else {
                System.out.println("there is already such value in set, I am adding");
            }
            if(set4.add("Blackberry")) {
                System.out.println("there is no such value in set I am adding");
            }else {
                System.out.println("there is already such value in set, I am adding");

            }
            // for loop is applicable for Sets!!!
            // since we ont have a .get() method
            System.out.println("we are using Iterator to parse through Set : ");
            Iterator iterator= set4.iterator();// you can use foreach instead
            while(iterator.hasNext()){
                String currentElementInSet= (String) iterator.next();
                // we are using casting for next(), because it returns Object type

                System.out.print(currentElementInSet + " ");
                //System.out.println(iterator.next());
                // WHAT IS ITERATOR???????????/


            }
        }


    }
}
