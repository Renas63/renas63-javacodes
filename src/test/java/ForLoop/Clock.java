package ForLoop;

public class Clock {
    public static void main(String[] args) {

        for(int h = 1; h<=12; h++){
            System.out.println(h + " hour");
            for(int m=1; m<=60; m++){
                System.out.println(m+ " minute ");
                for( int s=1;s<=60;s++){
                    System.out.print(s+" ");
                }
                System.out.println("sec");

            }
            System.out.println();
        }
    }
}
