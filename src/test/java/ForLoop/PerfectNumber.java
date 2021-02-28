package ForLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        //INTERVIEW QUESTION

        int number=20;
        int sum=1;

        for(int num=2; num<=number/2;num++){ //number/2 condition will make the code to run until half of the number!
            // once the running code comes to 10.times,
            // it will not run anymore because there is no more divident of the 20


            if(number%num==0){
                sum+=num;
            }
        }
        System.out.println(sum);// sum will be 22
        if(sum==number){
            System.out.println("perfect number");
        }else{
            System.out.println(" its not a perfect number. ");
        }
    }
}
