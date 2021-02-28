package Objects;

public class CatTest {
    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.name="Dodo";
        cat.mealAmount=50;
        cat.setName("Princess");
        System.out.println(cat.name);
        System.out.println(cat.getName());

        cat.run("left");
        cat.run("right");
        cat.run("down");
        cat.run("up");
        System.out.println(cat.mealAmount);

    }
}
