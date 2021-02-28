package Collections;

import java.util.ArrayList;
import java.util.HashMap;


public class Demographic {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> people = new ArrayList<>();

        HashMap<String, String> person1 = new HashMap<>();
        person1.put("FirstName", "Sandeep");
        person1.put("LastName", "Tushar");
        person1.put("Age", "22");
        person1.put("Gender", "male");
        person1.put("City", "Chicago");
        HashMap<String, String> person2 = new HashMap<>();
        person2.put("FirstName", "Kumar");
        person2.put("LastName", "Patel");
        person2.put("Age", "40");
        person2.put("Gender", "male");
        person2.put("City", "Schaumburg");
        HashMap<String, String> person3 = new HashMap<>();
        person3.put("FirstName", "Michael");
        person3.put("LastName", "Tushar");
        person3.put("Age", "22");
        person3.put("Gender", "male");
        person3.put("City", "Skokie");
        HashMap<String, String> person4 = new HashMap<>();
        person4.put("FirstName", "Prianka");
        person4.put("LastName", "Khan");
        person4.put("Age", "23");
        person4.put("Gender", "female");
        person4.put("City", "Des Plaines");
        HashMap<String, String> person5 = new HashMap<>();
        person5.put("FirstName", "Arti");
        person5.put("LastName", "Puri");
        person5.put("Age", "25");
        person5.put("Gender", "female");
        person5.put("City", "Arlington heights");
        HashMap<String, String> person6 = new HashMap<>();
        person6.put("FirstName", "Nandi");
        person6.put("LastName", "Puri");
        person6.put("Age", "18");
        person6.put("Gender", "female");
        person6.put("City", "Chicago");
        HashMap<String, String> person7 = new HashMap<>();
        person7.put("FirstName", "Rami");
        person7.put("LastName", "Khan");
        person7.put("Age", "18");
        person7.put("Gender", "male");
        person7.put("City", "Winnetka");
        HashMap<String, String> person8 = new HashMap<>();
        person8.put("FirstName", "Anish");
        person8.put("LastName", "Ray");
        person8.put("Age", "7");
        person8.put("Gender", "male");
        person8.put("City", "Winnetka");
        HashMap<String, String> person9 = new HashMap<>();
        person9.put("FirstName", "Janew");
        person9.put("LastName", "Jason");
        person9.put("Age", "45");
        person9.put("Gender", "male");
        person9.put("City", "New York");
        HashMap<String, String> person10 = new HashMap<>();
        person10.put("FirstName", "Binita");
        person10.put("LastName", "Jason");
        person10.put("Age", "22");
        person10.put("Gender", "female");
        person10.put("City", "New York");
        people.add(person1);people.add(person2);people.add(person3);people.add(person4);people.add(person5);
        people.add(person6);people.add(person7);people.add(person8);people.add(person9);people.add(person10);
        // 1. Find all people from Chicago
        // 2. Find all males under age 19
        System.out.println("All people from Chicago:");
        for(HashMap<String, String> person: people){
            if(person.get("City").equalsIgnoreCase("chicago")){
                System.out.println(person.get("FirstName") + " " + person.get("LastName"));
            }
        }
        System.out.println("All males under 19:");
        for(HashMap<String, String> person: people){
            if( Integer.parseInt(person.get("Age")) < 19 && person.get("Gender").equalsIgnoreCase("male")){
                System.out.println(person.get("FirstName") + " " + person.get("LastName"));
            }
        }
        // 3 - task. Change everybody's age by adding 1. If person's age currently is 22 then it should be changed to 23
        System.out.println(people);
        System.out.println("Adding the 1 year for each person age:");
        for(HashMap<String, String> person: people){
            //Integer.parseInt(person.get("Age")); // current age
            //Integer.parseInt(person.get("Age")) + 1; // updated age
            int age = Integer.parseInt(person.get("Age")) + 1;
            person.put("Age", String.valueOf(age));
            // person.put("Age", String.valueOf(   Integer.parseInt(person.get("Age")) + 1    )); the same result
        }
        System.out.println(people);
        // current structure ArrayList<HashMap<...>>
        // If we need store each day temperature for each person, what changes can we make to existing one
        // each HashMap
        //    First Name
        //    Last Name
        //    Age
        //    ..
        //    Temperature {98F, 97.7F, 96F, 98F, 97F ...}
        //    if we use List.add(temp); List.get(index);
        //    if we use Map.put(Date, temp); Map.get(Date);
        for (HashMap<String,String> person:people) {
            if(Double.parseDouble(person.get("TempDay1")) >=100 && Double.parseDouble(person.get("TempDay2")) >=100
                    && Double.parseDouble(person.get("TempDay3")) >=100){
                System.out.println(person.get("FirstName")+" "+person.get("LastName"));
            }
        }
            // command+n===> to create a constructor and getter and setter!!
    }
}