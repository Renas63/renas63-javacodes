package Objects;



public class Math {

    public void square(int number) {// int number is a parameter!!!

        System.out.println(number * number);
        // if you want to make a changes
        // on math class, we have make a changes on object class

        // since void doesn't return anything, we dont need a return statement
    }

    public int sum(int num1, int num2) {

        return num1 + num2;// since return type of sum is int, we need to have a return statement!

        // after return we can not do sout or anything else.

    }

    public void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public int sum(int[] numbers) {
        // numbers={3,4,5,6,7,7}
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static int sumNum(int...numbers){ //... varargs is also Array.
        Math math= new Math();
        int result= math.sum(numbers);

        return result;
    }

    public double  rectangleArea(double width, double length){
        double result= length*width;
        return result;
    }
}
