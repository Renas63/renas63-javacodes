package NaveenAndSDET;

public class TestBankAbstract {
    public static void main(String[] args) {
        iciciBank ic= new iciciBank();
        ic.educationLoan();
        ic.carLoan();
        ic.homeLoan();

        ic.credit();
        ic.debit();
        ic.transferMoney();

        ic.mutualFund();
        ic.insurance();

        System.out.println(USBankInterface.min_bal);

       USBankInterface us=new  iciciBank();

       us.transferMoney();
       us.debit();
       us.credit();

    }
}
