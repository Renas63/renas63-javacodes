package OOP.Abstraction.Abstract.Interface;

public abstract class Phone implements MemoryCard, TouchScreen {

    String name;
    int screenSize;


    public  abstract void text();// we can use protected access modifier as well but we can not use private!!!

    abstract void takePhoto();


    // Play is available inside the MemoryCard . Since both of them are static  method.
    // it is not overriding. it's hiding method!!!
    public static void play(){
        System.out.println("Phone is playing");




    }


}
