package NaveenAndSDET;

public class TestBank {
    public static void main(String[] args) {

        System.out.println(USBankInterface.min_bal);

        HSBCBank hs= new HSBCBank();
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.carLoan();
        hs.educationLoan();

        // dynamic polymorphism: child class can be referred by parent interface reference vars

         USBankInterface b=new HSBCBank();
         b.credit();
         b.debit();
         b.transferMoney();// only we can call overridden methods in here

    }
}
