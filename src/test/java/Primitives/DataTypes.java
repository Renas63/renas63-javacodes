package Primitives;

public class DataTypes {

    public static void main(String[]args){

        byte num=-128;
        // if you try to store more than byte value capacity
        // it will give a compile time error

        short num1=32000;

        int num2=2000000000;

        // for "long" values we need to give 'l' or 'L' at the end of the number
        long num3=34679236790l;

        System.out.println(num3);

     float num4=3.4f;
        System.out.println(num4);
     float num5=4;
        System.out.println(num5);
        double num6=5.9;
        double num7=9;
        System.out.println(num6);
        System.out.println(num6+num7);





        char letter= 'A';
        char symbol='#';
        System.out.println(letter);

        int letterNum=letter;
        System.out.println(letterNum);

     char anyLetter='7' ;
        System.out.println(letterNum);


        boolean isLightOn= true;
        boolean isMicOn=false;
        boolean isEqual=10==10;
        System.out.println(isEqual);

        // To find out the Exact size of int,
        //we use that formula:
        // System.oit.println(Integer.MAX_VALUE);
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        int a = 21, b= 6; // we can get the result as a double if we can double!
        double answer= a/b;
        System.out.println(answer);
        // QUESTION
        //we have 93 marbles and 5 kids. give each child 18 marbles. how many marbles will be left?
        int numChildren=5;
        int numMarble=93;
        int marblePerChild=18;
        int marbleLeft= numMarble%numChildren;
        marblePerChild=numMarble/numChildren;
        marbleLeft=numMarble%numChildren;
        System.out.println("give each child " +marblePerChild + "numMarble.");
        System.out.println(" you will have "  + marbleLeft+ " marbles left over.");


    }

}
