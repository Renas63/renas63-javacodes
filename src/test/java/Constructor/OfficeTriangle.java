package Constructor;

public class OfficeTriangle {
    double base;
    double height;

    public OfficeTriangle(double base, double height){
        this.base=base;
        this.height=height;

    }
    public double getArea(){
        return base*height/2;

    }
}
