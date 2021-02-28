package Homework.Homework2;

public class Homework2TaskResult {
    public static void main(String[] args) {
    /*
    nt result=4*7+3-2*9%5/3-2;
     int result1= 12-3/3+4-2*2%4+12%3/3;
    Please write the pseudoCode with explanation which operation will be
    executed first the result of "result" and "resu
     */
        int result=4*7+3-2*9%5/3-2;
        int A=28+3-1-2; // multiplication and remainder and divide will be executed first
        int B=31-1-2; // Since they all are the same level, we will do execution from left to right.
        int C= 31-3;
        int Sum=28;

        System.out.println(result);

        int result1= 12-3/3+4-2*2%4+12%3/3;


        int D=12-0+4-0+0; // multiplication and remainder and divide will be executed first
        int E=12+4-0; //since they all are the same level. it will execute from left to right.
        int sum1=16;
        System.out.println(sum1);


    }
}
