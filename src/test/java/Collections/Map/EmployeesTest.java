package Collections.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EmployeesTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("David", "Chicago", 25);
        Employee employee2 = new Employee("Abby", "Des Plaines", 28);
        Employee employee3 = new Employee("Brandy", "Denver", 30);
        Employee employee4 = new Employee("Adam", "Cleveland", 33);
        System.out.println(employee1.getName());
        System.out.println(employee2.getAge());
        System.out.println(employee3.getCity());
        System.out.println(employee4);
        Map<String, Employee> employees = new LinkedHashMap<>();
        employees.put(employee1.getEmployeeid(), employee1);
        employees.put(employee2.getEmployeeid(), employee2);
        employees.put(employee3.getEmployeeid(), employee3);
        employees.put(employee4.getEmployeeid(), employee4);
        printNames(employees);
        printEmpNumbers(employees);
    }
    //Create one method  to print only employee names from map
    public static void printNames(Map<String, Employee> emp) {
        Collection<Employee> employees = emp.values();
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
    public static void printEmpNumbers(Map<String,Employee>emp){
        Set<String> keys=emp.keySet();
        for (String key:keys){
            System.out.println(key);
        }
    }
}



