package Primitives;

public class ArithmeticOperators {
    public static void main(String[]args){

        int a=5;
        int b=a+3; //b=8
        int c=b+5; // c=13
        System.out.println(c);


        int num=5*6;
        System.out.println(num);//num=30


        int carNum=c-b;
        System.out.println(carNum);


        int division=carNum/2;
        System.out.println(division);

        double result=carNum/2.0;
        // to get the result as a double one side division should be a decimal number
        System.out.println(result); // 2.5 cars

        // Remainder---> it will give u the remaining value once you divide the number
        // 65  10+10+10+10+1010+5
        // 65%10=5.   75%20=15 left over will be 15---> remainder
        // 8%10 = 8   ---> result is 8 because we can not divide 8 to 10!

        int num1=55%5;
        System.out.println(num1);
      int num2=136754%10;    // remainder number will be 4!
        System.out.println(num2);








    }
}
