package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // Random class --> it will create a random class
        Random random = new Random();

        int randomNumber = random.nextInt(20);// this random class will generate random number between 0 to 100
        Scanner input = new Scanner(System.in);

        int number;
        int count=0;
        //55--->10
        do {
            System.out.println(" please guess the number between 0-20");
            number = input.nextInt();
            if (number < randomNumber) {
                System.out.println("the number is less than random number");
            } else if (number>randomNumber) {
                System.out.println(" The number is bigger than random number");
            }
            count++;
        }while(number!=randomNumber&& count<=5);
        System.out.println(" The random number is " + randomNumber);
        System.out.println("The number of count" + count);
    }
}
