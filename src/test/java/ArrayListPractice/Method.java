package ArrayListPractice;
import java.util.ArrayList;
public class Method {

    public static void main(String[] args) {

        ArrayList items= new ArrayList();

        items.add("Apple");
        items.add("banana");
        items.add(Boolean. TRUE);
        items.add(false);


        ArrayList <String> cities= new ArrayList<>();
        cities.add("Chicago");
        cities.add("Denver");
        cities.add("Columbus");
        cities.add("Chicago");
        cities.add("Denver");

        ArrayListIntro.print(cities);

        cities.remove("Chicago");// for remove we can either just call the city name or call index of city!!!1
        cities.remove(3);// it will remove second Chicago
        System.out.println(cities);
        System.out.println(cities.remove(1));
        System.out.println(cities);
        System.out.println(cities.remove("Chicago"));// return true or false---> true
        System.out.println(cities);
        cities.remove("Houston");//  it will return false since we dont have Houston in out ArrayList!!!

       // cities.remove(4);// indexOutOfBoundry exception



    }
}
