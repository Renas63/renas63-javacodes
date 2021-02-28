package ArrayConcept;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        String str="Split method is coming from the String Class.";
        //System.out.println(str.length());// length of str
    // return type of Split method is String array! interview Question!!!!!!!!!!!!!!!!!
        String [] words=str.split(" ");
        // Split method will split the String with spaces
        // and store inside the array
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

      String cities="Chicago.Denver.Madison.Milwaukee";
      String [] city=cities.split("\\.");
      // NOTE: When we try to split with. we must use \\ double slash in the beginning!
        System.out.println(Arrays.toString(city));

        String name= "\"Techtorial\"t\nAcademy";
        System.out.println(name);



    }
}
