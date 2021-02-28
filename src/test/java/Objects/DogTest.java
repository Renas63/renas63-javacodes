package Objects;

public class DogTest {
    public static void main(String[] args) {

        DogStaticKeyword dog = new DogStaticKeyword();
        dog.name="Max";
        dog.eat();
        dog.eat();
        dog.eat();

        DogStaticKeyword dog1= new DogStaticKeyword();
        dog1.name="Spike";
        dog1.eat();
        dog1.eat();
        DogStaticKeyword dog2 = new DogStaticKeyword();
        dog2.name= "Dublin";
        dog2.eat();
        // Since the meal is static variables(class variables
        // we need to call using the class name
        // the object name it will refer to the same variables
        System.out.println(DogStaticKeyword.meal);
        System.out.println(dog1.meal);//---> this one is bleang to DOG
        System.out.println(dog2.meal);
        DogStaticKeyword.barking();
        dog1.barking();

    }

}
