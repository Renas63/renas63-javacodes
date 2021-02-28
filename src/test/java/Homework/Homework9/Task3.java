package Homework.Homework9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*
        Description
Using scanner ask user to provide the string value.
Print "dad" if the given string contains the "dad", but where the middle 'a' char can be any char.
Example:
Input the year: testdadtest Output :dad
Input the year: testd7dtest Output :dad
Input the year: testdodtest Output :dad
Input the year: testDudtest Output :dad

loop the string letter if the letter is equals to the "d" then check after second char is also equals to d then print dad

         */
        System.out.println(" Please enter  a string value");
        String str= input.nextLine().toLowerCase();

        String word=str.substring(str.indexOf("d"),str.indexOf("d")+3);
        if (word.charAt(0)==word.charAt(2)){
            System.out.println("dad");
        }

//

    }
}
