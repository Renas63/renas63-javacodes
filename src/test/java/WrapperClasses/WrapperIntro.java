package WrapperClasses;

public class WrapperIntro {
    public static void main(String[] args) {

        byte by=10;
        Byte b= new Byte(by);
        System.out.println(b==10);

        Character ch= new Character('c');
        System.out.println(ch);
        Character.isDigit('1'); // is.Digit is a static method
        System.out.println(Character.isDigit('1'));
        System.out.println(ch.compareTo('c')); // return 0. it means both char  are the  same. otherwise it will return -1!!!

        System.out.println(ch.compareTo('d'));// return -1

        char c1= 'c';

        Boolean bl= new Boolean("false");

        System.out.println(bl);// return false
        Boolean bl1= new Boolean("true");
        System.out.println(bl1); // true

        Integer number= new Integer(11);// wrapper class object tw ways of creating wrapper class object
        Integer num= 55;// wrapper class object same with above
        Integer num1=new Integer( 55);
        Long ln=100l;
        Short sh=55;
        Float fl= 44.8f;
        Double db=56.6;
        Double db1=56d;
        Double db2=(double)56.6;

        System.out.println(num==num1); // false since the references are not pointing the same object
        System.out.println(num.equals(num1));// true. since num and num1 have the same values
        // if the equals method coming the object class, it will compare the references
        // pointing the same object or not.
        //if the equals method is coming from Wrapper class, it will compare the values of the object

    }
}
