package Homework.Homework9;

import java.util.Scanner;

public class Task2 {
    /*
    Using a scanner ask the user to provide starting and ending numbers.
     Print the numbers divisible by 3 and 5 between given number AND
     print count of those numbers which is divisible by 3 and 5.
EXAMPLE:
First number: 5
Second number: 65
Output:
15
30
45
60
Total number that divisible by 3 and 5 is 4.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a starting number");
        int starting= input.nextInt();
        System.out.println(" Enter a ending number");
        int ending = input.nextInt();
        int sum=0;
        int count=0;
        while(starting<=ending){

            if(starting%3==0 && starting%5==0){
                count++;
                System.out.println(starting);
            }
            starting++;
        }
        System.out.println(count);


    }
}