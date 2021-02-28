package NaveenAndSDET;

public class TestCAR { // "has a relationship"
    public static void main(String[] args) {
       // Static polymorphism --- compile time polymorphism
        BMWMethodOverriding b= new BMWMethodOverriding();
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();// only BMW can access theftSafety information!
        b.engine();

        System.out.println("*******************");
        Car c= new Car();
        c.start();
        c.stop();
        c.refuel();

        System.out.println("******************");

        // Top casting
        Car c1= new BMWMethodOverriding(); // child class object can be referred by parent class reference variable-- Dynamic Polymorphism
                            // run time polymorphism
        c1.start();
        c1.stop();
        c1.refuel();

        // Dawn casting we can do that but it will give us a exception
        BMWMethodOverriding b1=(BMWMethodOverriding)new Car();// ClassCastException error!!!

    }

}
