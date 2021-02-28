package ForLoop;

public class NestedPrintNumber {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(num + " ");
                num++;

            }
            System.out.println();
        }


        int counter=25;
        for (int a = 1; a <=5; a++) { // REVERSE THE NUMBERS STARTING FROM 25 TO 1
            for (int b = 1; b <=5 ; b++) {
                System.out.print(counter+" ");
                counter--;
            }
            System.out.println("");
        }
    }

}
