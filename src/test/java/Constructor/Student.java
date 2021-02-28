package Constructor;

public class Student {
    String fName;
    String lName;
    int age;
    String schoolName="Depaul";

    public Student(String fName, String lname, int age){
        this.fName=fName;
        this.lName= lname;
        this.age=age;

    }
    public Student(String fName, String lname, int age, String s){
        this.fName= fName;
        this.lName=lname;
        this.age=age;
        this.schoolName=schoolName;

    }

        public Student(String fName){
    this.fName=fName;
      }

      public void setfName(String newName){
            fName=newName;
      }
    public static void main(String[] args) {



        Student student= new Student("Trump");
        System.out.println(student.fName);//---->
        student.fName="David";
        System.out.println(student.fName);//---> David
        student.setfName("Techtorial");
        System.out.println(student.fName);// it will be techtorial
        System.out.println(student.schoolName);

    }
}
