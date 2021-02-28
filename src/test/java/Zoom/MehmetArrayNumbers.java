package Zoom;

import java.util.Scanner;

public class MehmetArrayNumbers {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int a=input.nextInt(); // 5
            int [] numbers=new int[a]; // int [] numbers={0, 1, 2, 3, 4}
            int sumOfOdd=0, sumOfEven=0, oddCount=0, evenCount=0;
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter "+i+". element of the array:");
                numbers[i]=input.nextInt();
                if(numbers[i]%2==1){
                    System.out.println(numbers[i]+" is an odd number!");
                    sumOfOdd+=numbers[i];
                    oddCount++;
                }else {
                    System.out.println(numbers[i] + " is an even number!");
                    sumOfEven+=numbers[i];
                    evenCount++;
                }
            }
            System.out.println("Sum of Odd numbers are : "+sumOfOdd);
            System.out.println("Sum of Even numbers are : "+sumOfEven);
            System.out.println("Number of Odd numbers is : "+oddCount);
            System.out.println("Number of Even numbers is : "+evenCount);
            // System.out.print("The odd numbers from the given array are : ");
            // numbers --> {34, 23, 46, 66, 31}
        /*
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==1){
                System.out.print(numbers[i]+" ");
            }
        }
         */
        }
    }
