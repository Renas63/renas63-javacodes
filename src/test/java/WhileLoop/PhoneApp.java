package WhileLoop;

public class PhoneApp {
    public static void main(String[] args) {
        //keepcalling---> if I have 50 in my account, and every talk is $5.
        // how many time I can talk

        int balance=50;
        int count=1;

        while(balance>0){
            System.out.println("Talking " + count++);
            balance-=5;
        }
        System.out.println(balance);//0
        System.out.println(count);//11
    }
}
