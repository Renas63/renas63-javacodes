package IfStatements;

public class IfBlocks {
    public static void main(String[] args) {
        int num = 0;
        int x = 6;
        int y = 5;

        if (x > y) {
            num = 6;
            System.out.println(num);
        }
        System.out.println(num);


        int num1 = 1;
        System.out.println(num1);//  compile time error
         // local variables dont take any default values
        int k = 6;
        int r = 6;
        if (k == r) {
            num1 = 9;
            System.out.println(num1);
        }
        System.out.println(num1);// compile time error if we dont give a value to num1!!!

        int num2;
        if(5==5){
            num2=77;

        }
        System.out.println(num2);





    }
}
