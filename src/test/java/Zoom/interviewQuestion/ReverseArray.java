package Zoom.interviewQuestion;

public class ReverseArray {

    // Reversing String with Reverse Function
    public static void reverseArray1() {// with using charAt method
        String word = "techtorial";

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        System.out.println(reversed);
    }

    //Reversing String with StringBuffer method
    public static void reverseArray2() {
        String word1 = "Renas Ruken";
        StringBuffer sb = new StringBuffer(word1);
        System.out.println(sb.reverse());
    }

    //Reversing a String with StringBuilder method
    public static void reverseArray3() {
        String word3 = "I love doing what I am doing!";
        StringBuilder sb = new StringBuilder(word3);
        System.out.println(sb.reverse());
    }

    // Reversing A String with a charArray
    public static void reverserArrayWithCharArray() {
        String toReverse = "Hello Techtorial";
        String reversed1 = "";
        char[] array = toReverse.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            reversed1 += array[i];
        }
        System.out.println(reversed1);
    }

    // reversing a string with substring method!
    public static void reverseArrayWithSubstring() {
        String toReverse = "I love Java";
        String reversed = "";
        for (int i = toReverse.length(); i >= 1; i--) {
            reversed += toReverse.substring(i - 1, i);

        }
        System.out.println(reversed);
    }

    // reverse string word by word
    public static void reverseArrayWordByWord() {
        String str = "I studying to became a sdet";
        String reversed = "";
        String[] array = str.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            reversed = reversed +  array[i] + " ";
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        reverseArray1();
        reverseArray2();
        reverseArray3();
        reverserArrayWithCharArray();
        reverseArrayWithSubstring();
        reverseArrayWordByWord();

        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String replaced=given.replaceAll("[^A-Za-z]","");
        System.out.println(replaced);
    }
}
