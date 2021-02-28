package Projects.Project3;

import java.util.Scanner;

public class NumberStars {
    public static void main(String[] args) {
        /*
    Ask the user to enter one in number between 1 to 10 then,
    Write the program to print the string in the following format:
    Example:
    Input: 5
    Output: 1
            22
            333
            4444
            55555
         */
        // you need a second (inner) loop that repeats num's value time
        // how can i create for loop that iterates 5 times

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=input.nextInt();

        for(int num=1;num<=number; num++){
    // when you put the for loop here it should repeat num's value times

            //System.out.println(num);
            for(int i=num; i >0; i--){
                System.out.print(num);
            }
            System.out.println();
        }



    }
}
