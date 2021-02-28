package Constructor;

public class StudentTest {
    public static void main(String[] args) {

        Student david= new Student("David");
        System.out.println(david.fName);
        // if we want to give a age to David
        david.age=23;
        System.out.println(david.age);
        System.out.println(david.schoolName);

        Student marcus= new Student("Marcus", "Hunt",26 );
        System.out.println(marcus.age);
        System.out.println(marcus.schoolName);

        Student brack= new Student("brack", "obama",21,"techtorial");
        System.out.println(brack.fName);
        System.out.println(brack.schoolName);



    }
}
