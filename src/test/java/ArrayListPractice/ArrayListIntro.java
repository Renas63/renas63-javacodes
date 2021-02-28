package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("David");
        names.add("Marcus");
        names.add("John");
        // ArrayList follows insertion order!!!
        names.add(1, "Abby");
        //names.add(10, "Kushal");// IndexOutOfBoundsException  SINCE WE DONT HAVE INDEX OF 10
        names.add(4, "Liz");
        names.get(3);
        System.out.println(names.get(3));
       // System.out.println(names.get(10));// IndexOutOfBoundsException

        for (int i = 0; i <names.size(); i++) { // to get all the names of ArrayList
            System.out.println(names.get(i));
        }
        for(String name:names){ // to get all the names of ArrayList
            System.out.println(name);
        }
        System.out.println(names.size());// will get the size of arraylist

        print(names);// we call like that since main method and print method are static!

        System.out.println(names);//[David, Abby, Marcus, John]
//
//        ArrayListIntro name= new ArrayListIntro(); we can get the result with creating an object
//            name.print(names);

        ArrayListIntro.print(names);// we call that way too since we have static method




    }
    public static void print(ArrayList<String>test){ // we add static to method to print the names

        for (int i = 0; i < test.size() ; i++) {
            if(test.get(i).length()>=5){
                System.out.println("Bigger than or equals to 5 :" +test.get(i));
            }
        }
    }

}
