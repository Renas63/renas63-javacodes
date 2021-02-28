package NaveenAndSDET.SDET;

public class StudentMainClass {
    public static void main(String[] args) {
    // 1. Assign values by using reference variable
        Student stu1= new Student();
       /* stu1.sid=1010;
        stu1.sname="John";
        stu1.grade='A';*/

        // 2. Assign values by using method
        stu1.getValues(1010,"John", 'A');

        stu1.display();
    }
}
