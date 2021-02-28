package Homework.Homework6;

import java.util.Scanner;

public class Homework6Task3 {
    public static void main(String[] args) {
        /*
        Using a scanner enter three different ingredients for the product on the same line.
         Then ask the user to enter any int number.
          Change the first letter of the ingredients starting from the entered number.
          (Ingredients should start with different letters. Please read the example carefully )
          Example 1: Please enter three ingredients with spaces: Milk Peanuts Butter
            Please enter the int number:5
            The output is:  5ilk 6eanuts 7utter
        Example 2:
        Please enter three ingredients with spaces: Sugar Cocoa Oil
        Please enter the int number: 3
        The output is: 3ugar 4ocoa 5il
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three different ingredients for the product on the same line");
        String usersEntry = scanner.nextLine();
        // "peach apple pear"
        System.out.println("Provide number");
        int num = scanner.nextInt();
        int firstSpaceIndex = usersEntry.indexOf(" ");
        String firstWord =usersEntry.substring(0,firstSpaceIndex);
        String lastTwoWords = usersEntry.substring(firstSpaceIndex+1);
        //"apple pear"
        int secondSpaceIndex = lastTwoWords.indexOf(" ");
        String secondWord = lastTwoWords.substring(0,secondSpaceIndex);
        String thirdWord = lastTwoWords.substring(secondSpaceIndex+1);
        String firstWordChanged =num++ + firstWord.substring(1);
        String secondWordChanged = num++ + secondWord.substring(1);
        String thirdWordChanged = num + thirdWord.substring(1);
        System.out.println(firstWordChanged+" "+secondWordChanged+" "+thirdWordChanged);




    }
}
