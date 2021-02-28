package WrapperClasses;

public class StringToPrimitive {

    public static void main(String[] args) {
        String nm= "123";
        String nm1="120";

        System.out.println(nm+nm1);

        int num= Integer.parseInt(nm);
        int num1= Integer.parseInt(nm1);
        System.out.println(num+num1);


        String test="12.5";

        double result= Double.parseDouble(test);

        System.out.println(result);

//        int result1 =Integer.parseInt("12.5");// NumberFormatException
//        System.out.println(result1);// NumberFormatException

        //Long ln=Long.parseLong(test);// NumberFormatException

    }
}
