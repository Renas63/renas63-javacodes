package OOP.Inheritance;

public class WildAnimal extends Animal {

    public void speak() {
        //@Override
        // speak is not overiding from Parent class. it is new method for Wild Animals
        System.out.println("Wild Animal is speaking");

    }

    public void run() {// this is not a override. its not coming from Parent.
        System.out.println("Wild animal is running");
    }


    public static void main(String[] args) {
        WildAnimal wAnimal = new WildAnimal();
        wAnimal.eat();
        wAnimal.speak();
        wAnimal.run();
        // wAnimal.speak(); --> we can not inherit the feature from the siblings
        // speak() method is available only for Domestic Animals

        Animal animal = new Animal();
        animal.eat();

    }
}
