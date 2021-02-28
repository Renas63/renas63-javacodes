package OOP.Vehicles;

public class Car extends Vehicle {
String model;
double engineType;

    public Car(String model, int year, String brand) {
        super(model, year, brand);// it calls constructor from a parent class
        // it should be in first line
        this.model=model;
        this.engineType=3.5;
    }

    @Override
    public   void drive(){
        System.out.println("Car is driving");
    }

    @Override
    public  Integer accelerate(){
        System.out.println(super.model + " of the car");
        return new Integer(10);
    }
    @Override
    public boolean isStopped(){
        System.out.println("Car is stopping");
        return false;
    }

    public long transmission(){
        return 5;
    }

    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle("Corolla",2018,"Toyota");
    vehicle.accelerate();
        System.out.println(vehicle.model);

    Car car= new Car("Accord ",2012,"Honda");
    car.accelerate();
        System.out.println(car.model);

    }
}
