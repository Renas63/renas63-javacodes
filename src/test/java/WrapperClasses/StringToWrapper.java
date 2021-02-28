package WrapperClasses;

public class StringToWrapper {
    public static void main(String[] args) {

        String num="12.5";
        Double db= Double.valueOf(num);
        System.out.println(db);

        double d= Double.valueOf("43.3"); // unboxing --> we can store wrapper class object to primitive data type

        String num1="11";
        Integer n= Integer.parseInt(num1); // autoboxing--- we can store primitive data type to Wrapper class object.

        boolean bl= Boolean.parseBoolean("123");
        System.out.println(bl);// false--> Bc the value is not true or false


        Integer number=null;
        // int number2= null---> compile time error
        int number1= number;// run time error
        System.out.println(number1);// NullPointerException we can not assign null to integer
    }
}
