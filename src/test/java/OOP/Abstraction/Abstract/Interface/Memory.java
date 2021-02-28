package OOP.Abstraction.Abstract.Interface;

public interface Memory extends MemoryCard{


     public static final int CAPACITY=64;

     // We can create the default method only inside the interface
    // Default method by default has public access modifier , We can not change it.
     public  default void call(){
         System.out.println("the phone is ringing");

     }

     // speak()  method is assumed to be public and abstract!!!!
    // in interface abstract methods can be only public
     void speak();


     static void play(){
         System.out.println("Phone is playing");
     }
     public static void record(){
         System.out.println("Phone is recording");
     }
}
