package Homework.Homework6;

import java.util.Scanner;

public class Homework6Task5 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter one String value.
        If string length is bigger than or equals to 3 print the string without first and last char.
        If the length is not bigger than 3 print print as it is. (for this task you need to use if statement).
Example 1:
Please enter the String value:
test
The output is:
es
Example 2:
Please enter the String value:
Hello
The output is:
ell
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string value : ");
        String string= scanner.nextLine();
        int length=string.length();
        int indexFirst=string.indexOf(0);
        int indexLast=string.indexOf(length-1);
        if(length>=3){
            System.out.println(string.substring(1,length-1));

        }else{
            System.out.println(string);
        }
    }
}
