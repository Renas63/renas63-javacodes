package Constructor;

public class Employee {
    String name;
    int age;
    String companyAddress;
    String companyName;
    String managerName;

    public Employee(){
        this("Stephen", 29);
    }

    public Employee(String name, int age){
        this(name, age, "2200 E Devon Ave","Techtorial","Muammer");

    }
    public Employee(String name, int age, String companyAddress, String companyName, String managerName){
        this.name= name;
        this.age=age;
        this.companyAddress= companyAddress;
        this.companyName=companyName;
        this.managerName=managerName;

    }

    public static void main(String[] args) {


        Employee emp = new Employee("Olivia", 25);
        System.out.println(emp.companyAddress);
        Employee emp1= new Employee("David", 27);
        System.out.println(emp1.companyAddress);

        Employee emp2= new Employee("Kushal",33, "204 W Higgins",
                "Marianos", "Chuck");

        System.out.println(emp2.companyAddress);

        Employee emp3= new Employee();
        System.out.println(emp3.companyAddress);
        System.out.println(emp3.companyName);
        System.out.println(emp3.name);
        System.out.println(emp3.age);


    }
}
