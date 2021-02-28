package ForLoop;

public class YermekHwk1 {
    public static void main(String[] args) {
        // at the eginning previousNumber=1
        // i=1; previousNumber=11
        // i=2; previousNumber=11*10+1==111
        // i=3; previousNumber=111*10+1==1111
        int number=3;
        int previousNumber=1;
        int sum=0;

        for(int i=1; i<=number; i++){

            sum=sum+previousNumber;

            System.out.print(previousNumber);
            if(i<number){
                System.out.print(" + ");
            }

            previousNumber=previousNumber *10 +1;

        }
        System.out.println("\nthe sum is " + sum);

        String text="";
        for(int j=1;j<number;j++){
            text=text+previousNumber;
            System.out.println(text);
            if(j<number){
                System.out.println(" + ");
                // to convert String to int use Integer.parseInt(put some string here)
                sum=sum+Integer.parseInt(text);
            }
            System.out.println("\nSum is "+sum);
        }
    }
}
