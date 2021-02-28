package NaveenAndSDET;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
    public static void main(String[] args) {
        // it is similar to hashmap but its synchronized
        // stores the value based on key and value
        // key---> Object and every Object has ---> HashCode --> value
        // HashTable stores value based on HashCode of the Key!!!!
        // no null key and values

        Hashtable h1= new Hashtable();
        h1.put(1,"Tom");
        h1.put(2,"Katie");
        h1.put(3,"Dustin");
        System.out.println(h1);

        // create a clone copy/shallow copy

        Hashtable h2= new Hashtable();
        h2= (Hashtable)h1.clone();

        System.out.println("The values from  h1: "+h1);
        System.out.println("the values from h2: "+ h2);


        h1.clear();
        System.out.println("The values from  h1: "+h1);// h1 is clear and the values are gone!
        System.out.println("the values from h2: "+ h2);

        // contains value

        Hashtable st= new Hashtable();
        st.put("A", "Katie");
        st.put("B", "Pam");
        st.put("C", "Mike");

        if(st.contains("Katie")){
            System.out.println("The value is found");
        }
        // print all the values from Hashtable using---> Enumeration-- elements()
        Enumeration e= st.elements();
        System.out.println("Print values from st using Enumeration******");

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        // get all the values from hashtable using -- entrySet()-- set of hashtable values

       Set s= st.entrySet();
        System.out.println(s);


        Hashtable st1= new Hashtable();
        st1.put("A", "Katie");
        st1.put("B", "Pam");
        st1.put("C", "Mike");
        st1.put("C", "Mike");// it wont print that bc it only contains unique elemets
        // st1.put("D", null)---> it will give null pointer exception
        System.out.println("values from st1 :"+st);
        System.out.println(st);

        // check both hashtables are equals or not

        if(st.equals(st1)){
            System.out.println("both are equal");
        }

        // get the value from a Key

        System.out.println(st.get("A"));// IT WILL print Katie

        // get the hashCode of hashtable object
        System.out.println("The hashcode value of st1 :" +st1.hashCode()); // 74746798 hashcode number


        // generic You can say I only want to store String values
        Hashtable<String, String> st3= new Hashtable<String, String>();

        }

    }
