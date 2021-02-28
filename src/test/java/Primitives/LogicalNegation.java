package Primitives;

public class LogicalNegation {
    public static void main(String[] args) {

        boolean bl=true;
        System.out.println(!bl);

        int num=123;
        // System.out.println(!num);
        // ----> it will give compile time error. we can use only for Boolean

        System.out.println('a' != 'b');//true
        System.out.println(10==6);//false
        System.out.println(11!=10);//true
        System.out.println(true==false);//false

    }
}

