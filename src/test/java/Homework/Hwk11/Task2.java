package Homework.Hwk11;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using Scanner ask user to provide any string value and index number from the array.
Using for loop update value from array.
Example:
[ Liam, Emma, Noah, Olivia, William ] Please enter String:
Lucas
Please enter index number:
3
Output:
[ Liam, Emma, Noah, Lucas, William ]
         */
        String name[]= {"Liam", "Emma", "Noah", "Olivia", "William"};
        Scanner input= new Scanner(System.in);
        System.out.println(" please enter a name: ");
        String user= input.next();
        System.out.println(" please enter a index number: ");
        int number= input.nextInt();
        for (int i = 0; i < name.length ; i++) {
            if(number==i){
                name[i]=user;

            }

        }
        System.out.println(Arrays.toString(name));
    }
}