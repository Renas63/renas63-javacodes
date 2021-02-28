package Zoom.interviewQuestion;

public class sumOfDigit {
    public static void sumDigit(){
        int number= 4577;
        int originalNum=number;
        int sum=0;
        while (number>0){
            sum=sum+(number%10);
            number=number/10;
        }
        System.out.println("The sum of " + originalNum+ " is equal to " +sum);
    }

    public static void main(String[] args) {
        sumDigit();
    }
}
