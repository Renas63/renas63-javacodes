package NaveenAndSDET;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapConcept {
    public static void main(String[] args) {
        // HashMap is   class implements Map Interface
        // extends AbstractMap
        //1. it contains only unique elements
        //2. stores the values- key- value pair
        //3. it may have one null key and multiple null values
        //4. it maintains no order
        //5. HashMap is non-SYNCHRONIZED( all the threads without the problem of synchronization
        // can hit or can access the value from that particular Object )--> NOT THREAD SAFE
        // concurrent modification exception--> Fail Fast condition
        //NOTE: HashTable is synchronized and HashMap is not synchronized
        // HashMap works based on HashCode!!!!
        // if Key given already exist in HashMap, the value will be replace with new value
        HashMap<Integer, String> hm =new HashMap<Integer, String>();
        hm.put(1, "selenium");
        hm.put(2, "Cucumber");
        hm.put(3, "Test case");
        hm.put(4, "techtorial");
        System.out.println(hm.get(1));// it will return selenium
        System.out.println(hm.get(4));// it will null . no boundary Exception
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+ " " + m.getValue());
        }
        System.out.println(hm);
        hm.remove(3);// it will remove test case
        System.out.println(hm);

        HashMap<Integer, Employee> emp= new HashMap<Integer, Employee>();
        Employee e1= new Employee("Tom,",25, "Admin");
        Employee e2= new Employee("John,",34, "QA");
        Employee e3= new Employee("zach,",31, "Dev");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);

    // traverse the hashmap
        for(Entry<Integer, Employee> m : emp.entrySet()){
            int key= m.getKey();
            Employee e= m.getValue();
            System.out.println("Empleyee " +key+ " Info ");

            System.out.println(e.name +" " +e.age + " " +e.dept);
        }

        Map <String, Integer> marks= new HashMap<String, Integer>();
        marks.put("Naveen", 100);
        marks.put("Alex", 200);
        marks.put("Syed", 300);
        marks.put("Anush", 400);
        marks.put("Jash", 600);

        marks.put(null, 500);

        // hashing: hashCode() ---> hashing
        // null hoshcode is 0!

        System.out.println(marks.get("Alex"));
        /*
        hashcode of Alex--->210678
        index= 15
        .equals to check the key name
        Lisa
        return value
         */

    }
}
