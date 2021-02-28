package NaveenAndSDET;

public class HSBCBank extends BrazilBank implements USBankInterface {// we are achiving multiple inheritance
    // is a relationship
    // if a class implementing any Interface, then its mandatory to
    // define / override all the methods of Interface.

    // overriding from USBank

    public void credit() {
        System.out.println("hsbc---credit");
    }


    @Override
    public void debit() {
        System.out.println("hsbc--- debit");
    }

    @Override
    public void transferMoney() {
        System.out.println("hsbc--TransferMoney");
    }
        // seperate methods of HSBCBank class
    public void educationLoan() {
        System.out.println("hsbc--edu loan");
    }

    public void carLoan() {
        System.out.println("hsbc--Car loan");

    }

    // Brazil Bank method : overriding from Brazil Bank
    public void mutualFund() {
        System.out.println("hsbc-- mutual Fund");
    }
}
