package Constructor;

public class CarTest {
    public static void main(String[] args) {

        Car car1= new Car();
        Car cr2= new Car();
        Car car3= car1;
        car1= null;

        // How many object I have inside that class?--->
        //NOTE: IF THE OBJECT has no reference, Java will call garbage collection
        //How many object is garbage collected?
    }
}
