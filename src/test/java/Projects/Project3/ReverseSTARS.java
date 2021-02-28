package Projects.Project3;

import java.util.Scanner;

public class ReverseSTARS {
    public static void main(String[] args) {
        /*
        Ask the user to enter one in number between 1 to 10 then,
         Write the program to print the string in the following format:
Example:
Input: 6
Output: 666666
        55555
        4444
        333
        22                ask for the logic of second loop????????????????
        1
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=input.nextInt();
        for(int i=number;i>=1;i--){

            for(int j=i;j>0; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
