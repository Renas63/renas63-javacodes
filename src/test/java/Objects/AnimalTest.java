package Objects;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat=new Animal();
        cat.age=8;
        cat.name="Dodo";
        cat.energy=420;


        cat.speak();
        cat.sleep();
        System.out.println("Cat energy" + cat.energy);

        Animal dog= new Animal();
        dog.name="Pars";
        dog.age=5;
        dog.color="Brown";



        dog.speak();
        dog.sleep();
        System.out.println("dog energy " +dog.energy);



    }
}
