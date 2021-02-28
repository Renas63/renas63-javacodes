package OOP.Abstraction.Abstract.Shape;

public class Triangle extends Shape{
   int side1;
   int side2;
   int base;
   int height;




    public Triangle(String name, int side1, int side2, int base, int height){
       super(name);
    this.name= name;
        this.side1= side1;
        this.side2=side2;
        this.base= base;
        this.height= height;
    }
    public Integer getArea(){
        return (height*base)/2;
    }
    public Integer getPerimeter(){
        return side1+side2+base;
    }

}
