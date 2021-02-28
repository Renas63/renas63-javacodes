package OOP.Abstraction.Abstract.Shape;

public class Rectangle extends  Shape{

    double length;
    double height;
    public Rectangle(String name, double length, double height){
        super(name);
        this.length=length;
        this.height=height;
    }
    public Double getArea(){
        return length*height;
    }
    public Double getPerimeter(){
        return 2*(length+height);
    }

}
