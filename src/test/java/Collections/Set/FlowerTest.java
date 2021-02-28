package Collections.Set;

import Collections.Set.Flower;

import java.util.HashSet;

public class FlowerTest {
    public static void main(String[] args) {
        Flower f1= new Flower("Tulip","Pink");
        Flower f2= new Flower("Rose","Red");
        Flower f3= new Flower("Orchid","Yellow");
        Flower f4= new Flower("Succulent","Green");
        Flower f5= new Flower("Viola","White");

        // if we don't define data type by default, the data type of HashSet will be Object
        //HasSet doesn't follow any order
        HashSet<Flower> flowers= new HashSet<>();
        flowers.add(f1);
        flowers.add(f2);
        flowers.add(f3);
        flowers.add(f4);
        flowers.add(f5);

        flowers.add(new Flower("Rose", "Red")); // it will create that too since we used new keyword!

        for (Flower fl:flowers) {
            System.out.println(fl.toString());// since we created toString method, we dont have to say fl.toString

        }




    }
}
