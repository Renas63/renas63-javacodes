package Zoom.Abstraction;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle= new Circle("Circle",3);
        System.out.println("The area of  "+circle.getName()+" is "+circle.calculateArea());

        Square square= new Square("Circle",3,4);
        System.out.println(square.name);
        square.calculateArea();

    }
}
