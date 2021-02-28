package RecapAndMentoring;



import java.util.Scanner;

public class Hwk8T2 {
    public static void main(String[] args) {
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
        Scanner input= new Scanner(System.in);
        System.out.println(" enter an alphabet");
        char ch= input.next().charAt(0);
        if(ch=='a'||ch=='e' ||ch=='i' ||ch=='0'|| ch=='u'||ch=='A'||ch=='E' ||ch=='I'|| ch=='O'|| ch=='U'){
            System.out.println(" entered alphabet is Vowel");
        }else if( ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z'){
            System.out.println(" it is Consonant ");
        }else{
            System.out.println(" its not an alphabet ");
        }
    }
}
