package Constructor;

public class TestPayment {
    public static void main(String[] args) {

        Office office= new Office(10,15);

        Price price= new Price(11);

        Result result= new Result(office,price);
        System.out.println(result.calculatePayment());

        // test this application for another office amd building
        // Office width is 17 and length is 21
        // price for sq 14 using the classes calculate the payment for this new office
        Office office1= new Office(17,21);

        Price price1= new Price(14);
        Result result1= new Result(office1, price1);
        System.out.println(result1.calculatePayment());

        //=====================================================
        OfficeTriangle triangle= new OfficeTriangle(17,21);
        Price price2= new Price(16);
        Result result2= new Result(triangle,price2);
        System.out.println(result2.calculateTrianaglePayment());
    }
}
