package OOP.Abstraction.Abstract;

public class OnlineStudents extends Student{
   String id;

    // while we are implementing abstract method,
    // we need to follow  method overridden rules.
    public OnlineStudents(){
        super("Online",25);
        this.id="12345";
    }

    public void attend(){
        System.out.println("Online student is attending");

    }
    public void speak(){
        System.out.println("Online student is speaking");

    }
}
