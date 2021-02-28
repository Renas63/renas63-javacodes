package Zoom.Car;



public class BMW extends Car {
    public BMW(String model, int year, String engine, String color) {
        super(model, year, engine, color);
    }


    public boolean canUber(){
        if(year<2010 && Integer.parseInt(engine)>=2){
            return true;
        }
        return  false;
    }
    public int accelerate(){
        return speed+15;
    }
    public void roof(){
        System.out.println(model+ "has a roof");
    }
}
