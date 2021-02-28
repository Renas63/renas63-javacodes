package Zoom.Car;

public class CarTest {
    public static void main(String[] args) {
        BMW bmw= new BMW("320",2014,"2.0","Silver");
        bmw.run();
        bmw.canUber();
        bmw.accelerate();
        bmw.selfParking();
        if(bmw.canUber()){
            System.out.println("Contrast! you can do uber");
        }else{
            System.out.println("your car is not eligible");
        }

        Honda honda= new Honda("Accord",2002,"1.4","Red");
        honda.selfParking();
        honda.accelerate();
        honda.canUber();
        //honda.roof();
        System.out.println(honda.model);

        if(honda.canUber()){
            System.out.println("Contrast! you can do uber");
        }else{
            System.out.println("your car is not eligible");
        }

    }

}
