package Zoom.Abstraction2;

public class FlyingAnimal extends  Animal{

    String wingSpan;

    public FlyingAnimal(String name, String color, int age, int weight, String wingSpan) {
        super(name, color, age, weight);
        this.wingSpan = wingSpan;
    }

        void eat(){
        System.out.println("Flying Animal is eating");

    }
    void drink (){
        System.out.println("Flying Animal is drinking");
    }
    void resting(){
        System.out.println("Flying Animal is resting");
    }
    void hunting(){
        System.out.println("Flying Animal is hunting");
    }
    void fly(){
        System.out.println( name + " is flying");

    }
    static void chirping(){
        System.out.println(" is chirping");
    }
}
