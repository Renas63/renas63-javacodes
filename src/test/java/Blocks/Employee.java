package Blocks;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
   String employeeID;
    String name;
    int age;
    double salary;
    String department;
    String companyName;
     static double budget; // 1.000.000
    static {
        // it will run before everything inside this class and it will run only one time!!!!
        System.out.println("Static initialization block");
        budget= 1000000;
    }

    {
        // instance black will run before every object and set the value for the instance variables
        System.out.println("This is instance initialization block");
        employeeID=generateID();
        department= "HR";
        companyName="Techtorial";
        System.out.println("Closing instance block");
    }

    public Employee(){ // CONSTRUCTOR
      //  this.employeeID=generateID(); we dont need that since we have instance initialization block above
        System.out.println("This is no argument constructor");
        salary= 50000;
        budget-= salary;

    }
    public Employee(String name, int age, double salary){// CONSTRUCTOR
        this.name= name;
        this.age=age;
        this.salary= salary;
        //this.employeeID= generateID();
        System.out.println("Three arguments constructor");
        budget-=salary;
    }

    public String generateID(){

        Random random= new Random();
        String id= ""+ LocalDate.now()+"-";              // we need to create that to put numbers that coming from Random
        for (int i = 0; i <5 ; i++) {
          id+=random.nextInt(10);
        }
        return id;
    }
}
