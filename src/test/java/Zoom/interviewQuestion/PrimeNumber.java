package Zoom.interviewQuestion;

public class PrimeNumber {
    public static void primeNumber(){
        int num =29;
        boolean flag= false;
        for(int i= 2; i<num/2; i++){
           if(num%i==0){
               flag=true;
               break;
           }
        }
        if(!flag){
            System.out.println(num + "prime number");
        }else
            System.out.println(num + " is not a prime number");
    }

    public static void main(String[] args) {
        primeNumber();
    }
}
