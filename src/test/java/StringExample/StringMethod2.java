package StringExample;

public class StringMethod2 {
    public static void main(String[] args) {
        String device="mic rophone"; // do we count space as a index number? YES YES YES

        System.out.println(device.charAt(4));

        char letter=device.charAt(8);

        System.out.println(letter);

       // System.out.println(device.charAt(-10));// it will throw the indexoutOfBoundryRxception.

       // System.out.println(device.charAt(20));//it will throw the indexoutOfBoundryRxception.

        System.out.println(device.indexOf("m"));

        System.out.println(device.indexOf(" "));

        System.out.println(device.indexOf("rop")); // it will returns index number for first matching element

        System.out.println(device.indexOf("k"));// if there is no matching letter , it will returns -1
        System.out.println(device.indexOf("ono")); //returns -1 --> it should be matching with exactly all the letters

        System.out.println(device.indexOf("o"));// it will give the index number of first matching o

        System.out.println(device.indexOf("on"));
        System.out.println(device.indexOf("o", 6));// it will look for second index number of o

        System.out.println(device.indexOf("o",device.indexOf("o") +1));


    }
}
