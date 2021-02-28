package RecapAndMentoring.TeymurRecap;

public class Practice {

    public static void main(String[] args) {
        Car car1 = new Car (4,"Toyota", 2016, "Rav4");
        Car car2 = new Car (4,"Toyota", 2016, "Rav4");

        System.out.println(car1.equals(car2));

        System.out.println(car1);

        car1.startCar();
    }
}
