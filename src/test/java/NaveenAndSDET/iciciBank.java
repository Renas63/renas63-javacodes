package NaveenAndSDET;

public class iciciBank implements USBankInterface, RBI {
  // USBank Interface
    @Override
    public void credit() {
        System.out.println("icici credit");
    }

    @Override
    public void debit() {
        System.out.println("icici debit");
    }

    @Override
    public void transferMoney() {
        System.out.println("icici transfer money");
    }
    // RBI Interface
    @Override
    public void educationLoan() {
        System.out.println("icici-- education loan");
    }

    @Override
    public void homeLoan() {
        System.out.println("icici -- home loan");
    }

    @Override
    public void carLoan() {
        System.out.println("icici car loan");
    }

    // icici bank class method :
    public void mutualFund(){
        System.out.println("icici mutual fund");
    }
    public void insurance(){
        System.out.println("icici insurance");
    }
}

