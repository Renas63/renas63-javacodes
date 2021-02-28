package Objects;

public class MathTest {
    public static void main(String[] args) {
        Math execute= new Math();
        execute.square(6);
        execute.square(12);
        execute.square(123);
    //if you want to make a changes
    // on mathtest class, we have make a changes on object class

        System.out.println(execute.sum(10,25));

        int result= execute.sum(11,45);
        System.out.println(result);


        double test=execute.rectangleArea(5.8,3.2);

        System.out.println(test);

        execute.sum(12, 34, 56);

        int num[] ={4,5,6,7,8,9};
        int sumResult=execute.sum(num);
                                             //System.out.println(execute.sum());
        System.out.println(sumResult);
    }
}
