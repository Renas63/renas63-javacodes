package Homework.Homework2;

public class Homework2Task5 {
    public static void main(String[] args) {
/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
 */

       int num=8;
       int num1= 1; //8*1;//8
       int num2=2;  //8*2;//16
       int num3= 3; // 8*3;//24
       int num4= 4;  //8*4;//32
       int num5 = 5; //8*5;//40
       int num6= 6; // 8*6;//48
       int num7= 7; //8*7;//56
       int num8=  8;// 8*8;//64
       int num9= 9; //8*9;//72
       int num10=10; //8*10;//80
//        System.out.println( num+ "*" + num1 + "=" + (num*num1));
//        System.out.println(num+ "*" + num2 + "=" + (num*num2));
//        System.out.println(num+"*" + num3 + "=" + (num*num3));
//        System.out.println(num+"*" + num4 + "=" + (num*num4));
//        System.out.println(num+"*" + num5 + "=" + (num*num5));
//        System.out.println(num+"*" + num6 + "=" + (num*num6));
//        System.out.println(num+"*" + num7+ "=" + (num*num7));
//        System.out.println(num+"*" + num8 + "=" + (num*num8));
//        System.out.println(num+"*" + num9 + "=" + (num*num9));
//        System.out.println(num+"*" + num10 + "=" + (num*num10));
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + " = " + (num * i));
        }


    }
}
