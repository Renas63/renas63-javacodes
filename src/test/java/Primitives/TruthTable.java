package Primitives;

public class TruthTable {
    public static void main(String[] args) {
        // AND---> &&
        // OR ---> ||

        // gpa=3.6 -->  gpa should be more than 3.6 or
        // gre score should be more than 560

        double gpa= 3.5;
        int greScore=570;
        boolean result= gpa>3.6 ||greScore>560 ;

        System.out.println("Can I register to the University? " + result);

    /*
    to be able  to buy a house, I need to have at least $300000
    OR  credit score more than equals to 680
     */
      int housePrice=300000;
      int creditScore=680;

       int myCash= 10000;
       int myScore=740;
        boolean _result= 100<=300_000 ||740>=680;
        System.out.println("Can I buy the House "  + result);





    }
}
