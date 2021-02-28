package RecapAndMentoring;

import java.util.Scanner;

public class TotalOfNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter starting number");
        int starting= input.nextInt();
        System.out.println("Enter ending number");
        int ending= input.nextInt();
        while(starting<=ending){
            if(starting%2==0){
                System.out.println(starting);
            }
            starting++;

        }
    }
}
