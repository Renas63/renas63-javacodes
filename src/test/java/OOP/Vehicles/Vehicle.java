package OOP.Vehicles;

public class Vehicle {
    /*
    Vehicles
    - Vehicle
        one protected String model
        one default access modifier and int year
        one public brand
        Methods:
            - drive() --> vehicle is moving.
            - stop() --> return true and prints the 'vehicle is stopping'
            - protected start() --> return true and prints the 'vehicle is starting'
            - Create one accelerate() method with default access modifier and return the Object.
        Constructor:
        Create one constructor to initialize the instance variables for Vehicle class.
    - Car
        * extends the Vehicle
        - Create one String Model;
        - Create one engine type;
        - Override the drive method from the parent class and print 'Car is moving'
        - Override the accelerate() method from parent class and returns the Integer
        and calls the Model of the vehicle from Parent class.
     */

    protected String model;
              int year;
    public String brand;

    public void drive(){
        System.out.println("Vehicle is moving");
    }
    public boolean isStopped(){
        System.out.println("Vehicle is stopping");
        return true;
    }
    protected  boolean isStarted(){
        System.out.println("Vehicle is starting");
        return true;

    }
    Object  accelerate(){
        // Object [] values={1,2,3,4,5 "test"}; autoboxing???
        return new Object();
    }

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
}
