package ForLoop;

public class PrintMonths {
    public static void main(String[] args) {
        // Task starting from 2015 to 2020  print years and months

        for(int year=2015; year<=2020; year++){
            System.out.print(year+ " ");
            for(int month=1; month<=12;month++){

                System.out.print(" "+month);
            }
            System.out.println();// we use that sout to go to go new line
        }

    }
}
