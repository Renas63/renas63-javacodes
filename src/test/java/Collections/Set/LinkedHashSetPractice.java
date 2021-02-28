package Collections.Set;
import java.util.*;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        HashSet<String> set = new HashSet<>();
        set.add("Banana");
        set.add("Grapefruit");
        set.add("Mango");
        set.add("Kiwi");
        set.add("Blackberry");
        set.add("Blueberry");
        set.add("Cherry");
        //set.add(null);
        System.out.println(set);
        linkedSet.add("Banana");
        linkedSet.add("Grapefruit");
        linkedSet.add("Mango");
        linkedSet.add("Kiwi");
        linkedSet.add("Blackberry");
        linkedSet.add("Blueberry");
        linkedSet.add("Cherry");
        //linkedSet.add(null);
        System.out.println(linkedSet);
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Grapefruit");
        treeSet.add("Mango");
        treeSet.add("Kiwi");
        treeSet.add("Apple");
        treeSet.add("Strawberry");
        // treeSet.add(null); - TreeSet doesn't allow null values
        // because of sorting
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());
    }
}