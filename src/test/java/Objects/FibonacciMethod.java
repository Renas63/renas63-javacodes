package Objects;

public class FibonacciMethod {
    /*
    TASK: Create one method will take the parameter as the number of fibonacci num then it will print all the
fibonacci numbers matching with given parameter.
     */
    public void fMethod(int num ){
        int a= 0;
        int b=1;
        if(num==1){
            System.out.println(a);
        }else if (num==2){
            System.out.println(b);
        }else if (num>2){
            System.out.println(a);
            System.out.println(b);
            for (int i = 2; i <num ; i++) {
                int sum=a+b;
                System.out.println(sum);
                a=b;
                b=sum;
            }
        }
    }
    public static void main(String[] args) {
        FibonacciMethod test= new FibonacciMethod();
        test.fMethod(5);
    }
}
