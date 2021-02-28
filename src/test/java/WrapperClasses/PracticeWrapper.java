package WrapperClasses;

public class PracticeWrapper {
    public static void main(String[] args) {

        Long num1=10l;
        Long num2=10l;
        Long num3= 10l;

        System.out.println(num1==num2); // false
        System.out.println(num1.equals(num2)); // true

        System.out.println(num1== num3);// return true

        System.out.println(num1.equals(num3));// true

    }
}
