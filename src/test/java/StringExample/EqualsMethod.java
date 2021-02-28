package StringExample;

public class EqualsMethod {
    public static void main(String[] args) {


        String str= "Techtorial";
        String str1= "Techtorial";
        String str2= new String("Techtorial");
        String str3= new String("Techtorial");
        String str4= "Techtorial";
        String st5= "Techtorial";

        // == ---> it will compare both variables are pointing to same object in the memory  or not
        // .equals ---> will compare both object values are same or not in String

        System.out.println(str==str1); //---> true
        System.out.println(str2==str3); // ----> false

        System.out.println(str.equals(str1));//true
        System.out.println(str.equals(str1));// true
        System.out.println(str2.equals(str3));// true

        System.out.println(str==str2); // false
        System.out.println(str2.equals(str3));// true


        String str6=str2;
        System.out.println(str6==str2);  // true
        System.out.println(str6.equals(str2));// true








    }
}
