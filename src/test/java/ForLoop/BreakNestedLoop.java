package ForLoop;

public class BreakNestedLoop {
    public static void main(String[] args) {

       int counter=1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(counter+ " ");
                counter++;
                if(j==3){
                    break;
                }
                //BREAK ----Completely stop the executing the loop and exit from the loop
                //CONTINUE---> Stop where you are and jump / go to the next iteration.

                //j=1
                // j=2
                // when j=3---> break and exit from inside loop
                // ignore j=4
                // ignore j=5
            }
            System.out.println(" ");
            if(i==4){
                break;
            }
        }
    }
}
