package NaveenAndSDET.SDET;

public class StringMethods {
    public static void main(String[] args) {

        String s ="Welcome";
        String s1="to Java";
        System.out.println(s.length());// Length of String

        System.out.println(s.concat(s1));// joining of string

        s="    Welcome    ";
        System.out.println(s.trim());// to remove space we use s.trim


        // charAt()
        s="welcome";
        System.out.println(s.charAt(3));// returns character based on index. it will return c

        // contains() returns true or false. its case sensitive
        s="welcome";
        System.out.println(s.contains("wel"));// true
        System.out.println(s.contains("Wel"));// false -- case sensitive

        // comparing strings equals
        s="welcome";
        System.out.println(s.equals("welcome"));// true
        System.out.println (s.equals("Welcome"));//false
        System.out.println(s.equals("wel come "));// false

        System.out.println(s.equalsIgnoreCase("Welcome"));// true





    }
}
