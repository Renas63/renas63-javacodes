package OOP.Abstraction.Abstract;

import OOP.Abstraction.Abstract.Student;

public abstract class SelfPacedStudent extends Student {

    public SelfPacedStudent(String name, int age){
        super(name, age);

    }
    // inside this class we dont need to implement the abstract method from student class.
    // bc SelfPacedStudent class is also abstract class.
    // Note: first non- abstract class that extends the abstract class that extends the abstract class
    //must implement the abstract method.

    abstract  void learn();




}
