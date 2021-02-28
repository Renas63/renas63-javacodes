package WhileLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        int sum=0;// to find out the summary of digits!!!!!!!!!
        int multiple=1;// to find the multiplication of digit!!!
        //675

        while(number>0){
           int digit=number%10;
           sum+=digit;
           multiple*=digit;
            System.out.println(digit);
            number=number/10;
        }
        System.out.println(sum);// INTERVIEW QUESTION
    }
}
