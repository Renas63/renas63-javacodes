package ForLoop;

public class ThreeNestedLoop {
    public static void main(String[] args) {
        /*
        i = 1; j = 1; k = 1 2 3 4 5 ==> sum = 5
               j = 2; k = 1 2 3 4 5 ==> sum = 5
               j = 3; k = 1 2 3 4 5 ==> sum = 5
               j = 4; k = 1 2 3 4 5 ==> sum = 5
               j = 5; k = 1 2 3 4 5 ==> sum = 5
        i = 2; j = 1; k = 1 2 3 4 5 ==> sum = 5
               j = 3; k = 1 2 3 4 5 ==> sum = 5
               j = 4; k = 1 2 3 4 5 ==> sum = 5
               j = 5; k = 1 2 3 4 5 ==> sum = 5
        i = 3; j = 1; k = 1 2 3 4 5 ==> sum = 5
               j = 2; k = 1 2 3 4 5 ==> sum = 5
               j = 3; k = 1 2 3 4 5 ==> sum = 5
               j = 4; k = 1 2 3 4 5 ==> sum = 5
               j = 5; k = 1 2 3 4 5 ==> sum = 5
        i = 4; j = 1; k = 1 2 3 4 5 ==> sum = 5
               j = 2; k = 1 2 3 4 5 ==> sum = 5
               j = 3; k = 1 2 3 4 5 ==> sum = 5
               j = 4; k = 1 2 3 4 5 ==> sum = 5
               j = 5; k = 1 2 3 4 5 ==> sum = 5
        i = 5; j = 1; k = 1 2 3 4 5 ==> sum = 5
               j = 2; k = 1 2 3 4 5 ==> sum = 5
               j = 3; k = 1 2 3 4 5 ==> sum = 5
               j = 4; k = 1 2 3 4 5 ==> sum = 5
               j = 5; k = 1 2 3 4 5 ==> sum = 5
               i * j * k = 125
               5 * 5 * 5 = 125
         */

        int sum = 0;
        for (int i = 1; i <= 5; i++) {// i = 1 2 3 4 5
            for (int j = 1; j <= 5; j++) {// j = 1 2 3 4 5
                for (int k = 1; k <= 5; k++) {// k = 1 2 3 4 5
                    sum = sum + 1;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
