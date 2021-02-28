package Homework.Homework3;

public class Homework3Task2 {
    public static void main(String[] args) {

        /*
        Create the application to print true if there is enough space for NBA game and
        print false if there is no ticket for the game.
        To be able to calculate the result you need to store max capacity of the stadium and
         total number of ticket which is sold.
         If the there is no ticket left print false, otherwise print false.
         */

        int totalSpace= 30000;
        int soldTicket= 28450;
        boolean leftTicket=(totalSpace-soldTicket) >0;

        System.out.println("Can I attend the NBA game ?" + leftTicket);

    }
}
