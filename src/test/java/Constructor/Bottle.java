package Constructor;

public class Bottle {

    double capacity;
    boolean handWash;


    public Bottle(){// no argument constructor!
        System.out.println("This is bottle object");
    }
    // Argument Constructor
    public Bottle(double capacity){
        this();
        this.capacity=capacity;
    }
    // 2 arguments constructor
    public Bottle(double capacity, boolean handWash){
        this.capacity=capacity;
        this.handWash= handWash;

    }

    public static void main(String[] args) {

        Bottle bottle= new Bottle();
        Bottle bottle1= new Bottle(17);
        Bottle bottle2= new Bottle(17, true);

    }
}
