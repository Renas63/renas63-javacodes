package RecapAndMentoring.TeymurRecap;

import java.util.Map;
import java.util.TreeMap;

public class Cognizant {
    /*
    Input String: Patel, $95.000, New York, NJ
                  George, $100.000, Chicago, IL
                  Swetha, $90.000, Columbus, OH

    Output: Print: Name: George, Salary: $100.000, DeliveryTo: IL, Chicago
                   Name: Patel, Salary: $95.000, DeliveryTo: NJ, New York
                   Name: Swetha, Salary: $90.000, DeliveryTo: OH, Columbus
     */

    /*
        1. Create TreeMap<Name(String), Information(String)>

     */
    public static void solution(String str) {
        String[] lines = str.split("\n");

        Map<String, String> output = new TreeMap<>();

        for(int i=0; i<lines.length; i++) {
            String[] info = lines[i].split(",");

            String name = info[0].trim();
            String salary = info[1].trim();
            String city = info[2].trim();
            String state = info[3].trim();

            String information = "Name: "+name+", Salary: "+salary+", DeliveryTo: "+state+", "+city;

            output.put(name,information);
        }

        for(String name: output.keySet()) {
            System.out.println(output.get(name));;
        }
    }

        /*
        input: Java
               I love Java

       output: true or false, second line, contains word on first line
         */

    public static boolean secondLineContainsFirst(String str){
        String[] lines = str.split("\n");
        return lines[1].contains(lines[0].trim());
    }

    public static void main(String[] args) {
//        String input = "Patel, $95.000, New York, NJ\n" +
//                "                  George, $100.000, Chicago, IL\n" +
//                "                  Swetha, $90.000, Columbus, OH";
//
//        solution(input);


        System.out.println(secondLineContainsFirst("Java \n I love Java"));

        System.out.println(secondLineContainsFirst("met \n I met my friends yesterday."));

        System.out.println(secondLineContainsFirst("SQL \n I work with MongoDB"));

    }

}
