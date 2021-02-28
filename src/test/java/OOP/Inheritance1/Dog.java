package OOP.Inheritance1;

import OOP.Inheritance.Animal;

public class Dog {   // Dog class in java by default is extended class of Object class

    String name;
    int age;
    public int height;
   private int weight;

    public Dog(String name, int age, int height, int weight){
        super(); // super() is the constructor which is coming from super/parent class
        this.name= name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    public Animal barking(){
        return new Animal();
    }
    public boolean wakeup(){
        return true;
    }
    public int getWeight(){
        return weight;
    }

}
