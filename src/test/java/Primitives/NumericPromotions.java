package Primitives;

public class NumericPromotions {

    public static void main(String[] args) {

        byte count1=50;
        int count2=10;

        // short num=count1+count2; ---> compile time error
        // long> int> short > byte ---->
        //double> float  ---> these are decimal numbers
        int sum= count1+count2;
        System.out.println(sum);
       //
        float price1=10.99f;
        short price2=700;
        float fl =price1+price2;

        byte price3=89;
        double price4=435.9870;
        double db= price3*price4;
        System.out.println(db);


        int sh=price2+price3; // the result will be promoted to the int

        byte b=10;
        short s=19;
        double d=5.9;
        double result= b*s*d;  // it will be double coz double is the larger and its decimal
        System.out.println(result);




    }
}
