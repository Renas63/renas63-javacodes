package NaveenAndSDET;

public class EncapsulationData {
    //1. private data variables: so that these vars can not accessed directly from outside the class.
    // in ENCAPSULATION, We create a private variables and we  create a public getter ans setter to get value of those vars
    //ADVANTAGES: Flexibility, re usability,  security, improve the maintenance of the code
    private int ssn;
    private String empName;
    private int empAge;

    // getter and setter methods: to set and get the values of the fields(it means above variables)

    //NOTE: Encapsulation also called DATA HIDING.

    public int getSsn(){
        return ssn;
    }
    public void setSsn(int ssn){
        this.ssn=ssn;
}
    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }
    public static void main(String[] args) {

        EncapsulationData emp=new EncapsulationData();
        emp.setEmpAge(25);
        emp.setEmpName("Muammer Turan");
        emp.setSsn(123456);
        System.out.println("Employee name is  :" + emp.getEmpName());
        System.out.println("Employee age is : " +emp.getEmpAge());
        System.out.println("Employee SSN IS : " +emp.getSsn());

        // Getter and Setter we have to  use  public  method!!!

    }
}
