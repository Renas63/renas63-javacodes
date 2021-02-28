package OOP.Abstraction.Abstract;

public class Classroom {
    public static void main(String[] args) {

        //Student student= new Student("David", 25);--Bc of the abstract class
                                                    // we can not instantiate the student Object


 OnCampusStudents oncampus= new OnCampusStudents();
        System.out.println(oncampus.name);
        System.out.println(oncampus.city);


        OnlineStudents online= new OnlineStudents();
        System.out.println(online.name);
       // System.out.println(online.city);--> city is not ava inside the OnlineStudent class
        //and inside parent class which is Student
        System.out.println(online.id);

    }
}
