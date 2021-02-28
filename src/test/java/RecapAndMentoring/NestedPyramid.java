package RecapAndMentoring;

public class NestedPyramid {
    public static void main(String[] args) {
        /* 1 2 3 4
        1  1            j>i
        2  2 3          j>i
        3  4 5 6        j>i
        4  7 8 9 10     j>i
        */


        int counter=0;
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=n ; j++) {
                if(j>i){
                    System.out.print(" ");

                }else{
                    counter++;
                    System.out.print(counter + " ");
                }
            }
            System.out.println("\n");// to jump to next line
        }
    }
}
