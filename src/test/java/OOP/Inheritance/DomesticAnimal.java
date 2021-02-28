package OOP.Inheritance;

public class DomesticAnimal extends  Animal{

    public void speak(){
        System.out.println("dAnimal is speaking ");
    }
    // Method Overriding---> using method overriding we can update&changethe implementation
    // for the methods from parent class
    @Override
    public void run(){
        System.out.println("Domestic Animal is running");
    }

    public static void main(String[] args) {
        DomesticAnimal dAnimal= new DomesticAnimal();
        dAnimal.run();
        dAnimal.speak();

        Animal animal= new Animal();
        animal.run();
        //animal.speak(); is not available for parent class.
    }

}
