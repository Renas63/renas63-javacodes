package RecapAndMentoring;

import java.util.HashSet;
import java.util.Iterator;

public class SetIteration {
    public static void main(String[] args) {
        HashSet<String> animals= new HashSet<String>();// HashSet is un= ordered
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Donkey");
        animals.add("Cat");

        for(String animal:animals){
            System.out.println(animal);
            // HashSet is non order collection!!
            // Set doesn't have duplicate element

        }
        System.out.println("*******Iteration print concept*******");
        Iterator<String> animals2= animals.iterator();// transform
//        Iterator<String> iterator= animals.iterator();
        while (animals2.hasNext()){
            String animal= animals2.next();
           // System.out.println(animal);
            if(animal.equalsIgnoreCase("Cat")){
                System.out.println("Animal collection has a Cat ");
            }else{
                System.out.println("Cat has not found");
            }
        }

    }

}
