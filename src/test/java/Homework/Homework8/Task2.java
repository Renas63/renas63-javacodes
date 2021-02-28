package Homework.Homework8;

import java.util.Scanner;

public class Task2 {
    /*
    Write a Java program that takes the user to provide a single character from the alphabet.
     Print Vowel or Consonant, depending on the user input.
     If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
     print an error message.
Input an alphabet:
p
Expected Output :
Input letter is Consonant
     */
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("please provide an alphabet");
        char ch=sc.next( ).charAt(0);
        if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U'){

            System.out.println("input letter is Vowel");
        }else if(ch>='a' && ch<='z'|| ch>='A'&& ch<='Z'){
            System.out.println("input letter is Consonant");
        }else {
            System.out.println("not an alphabet");
        }

    }
}
