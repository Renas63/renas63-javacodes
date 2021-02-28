package Homework.HWK12;

import java.util.Scanner;

public class Task4Palindrome {
    /*
    Create the method will return true if the given number is a palindrome number.
Example: Data: 12321 Output:
true
Example: Data: 1234 Output: False
     */
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        System.out.println("Please enter a number");
//        int number= input.nextInt();
//        String str= String.valueOf(number);
//        String temp="";
//
//        for (int i=str.length()-1; i>=0; i--){
//            temp+=str.charAt(i);
//        }
//        if(str.equals(temp)){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

    public  static boolean palindrome(int num){
    String reverse="";
    boolean bl= false;
    String newNum="";
    newNum+=num;
    while(num>0){
        reverse+=num%10;
        num/=10;
     }
    if(reverse.equals(newNum)){
        return true;
    }else{
        return false;
     }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= input.nextInt();
        System.out.println("Palindrome " +palindrome(number));
    }
}
//    int remainder; ANOTHER WAY FOR SOLUTION
//    int sum=0;
//    int temp;
//    int number=45554;
//        temp=number;
//        while(number>0){
//        remainder=number%10;
//        sum=(sum*10)+remainder;
//        number=number/10;
//        }
//        if(temp==sum)
//        return true;
//        else
//        return false;
