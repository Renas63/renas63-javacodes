package Blocks;

public class Blocks {
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    }
    public Blocks(){
        System.out.println("No Arguments");
    }

    public static void main(String[] args) {
        Blocks blocks1= new Blocks();
        Blocks blocks2= new Blocks();
        Blocks blocks3= new Blocks();
    }
}
         /* it will print like that!!!!!
    Static block
    Instance block
    No Arguments
    Instance block
    No Arguments
    Instance block
    No Arguments

 */