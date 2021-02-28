package NaveenAndSDET;

public class StaticAndNonStatic {
    String name= "Tom"; // non static instance variable
   static int age=23; // static instance variable


    public static void main(String[] args) {

        // how to call static methods and vars
        // 1. direct calling
            sum();
        // calling by class name
        System.out.println(StaticAndNonStatic.age);

        // how to call non static methods and vars

        StaticAndNonStatic obj= new StaticAndNonStatic();
        obj.sendMail();
        System.out.println(obj.name);
        // can I access static method with using object reference.
        obj.sum();// we can but it will give us a warning. we should just directly call or with class name


    }

    public void sendMail(){
        System.out.println("send mail method");
    }
    public static void sum(){
        System.out.println("sum method");
    }
}
