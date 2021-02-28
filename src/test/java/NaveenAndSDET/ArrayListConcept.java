package NaveenAndSDET;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        // int []a new array[3]--> static array, fixed size
        //1. Array is fixed size but Arraylist is not.
        //2.inside the Array we can store primitive data type and object but inside Arraylist we can store only Object.
        //3.Array has no method but Arraylist has the method.
        //4. ArrayList can contains dublicate elements
        //5.  ArrayList maintain insertion order
        //6. ArrayList is synchronized!
        //7. ArrayList allows random access to fetch the elements bc it stores values based on indexes
        // ArrayList is a dynamic Array.
         ArrayList ar = new ArrayList();
         ar.add(10);//0
         ar.add(20);//1
         ar.add(30);//2

        System.out.println(ar.size());// ar,size() will give us size of arrayList
        ar.add(40);//3
        ar.add(50);//4
        ar.add("Test");
        ar.add('a');
        ar.add(true);

        System.out.println(ar.size());
        System.out.println(ar.get(4));// to get a value from an index
        // to print all the values from arrayList, we use for loop or iterator
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        // non generic vs. generic ??????
        ArrayList <Integer>ar1 = new ArrayList<Integer>();
        ar.add(100);
        ar.add(120);
        ArrayList <String> ar2 = new ArrayList<String>();
        ar.add("Renas");
        ar.add("Katie");

        // ArrayListEmployee Class Object
        Employee e1= new Employee("Naveen", 27, "QA");
        Employee e2= new Employee("Renas", 35, "DevOps");
        Employee e3= new Employee("Kevin", 47,"HR");

        // Create arraylist
        ArrayList<Employee> ar4= new ArrayList<Employee>();
        ar.add(e1);
        ar.add(e2);
        ar.add(e3);
        // Iterator to traverse the values
        Iterator<Employee> it= ar4.iterator();
        while (it.hasNext()){
           Employee emp= it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }
    }
}
