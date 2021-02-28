package RecapAndMentoring.TeymurRecap;

import java.util.Objects;

public class Car {

    int wheels;
    String model;
    int year;
    String make;

    public Car(int wheels, String model, int year, String make) {
        this.wheels = wheels;
        this.model = model;
        this.year = year;
        this.make = make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels &&
                year == car.year &&
                Objects.equals(model, car.model) &&
                Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, model, year, make);
    }

    @Override
    public String toString() {
        return model + " " + make + " " + year;
        //The toString() method returns the string representation of the object.
        //By overriding the toString() method of the Object class,
        // we can return values of the object, so we don't need to write much code.
    }

// when I want to print out just car 1 , we need to override toString method to be able to reach
//spesific information of car 1

    public void startCar(){
        System.out.println(model + " " + make + " engine is starting");
    }
}