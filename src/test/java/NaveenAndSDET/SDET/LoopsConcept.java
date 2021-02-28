package NaveenAndSDET.SDET;

public class LoopsConcept {
    public static void main(String[] args) {
        // while loop
        // disadvantage of while loop: it will generate infinite loop if you dont give inc/dec part
        int i = 1;// initialization
        while (i <= 10) {
            System.out.println(i);
            i++;

        }
        System.out.println("******************");

        //for Loop
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
        System.out.println("*********************");

        for (int k = 10; k >= 0; k--) {
            System.out.println(k);
        }
    }
}