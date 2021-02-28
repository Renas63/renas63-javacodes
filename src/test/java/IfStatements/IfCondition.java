package IfStatements;

public class IfCondition {
    public static void main(String[] args) {


        int appleNumber=10;
        int orangeNumber=10;
        // if apple number are equals to orange number print true
        // Apple number is equals to orange number
        if(appleNumber==orangeNumber){

            System.out.println("Apple number is equals to orange number");
        }
            if (appleNumber!=orangeNumber){
                System.out.println("Aplle number is not equals to orange number");



            }

          int k=2;
        if(k>3){
            k++; // it will not execute that part because condition is false
            k++;
        }
        System.out.println(k);


    }
}
