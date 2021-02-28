package Homework.Homework5;

import java.util.Scanner;

public class Homework5Task1 {
    public static void main(String[] args) {
    /*
    Using Scanner ask user to enter one of the song name
    Print first char of given song name
    Print last char of given song name
    Print length of given song name
    Print index number of "k" in this song name
    Print char from index number of 3
    Print song name upper case
    Print song name lower case
     */
        // paulette---> song name
        Scanner input= new Scanner(System.in);
        System.out.println("what is your song name? ");
        String songName= input.nextLine();
        System.out.println(songName.charAt(0));
        int lenght= songName.length();
        System.out.println(songName.charAt(lenght-1));
        System.out.println(songName.length());
        System.out.println(songName.contains("k"));
        System.out.println(songName.charAt(3));
        System.out.println(songName.toUpperCase());
        songName=songName.toUpperCase();
        System.out.println(songName.toLowerCase());

    }
}
