package StringExample;



public class MethodChaining {
    public static void main(String[] args) {


        String month="   January   ";

        month=month.trim().toLowerCase().substring(0,3).replace("n","N");

        System.out.println(month);


        String month2="February ";

        //month2=month2.trim().concat("Method Chaining").indexOf("b");

      // NOTE: We can not do method chaining after index of method( integer value)
        // we can not assign integer value to string!!!!

        //int index=month2.indexOf("b").trim().concat("Method Chaining").indexOf("b");

        int index=month2.trim().concat("Method Chaining").indexOf("b");

        System.out.println(month2);
        boolean bl= month2.trim().equals("February");
        System.out.println(bl);

       String str="   Zero to Hero  ";
       // change zero to One, make all of them upper case, remove the spaces. print only first  character

        int number= str.replace("Zero", "One").toUpperCase().trim().substring(0,3).length();

        System.out.println(number);

        char num= str.trim().substring(0,5).charAt(3);
        System.out.println(num);


        String test= " STRING T";
        test.indexOf("T",test.indexOf("T")+1);    //??????????????????

        System.out.println(test);


















    }
}
