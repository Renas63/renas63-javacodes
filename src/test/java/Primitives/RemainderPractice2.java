package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {


        short phonePrice=687;
        int monthlyPayment=phonePrice/15;
        // if we pay in 15 months, how much are you going to pay each month?
        // we will use divide to get the result
        System.out.println(monthlyPayment);



        // how can we find out last month payment if I PAY $100  each month
        // we will need to use remainder to get result

        int lastMonth= phonePrice%100;
        // 100+100+100+100+100+100+87
        System.out.println(lastMonth);


       // new question
        int numChildren=5;
        int numMarble=93;
        int marblePerChild=18;
        int marbleLeft= numMarble%numChildren;
        System.out.println("give each child " +marblePerChild + "numMarble.");
        System.out.println(" you will have "  + marbleLeft+ " marbles left over.");


        // Another solution
        int totalMarble=93;
        int kids=5;
        int eachReceived=18;
        int sum1=kids*eachReceived;
        System.out.println(totalMarble-sum1);
        //

        int num1= 100;
        int num2=3;
        int result=num1%num2;
        System.out.println(result);
        //
        int numA=103;
        int numB=5;
        int sum=numA%num2;
        System.out.println(sum);


    }
}
