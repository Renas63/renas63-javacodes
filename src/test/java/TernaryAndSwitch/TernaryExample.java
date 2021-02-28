package TernaryAndSwitch;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c=(a>b)?a:b;// ? means true or false. if its true --> a, if not ---->false
        if (c%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
