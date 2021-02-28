package Zoom.Abstraction2;

public class AnimalTest {
    public static void main(String[] args) {

        Dragon dragon=new Dragon("Ejderya","Red",120,1500,"10");
        dragon.chirp();
        dragon.onFire();
        dragon.eat();
        dragon.drink();


        Tiger tiger=new Tiger("Tiglet","Orange/Black",3,80);
        tiger.hunting();
        tiger.roar();
        tiger.run();
        tiger.drink();

    }

}
