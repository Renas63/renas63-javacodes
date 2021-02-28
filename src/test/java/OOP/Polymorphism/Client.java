package OOP.Polymorphism;

public class Client {
    public static void main(String[] args) {

        Bank bank= new Bank();
        bank.deposit();
        bank.loan();
        bank.openBranch();


        Branch branch= new Bank();
        branch.hire();
        branch.hire();// since the hire is overridden in Bank class ,
                        // it will be calling from there

        //branch.openBranch();// --> since openBranch is only available
                               // under the bank, I can not call using branch class

        branch.deposit();
        branch.displayBalance();// its coming from ATM Class. branch extend ATM CLASS  because
        // this is UpCASTING . we don't need to write explicitly
        // java will cast the value implicitly



        ATM atm= new Bank();
        atm.displayBalance();
        ((Branch)atm).hire();//-->we can down casting references explicitly
        // we must cast down the reference explicitly to get hire method from child class.


        ATM atm1= new ATM();
       // Branch branch1= (Bank)atm1;// casting atm to Bank. ATM is Parent.
        // Once we want to cast directly from ATM to Bank
        // it will be ClassCastException since  it has no direct relation with Bank

       // branch1.loan();  //ClassCastException


//        Bank bank1= (Bank) new Branch();
//        bank1.openBranch();  ->>> ClassCastException
//
        Bank bank1= new Bank();
        Branch branch2=bank1;

        ATM atm2= (Bank)new Branch(); // Casting 'new Branch()' to 'Bank' is redundant
        atm2.displayBalance();
        ((Branch)atm2).loan();


        // NOTE: left side has to parent and rigth side has to be child !!!!
        // we must cast left side , not rigth side. if we cast right side
        // it will give a ClassCastException


        //Broker broker= new Bank();
        // between sibling class there is no polymorphic relationship.
    }
}
