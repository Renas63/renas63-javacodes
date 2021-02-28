package WhileLoop;

public class PrintNumbers {
    public static void main(String[] args) {

        // Task print the number between 10 to 20

        int num = 10;
        while (num <= 20) {
            System.out.println(num);
            num++;

        }
        // print the number 30 t0 15
        int number = 30;
        while (number >= 15) {
            System.out.println(number);// to print even number, number-=2
            number--;
        }
        System.out.println(number);// it will be 14
    }
}