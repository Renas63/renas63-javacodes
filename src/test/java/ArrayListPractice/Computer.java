package ArrayListPractice;

public class Computer {
    String manufacture;
    String name;
    Integer price;
    Double screenSize;

    public Computer(String manufacture, String name, Integer price, Double screenSize){
        this.manufacture= manufacture;
        this. name=name;
        this.price= price;
        this.screenSize= screenSize;

    }
    public int price(){
        return price;
    }

    public String toString(){
        return this.manufacture + " " +this.name + " " +this.price+ " " +this.screenSize;
    }
}
