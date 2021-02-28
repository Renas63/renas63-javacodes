package TernaryAndSwitch;

public class TernaryOperator {
    public static void main(String[] args) {

        int num=10;
        int k=5;
        int r=9;
        // boolean condition? value1: value2
        num=k<=r? num++:--num;

        System.out.println(num);// result will be 10

        String test="Techtorial";
        String result=test.startsWith("Te") ? "TE" : "not found";
        System.out.println(result);


        if(test.startsWith("Te")){
            System.out.println("TE");
        }else{
            System.out.println("not found");

        }
       // int finalResult=6>4? 6:"six"; ---->>>> compile time error.
        // If you are assigning the result to the one data type
        // both side of the column must be the same data type

        System.out.println(6>4? 6:"six");

        if (6>4){
            System.out.println(6);
            //int nu=6;
        }else{
            System.out.println("six");
            // int nu="six" this wont work we cant give string value to int variable.
        }

        int x=11;
        int y=13;
        int testresult=x<y? x++ + --y : ++x- x--;
        System.out.println(x);
        System.out.println(y);
        System.out.println(testresult);


    }
}
