package NaveenAndSDET.SDET;

public class MethodAndCalculator {

    /*
    case1. not taking any parameters and also not returning any value
    case2. not taking any parameters but returning a value
    case3. taking any parameters but not  returning any value
    case4. method is  taking  parameters and also returning a value */

    int x=10;
    int y=20;
    /*void sum() { /// CASE 1 ot taking any parameters and also not returning any value
        System.out.println(x+y);

    }*/
    /*int sum() { /// CASE 2  since void doesnt return anything, we will switch void with int
        return (x + y);*/


    /*void sum(int a, int b) { /// CASE 3 taking any parameters but not  returning any value
        System.out.println(a+b);
    }*/

    int  sum(int a, int b) { /// CASE 4 method is  taking  parameters and also returning a value
        return (a+b);

    }





    public static void main(String[] args) {
        MethodAndCalculator cal =new MethodAndCalculator();
        //cal.sum();// case1 not taking any parameters and also not returning any value
        /*int result=cal.sum(); case 2 not taking any parameters but returning a value
        System.out.println(result);// 30
        System.out.println(cal.sum());//30*/

       // cal.sum(100, 200);// CASE 3 taking any parameters but not  returning any value

        cal.sum(100, 200); // case4
    }
}
