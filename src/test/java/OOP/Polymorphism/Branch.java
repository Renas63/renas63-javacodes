package OOP.Polymorphism;

public class Branch extends ATM{
    public void loan(){
        System.out.println(" you can get a loan uo to 50k");
    }
    public void hire(){
        System.out.println("we can hire  a Bank Teller");
    }
    public void withdraw(){
        System.out.println("You can withdraw money up to 15K");
    }
    public void deposit(){
        System.out.println("You can deposit up to 100K");
    }

}
