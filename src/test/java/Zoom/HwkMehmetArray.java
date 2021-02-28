package Zoom;

import java.util.Scanner;

public class HwkMehmetArray {
    /*
    Using scanner ask user to enter the size if an int array.
    using scanner ask user to enter the elements.
    if each element is odd then assign it inside the array.
     if not dont do any assignments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter the size int array");
        int size= input.nextInt();
        int number[]=new int[size];
        int oddCount=0,sumOfOdd=0, sumOfEven=0, evenCount=0;

        for (int i = 0; i< number.length ; i++) {
            System.out.println("enter " +i+ ".element: ");
            number[i]=input.nextInt();

            if(number[i]%2 !=0){
                sumOfOdd+=number[i];
                oddCount++;
                System.out.println(number[i] + "is an odd number");

            }else {
                sumOfEven+=number[i];
                evenCount++;
                System.out.println(number[i] + "is even number ");
            }
        }

        System.out.println(" The number of odd number is : " +oddCount);
        System.out.println(" The total of even number is : " +sumOfEven);
        System.out.println(" The total of odd number is : " +sumOfOdd);
        System.out.println(" The number of even number is : " +evenCount);
    }
}
