package WhileLoop;


import java.util.Scanner;

public class SumOfDigits2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter a int value");
        int number= input.nextInt();
        int sum=0;
        int digit;

        while(number>0) {
            digit = number % 10;

            if (digit > 5) {
                sum += digit;
            }
            number = number / 10;//if condition un disinda olmali ki false olunca bunu bassin
            // cunku if cond sinirli 5 ten kucuk olmasi
        }
        System.out.println(sum);

    }
}
