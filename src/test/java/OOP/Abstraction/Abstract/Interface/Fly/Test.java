package OOP.Abstraction.Abstract.Interface.Fly;

public class Test {
    public static void main(String[] args) {

        Plane plane= new Plane();
        System.out.println(plane.getPassengerNumber());

        Bird bird= new Bird();
        bird.run();
    }
}
