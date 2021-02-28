package OOP.Inheritance;

public class Cat extends DomesticAnimal{

    public void jump(){
        System.out.println("Cat is jumping");

    }
        @Override
        public void run(){
            System.out.println("Cat is running");

        }

    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.run();
        // run method is coming from CAT class since its overriding inside the CAT class.
        cat.sleep();
        // sleep method is coming from Animal class since
        // its not available under the Domestic Animal class
        cat.speak(); // coming from Domestic animal


    }
}
