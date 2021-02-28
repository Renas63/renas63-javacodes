package Primitives;

public class MultiplyNumber {
    public static void main(String[]args){

        // if you want to get the digits from your number, you need to remainder with 10 and divide with 10
        //   TASK find multiplication of all the digits from given number
        int number=57884;
        int first=number%10;  //4

        number=number/10; //

        int second= number%10;  // 8;

        number=number/10;

        int third=number%10;  // 8;

        number=number/10;

        int forth=number%10;  //57%10 = 7

        number=number/10; //

        int fifth=number%10; // 5

        int sum= first+second+third+forth+fifth ;
        System.out.println(first*second*third*forth*fifth);
    }
}
