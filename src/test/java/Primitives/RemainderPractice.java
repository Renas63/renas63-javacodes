package Primitives;

public class RemainderPractice {
    public static void main(String[]args){

        int number= 2346;
        // find sum of all digits from number--->>> interview question
        //4+3+8+7=22
        int first=number%10;  //6

        number=number%10; // 234

        int second= number%10;  // 234%10= 4;

        number=number%10; // 23;

        int third=number%10;  // 3;

        number=number%10; //2

        int forth=number%10;  //2%10 = 2

        int sum= first+second+third+forth;
        System.out.println(sum);

    }
}
