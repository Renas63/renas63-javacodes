package Homework.Homework9;

import java.util.Scanner;

public class  Task1 {
    /*
    Using Scanner ask user to provide any int number and print multiplication table of given number
Input number: 5 Output : 5*1=5
5 * 2 = 10
5 * 3 = 15 ...
...
5*10 = 50
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter a number!");
        int number= input.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(number +"*" + i + "="+(number*i));
        }
    }
}
