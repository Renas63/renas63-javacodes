package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class YermekSecandWay {
    public static void main(String[] args) {

        ArrayList<String> firstNames = new ArrayList<>();
        firstNames.add("Ramis");
        firstNames.add("Ari");
        firstNames.add("Ela");
        firstNames.add("Chopa");
        Collections.sort(firstNames);
        System.out.println(firstNames);

        List<String> lastNames = new ArrayList<String>();

        lastNames.add("Lopes");
        lastNames.add("Whatever");
        lastNames.add("Grande");
        lastNames.add("Gomes");
        List<String> firstNamesSorted = new ArrayList<>(firstNames);
        Collections.sort(firstNames);

        for (int i = 0; i < firstNamesSorted.size(); i++) { // sorted ArrayList
            for (int j = 0; j < firstNames.size(); j++) {// unsorted ArrayList


                if (firstNamesSorted.get(i).equals(firstNames.get(i))) {

                }
            }
        }
    }
}
