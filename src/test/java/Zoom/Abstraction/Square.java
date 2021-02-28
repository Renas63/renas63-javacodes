package Zoom.Abstraction;

public class Square extends Shape{
    int weight;
    int height;

    public Square(String name, int weight, int height){
        super("Square");
        this.weight=weight;
        this.height=height;
    }


    @Override
    double calculateArea() {
        return weight*height;
    }
}
