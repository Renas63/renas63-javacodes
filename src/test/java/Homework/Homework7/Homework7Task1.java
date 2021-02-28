package Homework.Homework7;

import java.util.Scanner;


public class Homework7Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        Using scanner ask user to enter to String value and concatenate them together then print the result.
         If both String length is not same then omit chars from the longer string so it is the same length as the shorter string.
          After making both string same length then concatenate it.
        EXAMPLE-1: String 1: "Cell" String 2: "Phone" Output: "CellPhon"
        EXAMPLE-2: String 1: "Cable" String 2: "Mic" Output: "CabMic"
         */
        System.out.println("please enter a string value");
        String word1= input.nextLine();
        System.out.println("please enter a second string value");
        String word2=input.nextLine();
        int word1Length=word1.length();
          int word2Length=word2.length();

        if(word1Length==word2Length){
            System.out.println(word1.concat(word2));
        }else if(word2Length>word1Length){
            String newWord=word1.concat(word2.substring(0,word1Length));

            System.out.println(newWord);
        }else{
            String newWord=word1.substring((0),word2Length).concat(word2);
            System.out.println(newWord);
        }

    }

    }

