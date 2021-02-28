package RecapAndMentoring;


public class FindSumOfNums {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        int sum = 0;
        int multiplication = 1;

        while (a <= b) {
            if (a % 2 == 1) {
                sum += a;
                System.out.print(a + ",");
            }
            a++;

        }
        System.out.print("Sum of the odd  numbers: " + sum);

    }
}

