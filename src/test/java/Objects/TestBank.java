package Objects;

public class TestBank {
    public static void main(String[] args) {


        BankAccount techtorial= new BankAccount();
        techtorial.signUp("renas", "12345", 1000, "techtorial", "tech123");
        techtorial.display();
        techtorial.deposit(100);
        techtorial.display();
        techtorial.withdraw(20);
        System.out.println(techtorial.balance);
        System.out.println(techtorial.bankName);
        techtorial.login("techtorial", "tech123");
        System.out.println(techtorial.isLogined);
        techtorial.display();


    }
}
