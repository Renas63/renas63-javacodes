package Zoom;

public class StarTask {
    public static void main(String[] args) {

        int i, j;
        int n = 5;
        for (int k = 0; k < n; k++) {

            for (int m = 0; m <= k; m++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//        for (int i = 0; i <=7 ; i++) {
//            if (i == 0 || i == 7) {
//                for (int j = 0; j <=i; j++) {
//                    System.out.print("* ");
//                }
//
//            }else{
//                for (int k= 0; k <=i; k++) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }