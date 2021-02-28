package ForLoop;

public class BreakAndContinue {
    public static void main(String[] args) {
        int k=0;
        for (int i = 1; i <=100 ; i++) {

            if(i==10) { // we can use curly braces or not. it wont affect ??????????????
                break;
            }
            k++;
        }
        System.out.println("k = "+k);
        // 1- iteration i=1, k=0; ===> i=1; k=1 (on line 9)
        //...
        // 9- iteration i=9; k=8;==> i=9; k=9;
        // 10 iteration 1=10; k=9;==> 1=10; k=9


        for (int i = 1; i <=5; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}


