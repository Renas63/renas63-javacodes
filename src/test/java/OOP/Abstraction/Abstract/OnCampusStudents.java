package OOP.Abstraction.Abstract;

public class OnCampusStudents extends Student{

    String city;
public OnCampusStudents(){
    super("On Campus",30);
    city="Chicago";
}

    public void attend() {
        System.out.println("On Campus is attending");
    }


    public void speak() {
        System.out.println("On Campus is speaking");
    }
}
