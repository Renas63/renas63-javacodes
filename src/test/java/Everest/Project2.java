package Everest;

import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available music types are Classical, Pop, and Country");
        String type = input.next();
        if (type.equalsIgnoreCase("Classical")) {
            System.out.println("What song you want to listen?  " +
                    "\n Four seasons. Fur Elise. Finlandia.Vocalise. The planets");
            String songName = scanner.nextLine();
            if (songName.equalsIgnoreCase("Four seasons") || songName.equalsIgnoreCase("Fur Elise")
                    || songName.equalsIgnoreCase("Finlandia") || songName.equalsIgnoreCase("Vocalise") ||
                    songName.equalsIgnoreCase("The planets")) {
                System.out.println("Please enter 2$ for this song ");
                int money = input.nextInt();
                if (money == 2) {
                    System.out.println(songName + " is Playing. Enjoy with the music");
                } else if (money < 2) {
                    System.out.println("Entered price is not enough");
                } else {
                    System.out.println("You have entered " + (money - 2) + " dollar more. Please wait for change." + songName + " IS PLAYING ENJOY THIS MUSIC ");
                }
            } else {
                System.out.println("NAME OF MUSIC IS NOT AVAILABLE");
            }
        } else if (type.equalsIgnoreCase("Pop")) {
            System.out.println("What song you want to listen? Bad guy.Talk. Please me. 7 ring. Without me. ");

            String songName = scanner.nextLine();

            if (songName.equalsIgnoreCase("Bad guy") || songName.equalsIgnoreCase("Talk")
                    || songName.equalsIgnoreCase("Please me") || songName.equalsIgnoreCase("7 ring") ||
                    songName.equalsIgnoreCase("Without me")) {
                System.out.println("Please enter 4$ for this song ");
                int money = input.nextInt();
                if (money == 4) {
                    System.out.println(songName + " is Playing. Enjoy with the music");
                } else if (money < 4) {
                    System.out.println("Entered price is not enough");
                } else {

                    System.out.println("You have entered " + (money - 4) + " dollar more. Please wait for change." + songName + " IS PLAYING ENJOY THIS MUSIC ");
                }
            } else {
                System.out.println("NAME OF MUSIC IS NOT AVAILABLE");
            }
        } else if (type.equalsIgnoreCase("Country")) {
            System.out.println("What song you want to listen? Meant to Be.Heaven. Simple. One number away. Get Along");
            String songName = scanner.nextLine();
            if (songName.equalsIgnoreCase("Meant to Be") || songName.equalsIgnoreCase("Heaven")
                    || songName.equalsIgnoreCase("Simple") || songName.equalsIgnoreCase("One number away") ||
                    songName.equalsIgnoreCase("Get Along")) {
                System.out.println("Please enter 3$ for this song ");
                int money = input.nextInt();
                if (money == 3) {
                    System.out.println(songName + " is Playing. Enjoy with the music");
                } else if (money < 3) {
                    System.out.println("Entered price is not enough");
                } else {

                    System.out.println("You have entered " + (money - 3) + " dollar more. Please wait for change." + songName + " IS PLAYING ENJOY THIS MUSIC ");
                }
            } else {
                System.out.println("NAME OF MUSIC IS NOT AVAILABLE");
            }
        } else {
            System.out.println("Type of music is not available");
        }
    }
}


