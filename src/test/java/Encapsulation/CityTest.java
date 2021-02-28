package Encapsulation;

public class CityTest {
    public static void main(String[] args) {
        City city= new City();
        city.setName("Chicago");
        city.setPopulation(5000000);
        System.out.println(city.getName());// null
        System.out.println(city.getPopulation());//0




    }
}
