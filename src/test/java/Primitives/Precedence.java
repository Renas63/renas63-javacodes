package Primitives;

public class Precedence {
    public static void main(String[] args) {

        int count= 10*3+4%3-8*2;
        /*
        30+1-16 =15
        multiplication * and % (remainder) will be executed first
        if we have same level precedence, it will executed left to right
        put parenthesis to be able to change the precedences
         */
        System.out.println(count);


        int count1= 10*(3+4)%((3-8)*2);
        System.out.println(count1);


        int count2= (6+3-4)*((3+9)%2)/2;
        //(5)*0/2= 0


    }
}
