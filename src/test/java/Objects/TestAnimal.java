package Objects;

public class TestAnimal {
    public static void main(String[] args) {
        Animal bird= new Animal();
        bird.name="Twit";
        bird.age=2;
        bird.color="Blue";
        bird.energy=50;

        bird.speak();
        while(bird.energy>0){
            bird.run();
        }


        bird.sleep();
        System.out.println(bird.energy);

        while(bird.energy>0){
            bird.run();
        }
    }
}
