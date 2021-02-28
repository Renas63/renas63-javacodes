package Homework.Homework1;

public class TaskFive5Digit {
    public static void main(String[] args) {


        int num = 34568;
//        // in order to find last number of the integer you need find its remainder with 10
//        int num1 = num%10;
//        // in order to get rid of last digit in integer we should divide with 10
//        num=num/10; // 3456
//        int num2 = num%10;
//        num=num/10; // 345
//        int num3 = num%10;
//        num=num/10;
//        int num4 = num%10;
//        num=num/10;
//        int num5=num%10;
//
//
//
//        System.out.println("the reverse number will be " + num1+ num2+num3+num4+num5 );
        // result 30
        int reversenum = 0;
        for (; num != 0; ) {

            {
                reversenum = reversenum * 10;
                reversenum = reversenum + num % 10;
                num = num / 10;
            }

            System.out.println("Reverse of specified number is: " + reversenum);
        }
    }
}

