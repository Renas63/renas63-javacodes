package RecapAndMentoring;

import java.util.Scanner;

public class Hwk9T2 {
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
        int starting = input.nextInt();
        System.out.println(" Enter a ending number");
        int ending = input.nextInt();
        int counter=0;
        for (int i = starting; i <=ending ; i++) {

            if((i%3==0) && (i%5==0)){
                counter++;
                System.out.println(i);
            }
        }

        System.out.println("Total number that divisible by 3 and 5 is "+counter);
    }
}