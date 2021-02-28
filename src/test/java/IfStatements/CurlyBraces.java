package IfStatements;

public class CurlyBraces {
    public static void main(String[] args) {

        int x=5;
        int r=4;
        if(r>=x)
            x++;
           --x;
           x--;
        System.out.println(x);


   int num;
    if(x>r){
    num=6;
}
        //System.out.println(num);
        //compile time error because we didnt give a value to x. and the num

        if(10>5){
            int num1=6;

        }
       // System.out.println(num1);// since num1 is a local variable.
        // i cannot access the variable inside the if statement

    }
}

