package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class YermekTask {
    public static void main(String[] args) {
        // yo have 2 lists. One list for first firstNames of students the other is for last firstNames
        // Sort the lists in alphabetic order by first  name

        ArrayList<String> firstNames= new ArrayList<>();
        firstNames.add("Ramis");
        firstNames.add("Ari");
        firstNames.add("Ela");
        firstNames.add("Chopa");
        Collections.sort(firstNames);
        System.out.println(firstNames);

        List<String> lastNames= new ArrayList<String>();

        lastNames.add("Lopes");
        lastNames.add("Whatever");
        lastNames.add("Grande");
        lastNames.add("Gomes");

        List<String> firstNamesAndLastNames= new ArrayList<>();
        for (int i = 0; i <firstNames.size() ; i++) {
            firstNamesAndLastNames.add(firstNames.get(i)+" "+ lastNames.get(i));
        }
        Collections.sort(firstNamesAndLastNames);
        firstNames.clear();
        lastNames.clear();
        for (int i = 0; i <firstNamesAndLastNames.size(); i++) {
            String names []= firstNamesAndLastNames.get(i).split(" ");
            firstNames.add(names[0]);
            lastNames.add(names[1]);

            System.out.println(firstNames);
            System.out.println(lastNames);
            for (int j = 0; j < firstNames.size(); j++) {
                System.out.println(firstNames.get(j)+ " "+lastNames.get(j));
            }
        }
       // System.out.println(firstNamesAndLastNames);
    }
}
