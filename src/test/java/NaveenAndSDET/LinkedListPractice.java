package NaveenAndSDET;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        // Linked
        LinkedList<String> linkedList = new LinkedList<>();
        // add
        linkedList.add("test");
        linkedList.add("Jo");
        linkedList.add("Dubby");
        linkedList.add("Mike");

        // print
        System.out.println("Content of LinkedList: " + linkedList);

        // addfirst
        linkedList.addFirst("Katie");

        //addlast
        linkedList.addLast("Renas");
        System.out.println(linkedList.get(5));// it will get last index Renas

        // get
        linkedList.get(1);

        // set
        linkedList.set(0, "Tom");
        System.out.println(linkedList.get(0));

        //removefirst
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Content of Linkedlist :" + linkedList);

        linkedList.remove(2);
        System.out.println("Content of linkedlist is : " + linkedList);

        // to print all the values of LikedList
        //1.for loop
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));

            // 2. advance for loop
            System.out.println("Using advance for loop");
            for (String str : linkedList) {
                System.out.println(str);


                //3. using Iterator
                System.out.println("*****Using Iterator*****");
                Iterator<String> iterator = linkedList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());


                    // while loop
                    System.out.println("***** Using while loop ***");
                    int num = 0;
                    while (linkedList.size() > num) {
                        System.out.println(linkedList.get(num));
                        num++;
                    }

                }
            }
        }
    }
}
