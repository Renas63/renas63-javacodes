package OOP.Abstraction.Abstract.Interface.Fly;

public interface Flyable extends  Noise{

    int WINGSNUMBER=2;
    int TAILSNUMBER=1;

    public abstract  void fly();
    //--> IN ABSTRACT METHOD WE CAN NOT CREATE A
    // BODY TYPE BC ITS ALREADY PUBLIC AND ABSTRACT!!!! IN INTERFACE
    // ALL METHODS ARE BY DEFAULT PUBLIC AND ABSTRACT
    //note: We can create the bady inside the interface only
    // for default methods and static methods

    default void run(){
        System.out.println("it is running");

    }
}
