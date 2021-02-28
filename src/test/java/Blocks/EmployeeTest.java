package Blocks;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1= new Employee();//50K
        System.out.println(emp1.employeeID);
        System.out.println(emp1.department);
        Employee emp2= new Employee("Pema",27,100000);//100K
        System.out.println(emp2.employeeID);
        System.out.println(emp2.companyName);
        Employee emp3= new Employee();//50

        System.out.println(Employee.budget);


    }
}
