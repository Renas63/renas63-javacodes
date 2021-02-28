package Zoom.Abstraction;

public class Circle extends Shape{
    int radius;
    public Circle(String name, int radius){
        super(name);
        this.radius=radius;
    }
    @Override
    double calculateArea(){
        return Math.PI*radius*radius;

    }
}
