package Zoom.Abstraction2;

public class Dragon extends FlyingAnimal {

    public Dragon(String name, String color, int age, int weight, String wingSpan) {
        super(name, color, age, weight, wingSpan);


    }

    void drink() {
        System.out.println(name + " is drinking");
    }

    void onFire() {
        System.out.println(name + " is on Fire");
    }

    static void chirp() { // method hiding
        System.out.println("Dragon is flying");
    }
}