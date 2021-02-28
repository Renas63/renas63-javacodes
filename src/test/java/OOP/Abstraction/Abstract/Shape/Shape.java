package OOP.Abstraction.Abstract.Shape;

public abstract class Shape {

    String name;

    public Shape(String name){
        this.name=name;
    }
    // Number is the parent class for wrapper class object
    //Integer, Double, Float, Long.
    public abstract Number getArea();

    public abstract Number getPerimeter();

    public void draw(){
        System.out.println("The shape is " + name);

    }
}
