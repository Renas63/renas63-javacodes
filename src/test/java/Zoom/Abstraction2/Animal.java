package Zoom.Abstraction2;

public abstract class Animal {
    String name;
    String color;
    int age;
    int weight;

    public Animal(String name, String color, int age, int weight) {
        this.name=name;
        this.color= color;
        this.age=age;
        this.weight=weight;
    }

    abstract void eat();
    abstract void drink();
    abstract void resting();
    abstract void hunting();

    void sleep(){
        System.out.println();
    }
}
