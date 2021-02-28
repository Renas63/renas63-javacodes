package ArrayConcept;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
    long [] numbers={10,5,11,3, 45, 34};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        String[] names={"Olivia","David","Priyanka", "Gopal"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        String[] nums={"100", "10", "11", "10100"};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//  Result will be : 10, 100, 10100, 11



    }
}
