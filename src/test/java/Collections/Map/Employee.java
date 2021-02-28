package Collections.Map;

import java.util.Random;

public class Employee {
    /*
    create one emp class with name, city and age  and emp Id.
create one constructor to initialize instance variables
create a getters and setters for instance variables
create one method will generate 8 digits from random emp Id
     */
    String name;
    String city;
    int age;
    String employeeID;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.employeeID = generate();
    }

    /*
     * How to convert String to primitive data type?
     * "123" --> Integer.parseInt("123");
     * How to convert String to wrapper class object?
     * "123" --> Long.valueOf("123");
     * How to convert primitive to String?
     * 123 --> ""+123; -->
     * String.valueOf(123); --> it will return String data type
     * */
    public String generate() {
        return String.valueOf(Math.random() * 10000000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeid() {
        return employeeID;
    }

    public void setEmployeeid(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", employeeID=" + employeeID +
                '}';
    }
}