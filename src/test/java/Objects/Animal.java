package Objects;

public class Animal {
   String name;
   String color;
   int age;
   int energy;

    public void sleep(){
        System.out.println(name + " is sleeping");
        energy=100;
    }
    public void speak(){
        System.out.println("my name is : " +name);
        System.out.println("My age is " +age);
        System.out.println("My color is " +color);
        System.out.println("My energy is  "+energy);

    }
    // will create a run method where it will show the animal is running
    // animal energy will reduce by 10
    public void run(){
        System.out.println(name +" is running ");
        energy-=10;
        System.out.println(name+ " energy is " +energy);
    }


}
