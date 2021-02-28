package ForLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i=0; i<3; i++){ // Outer Loop
            for(char ch='b'; ch<'d'; ch++){ // Inner Loop

                System.out.println(i+" ");
                System.out.println(ch);
            }
        }
         // when you start with Outer loop first you need to finish inner loop then
        // you need to come back to Outer loop
    }
}
