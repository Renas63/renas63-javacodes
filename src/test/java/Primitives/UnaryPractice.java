package Primitives;

public class UnaryPractice {
    public static void main(String[] args) {

        int flowers=8;
        int total=flowers++ + ++flowers; // 8+10

        System.out.println(total);//18

        System.out.println(flowers);//10


        int burgers=3;

        int totalPayment=burgers-- +5 - --burgers+burgers/2;
        //3+5-1+0
        // burgers=1

        System.out.println(burgers);//1

        System.out.println(totalPayment); //7

        int k = 8;
        int result=5 * k++ - k-- / k++ % --k;

        // 5*8 -9 / 8 % 8 =40-1==39
        // k=8
        System.out.println(k);

        System.out.println(result);


        int n=5;
        int r=8;
        int results= n++ % 5 * ++r / n-- + ++n / r--;
        //r= 5 %5 * 9
        //n=
        // result= 5 % 5 * 9 / 6+ 6 / 9; 0+0 ==0

        System.out.println(n);//6

        System.out.println(r); // 8
        System.out.println(results);// 0

    }
}
