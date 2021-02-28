package AccessModifiers;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal= new Animal();
        System.out.println(animal.name);// public---> we can acesss from everywhere inside the same project
        System.out.println(animal.age);// default--> inside the same package and we can reach
        System.out.println(animal.color);// protected--> in same class and child class


        animal.eat();
        animal.run();
        //animal.sleep() --> it is private access modifier
        animal.walk();//-->. first will print animal is sleeping then walking
    }
}
