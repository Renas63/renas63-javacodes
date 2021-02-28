package Homework.Homework9;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Using a scanner ask the user to input username and password.
         Create the two variables for the expected username and password.
         if user input is not matching with the expected username and password ask the user again until they are correct.
          (Optional: if you want to make it a little complicated.
          You can allow the user only three times to enter the wrong username or password.
        if it is more than 3 times you can print “your account is on hold now. Try after 5 min”)
         */
        Scanner input = new Scanner(System.in);
        String actualUsername = "Renas Aktas";
        String actualPassword = "123";
        String userName;
        String userPassword;

        int count = 3;

        System.out.println("  Welcome !");
        do {
            System.out.println("Please enter your user name");
            userName = input.nextLine();
            System.out.println("Please enter your password");
            userPassword = input.nextLine();

            count--;
        } while ((!actualUsername.equals(userName) || !actualPassword.equals(userPassword)) && count != 0);

        if (count == 0) {
            System.out.println("Your account is on hold now! Try after 5 Minutes");
        } else {
            System.out.println(" Welcome " + userName);
        }
    }
}





