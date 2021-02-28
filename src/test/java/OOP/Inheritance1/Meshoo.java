package OOP.Inheritance1;

import OOP.Inheritance.Animal;
import OOP.Inheritance.Cat;

public class Meshoo extends Dog {

    String name;

    // if the oarent class has no -argument constructor, child class must create the constructor
    // and implement the super class constructor.


    public Meshoo() {
        super("Meshoo", 1, 3, 10);// super () has to be in first line
        this.name= "Meshoo";// we cant use super() and this() together
        System.out.println("Test");
    }

    public Meshoo(String name, int height, int weight) {
        super(name, 1, height, weight);

    }
    public void play(){
        System.out.println(super.name+ " is playing");
    }
    @Override
    public Cat barking(){
        System.out.println(this.name + "is barking");
        return new Cat();
    }

    public static void main(String[] args) {
        Meshoo meshoo = new Meshoo();
        System.out.println(meshoo.name);
        //System.out.println(meshoo.weight); since weight is private, it is not inherited to the child class
        System.out.println(meshoo.getWeight());
        meshoo.play();
        meshoo.barking();// Meshoo 1 is barking

        Meshoo newMeshoo = new Meshoo("Meshoo 1", 2, 12);
        System.out.println(newMeshoo.name);
        System.out.println(newMeshoo.age);
        System.out.println(newMeshoo.getWeight());
        newMeshoo.play();
        newMeshoo.barking(); // null is barking




    }


}
