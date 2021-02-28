package NaveenAndSDET.SDET;

public class OOPEmployee {
    int eid;
    String eName;
    double salary;
    int depNo;
    String job;
/*
            OOP
Class: collection of variables and methods
Object: Object is instant of a class
Method: block of code which contains the logic

1. main () method can be present in a same class
2. main() method can be present in separate class

we can assign values to variables in 3 ways
1.by using reference variable
2. by using method
3. by using constructor
 */
    void display() {
        System.out.println(eid);
        System.out.println(eName);
        System.out.println(depNo);
        System.out.println(salary);
        System.out.println(job);
    }
    public static void main(String[] args) {
        OOPEmployee emp1 = new OOPEmployee();// creating object
        emp1.eid = 101;
        emp1.eName = "David";
        emp1.salary = 250.000;
        emp1.depNo = 10;
        emp1.job = "Manager";
        emp1.display();

        OOPEmployee emp2= new OOPEmployee();
        emp2.eid = 102;
        emp2.eName = "Dirk";
        emp2.salary = 150.000;
        emp2.depNo = 15;
        emp2.job = "CEO";
        emp2.display();

    }
}