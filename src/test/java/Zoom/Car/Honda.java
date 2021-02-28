package Zoom.Car;

public class Honda extends Car{
    String model;
    public Honda(String model, int year, String engine, String color){
        super(model, year, engine, color);
        this.model="Civic";
    }

    @Override
    public void selfParking() {
        System.out.println(model+ " has a self parking feature");
    }
}
