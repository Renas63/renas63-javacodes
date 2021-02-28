package OOP.Abstraction.Abstract.Interface.Fly;

public class Bird implements Noise,Flyable{


    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bird is making noise");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }
}
