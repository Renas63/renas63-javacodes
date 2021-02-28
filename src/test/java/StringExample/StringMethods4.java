package StringExample;

public class StringMethods4 {

    public static void main(String[] args) {

        String email="techtorial@gmail.com";
        int indexNum=email.indexOf("@");// 10
        System.out.println(indexNum);
        System.out.println(email.substring(10));


        int indexNum1=email.indexOf(".")+1;
        System.out.println(indexNum1);
        System.out.println(email.substring(indexNum1));

        System.out.println(email.substring(email.length()-3));// it will print com again


        String name= "Jennifer";
        System.out.println(name.substring(1,5));// result enni    1,2,3,4

        name =name.substring(5); //  we reassign the name
        System.out.println(5);// fer

        String name1= "Melissa";
       // name1.substring(20);// ---> it will throw runtime error
        // name1.substring(4,2));   runtime error
        // name1.substring(3,3));   returns empty string


        String car="honda";
        System.out.println(car.replace("h","H"));

        car=car.replace("honda", "toyota");

        System.out.println(car);

        System.out.println(car.replace("0", "1"));


        System.out.println(car.replace("k","u"));

        String city= "  Los Angeles    ";
        System.out.println(city.trim());







    }
}
