package OOP.Abstraction.Abstract;

public abstract class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name= name;
        this.age=age;
    }
    // abstract method can be public, default and protected

     public abstract void attend();
        // we cant provide a body in abstract

    public abstract  void speak();


    public void studentInfo(){
        System.out.println("Name: "+name+ "Age" +age);
    }
}
