package Objects;

public class BankAccount {
    String personName="techtorial";
    String bankName = "Bank of America";
    double balance;
    String accountNumber;
    String username;
    String password;
    boolean isLogined;

    /*
    Create one class is called BankAccount with given variables
personName, bankName, accountNumber, balance, username, password, isLogined
1- Create one method to display all this information
2- Create one method called deposit. This method will take one param and update the balance according to given number.
3- Create one method called withdraw and this method will take one param and update the balance according to the withdraw amount.
4- Create one method called login and will take username and password, if the username and password is correct then it will update the isLogined variable.
     */
    public void display() {

            System.out.println(password);
            System.out.println("Name" + personName);
            System.out.println("Balance" + balance);
            System.out.println("Bank" + bankName);
            System.out.println("username" + username);
            System.out.println(isLogined);

    }

    public double deposit(double depositAmount) {
        if(isLogined) {
            balance += depositAmount;
            System.out.println(balance);
            return balance;
        }else{
            System.out.println("please login first");
        }
        return balance;
    }

    public double withdraw(double withdrawAmount) {
        if(isLogined) {
        balance-= withdrawAmount;
            balance -= withdrawAmount;
            System.out.println(balance);
            return balance;
        }else{
            System.out.println("please login first");
        }
        return balance;
        }

    // if the param and instance variables have the same name  we can us "this" keyword
    // to call instance cvariables
    public void login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            isLogined = true;
        }
    }

    // this refers the class members( variables and methods are the class members)
    public void signUp(String personName, String accountNumber, double balance, String username, String password) {
        this.personName = personName;
        this.balance = balance;
        this.password = password;
        this.username= username;
        this.accountNumber = accountNumber;

    }
    public void getInstruction(){
        System.out.println("please enter 0 to Sign up");
        System.out.println("please enter 1 to Login");
        System.out.println("please enter 2 to Deposit");
        System.out.println("please enter 3 to Withdraw");
        System.out.println("pleas enter 4 to Display Account Information");
        System.out.println("please enter 5 to Display the Instructions ");
        System.out.println("please enter 6 to Close Application");
    }
}


