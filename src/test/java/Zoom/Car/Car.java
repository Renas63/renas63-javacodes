package Zoom.Car;

public class Car {
    String model;
    int year;
    String engine;
    String color;
    int speed;
    int price;

    public Car(String model, int year, String engine, String color) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.color = color;
    }
    public void run(){
        System.out.println(model + "is running");

    }
    public int accelerate(){
        return speed+10;

    }
    public boolean canUber(){
        if(year<2010){
           return false;

        }
        return true;
    }
    public void selfParking(){
        System.out.println(" no self parking feature in this " +model);
    }
}
