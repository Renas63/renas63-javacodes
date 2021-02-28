package Constructor;

public class Car {

    public void move(){
        System.out.println("The car is moving ");
            //move();// recursion it will print infinite stockoverflow EXCEPTION

    }

    public static void main(String[] args) {
        Car car1= new Car();
       // car1= null; // it will give nullPointerException
        car1.move();

        System.gc();

       // car1.move();// nulPointerException
    }
}
