package NaveenAndSDET.SDET;

public class Swapping {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("value of a is before swapping: " + a);
        System.out.println("value of b is before swapping: " + b);

        int c;
        c=a;// c is 10
        a=b;// a is 20
        b=c;// b is 10

        System.out.println("value of a is after swapping: " + a);//20
        System.out.println("value of b is after swapping: " + b);//10

    }
}
