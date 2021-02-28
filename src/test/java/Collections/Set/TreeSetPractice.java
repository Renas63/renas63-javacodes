package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<String> soccerTeam= new TreeSet<>();
        // Note: Left side (variable type of the object)will decide which method to call
        // rigth side of the Object will decide which method to create in java memory!!!
        soccerTeam.add("New Year");
        soccerTeam.add("Chicago Fire");
        soccerTeam.add("Galaxy");
        soccerTeam.add("Atlanta United");
        soccerTeam.add("Inter Miami");

        System.out.println(soccerTeam.contains("Galaxy"));
        System.out.println(soccerTeam.first());// Set doesnt have a first method but treeset has
        System.out.println(soccerTeam.last());
        System.out.println(soccerTeam);

        // PollFirst it will remover the first element from TreeSet
        System.out.println(soccerTeam.pollFirst());
        // PollLast it will remover the first element from TreeSet
        System.out.println(soccerTeam.pollLast());
        System.out.println(soccerTeam);
        //TreeSet print in ascending alphabetic order.
        System.out.println(soccerTeam.descendingSet());// it will print from back to front

    }
}
