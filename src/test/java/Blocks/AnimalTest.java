package Blocks;

import AccessModifiers.Animal;

public class AnimalTest extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();// default constructor has a public access modifier!!!
        System.out.println(animal.name); // since we made name, vari public, no problem with that.
        //System.out.println(animal.age);// since the age is default, it will give an error

        animal.run();
        //animal.eat(); // cant use since its default
        // animal.sleep();
        animal.walk(); // protected
// with extends keyword we can call protected access modifier



    }
}
