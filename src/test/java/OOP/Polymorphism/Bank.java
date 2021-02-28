package OOP.Polymorphism;

public class Bank extends Branch{
    String companyName= "Bank of America";

    public void loan(){
        System.out.println("You have up to 1M limit");

    }
    public void hire(){
        System.out.println("We can hire a Manager");

    }
    public void invest(){
        System.out.println("you can invest up to 1B");
    }
    public void openBranch(){
        System.out.println("We can open a branch");
    }
}
