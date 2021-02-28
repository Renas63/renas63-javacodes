package Objects;

public class MathStaticTest {
    public static void main(String[] args) {
    ;
    int [] nums={1,2,3,4,5,67};
    // We can use the array varargs but in array parameter we can not give the values directly
        // we should create the array and call the array in the parameter
        Math math= new Math();
        int sum=Math.sumNum(1,3,5,6,7);
        System.out.println(math.sum(nums));
        // every "new" word is a object!!!
        new Math().sum(nums);

    }
}
