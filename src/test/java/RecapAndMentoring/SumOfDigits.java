package RecapAndMentoring;

public class SumOfDigits {
    public static void main(String[] args) {
        // print number between 12 to 46
        // sum of numbers
        int num=12;
        int sum=0;
        while(num<=20){
            if(num%2 ==1){
                sum+=num;
                System.out.println(num);
            }
            num++;
            // it will print numbers between 12-20
        }
        System.out.println("Sum of the numbers: " +sum);
    }
}
