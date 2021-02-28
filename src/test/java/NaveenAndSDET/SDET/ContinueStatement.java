package NaveenAndSDET.SDET;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            if (a == 5) {
                continue;

            }
            System.out.println(a);// it will skip 5 and print the rest!
        }
    }
}