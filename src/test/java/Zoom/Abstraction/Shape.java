package Zoom.Abstraction;

   abstract class Shape {

    String name;
    public Shape(String name){
        this.name=name;

    }
    abstract double calculateArea();


    String getName() {
        return name;
    }
}
