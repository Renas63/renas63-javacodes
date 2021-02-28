package Zoom;

import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /*
        Task: kullanıcıya array deki element sayısını soralım, scanner kullanarak.
         Sonra scanner ile array e sayılar girelim (for loop).
        Sonra da tek sayı olanları ekrana yazdıralım
         */
        System.out.println(" please enter the size of array");
        int a= input.nextInt();

        int numbers[]=new int[a];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" Enter " + i + ".element  of the array");
            numbers[i] = input.nextInt();

        }
        System.out.println(" the odd numbers from given array are : ");
            for (int i = 0; i < numbers.length ; i++) {
                if(numbers[i]%2!=0){
                    System.out.println(numbers[i]+ " ");

                }

            }


    }
}
