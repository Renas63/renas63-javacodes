package WhileLoop;


import java.util.Scanner;

public class TestXXXXX {
    public static void main(String[] args) {
        /*
        Using scanner ask user to provide one string value then print this string in following format.
        While the length of string is less than 20 then ass the X at the end of the string.
    "test"
    testX
    testXX
       testXXX
..
..
..
testXXXXXXXXXXXXXXXX
         */

        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter a string value");
        String str= input.next();

        while(str.length()<19){
            str=str.concat("X");// we reassign the str because string is immutable. it cant be changed!!!
            System.out.println(str);

        }


    }
}
