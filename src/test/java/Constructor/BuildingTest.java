package Constructor;

public class BuildingTest {
    public static void main(String[] args) {
        Building b1= new Building("Hancock Tower" );
        Building b2= new Building("Aon Center", "200 E Randolph",50);

        // println method call the toString method
        // if you have toString method inside your class
        // println will call from the Building class
        // if we dont have the toString inside the building
        //java will call it from Object class
        System.out.println(b1);
        System.out.println(b2);
    }
}
