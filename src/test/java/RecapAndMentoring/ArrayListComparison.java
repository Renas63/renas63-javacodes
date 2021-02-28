package RecapAndMentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {
    public static void main(String[] args) {

        // 1. Using sorting and then equals
        //      1.1 Sort
        //      1.2 Compare using equals method
        ArrayList<String> hisCars = new ArrayList<String>(Arrays.asList("BMW", "Infiniti", "Toyota"));
        ArrayList<String> herCars = new ArrayList<String>(Arrays.asList("BMW", "Toyota", "Infiniti"));
        Collections.sort(hisCars);
        Collections.sort(herCars);
        System.out.println(hisCars.equals(herCars));
        System.out.println();
        // 2. Finding out additional/missing elements
        ArrayList<String> skillSet = new ArrayList<String>(Arrays.asList("Java", "Selenium", "SQL", "RestAssured", "Postman"));
        ArrayList<String> requirements = new ArrayList<String>(Arrays.asList("Selenium", "SQL", "Java", "Postman"));
        System.out.println(requirements.removeAll(skillSet));
        System.out.println(requirements);
        if (requirements.size() == 0) {
            System.out.println("You are hired");
        } else {
            System.out.println("You need to learn more");
        }
        // 3. Finding out common elements
        ArrayList<String> skillSet2 = new ArrayList<String>(Arrays.asList("Java", "Selenium", "SQL", "RestAssured", "Postman"));
        ArrayList<String> requirements2 = new ArrayList<String>(Arrays.asList("Selenium", "SQL", "Java", "Postman", "Cucumber"));
        System.out.println(requirements2.retainAll(skillSet2)); // retainAll method will return us common/same elements between two Lists
        System.out.println(requirements2);
    }
}
