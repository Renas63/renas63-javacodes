package StringExample;

public class StringConcat {
    public static void main(String[] args) {

        String fullName= "David" + "Hunt" +5;
        System.out.println(fullName);


        String fullName1= 5+3+"David" + "Hunt" +5;
        // 5+3--> arithmetic operator
        // int+ String  + String ----> concatenation
        // "8 David Hunt 57"
        // if we do that (5+7) if we put parenthesis the out put will be 12
        //  otherwise the result will be 8David Hunt 57
        System.out.println(fullName1);


        String str= "5"+"7";

        System.out.println(str);


        String str1=5+5+"9"+3;
        System.out.println(str1);

        int num=10;
        int num1=5;
        int result= num+num1; // we should do calculation in here not inside System.out println(no calculation in here )

        System.out.println("Result = " +  result);

     String number="1";
     number+="2";

        System.out.println(number);

    }
}
