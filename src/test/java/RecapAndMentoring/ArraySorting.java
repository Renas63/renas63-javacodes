package RecapAndMentoring;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int [] numbers={10,32,21,47,55,60};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] names={"Katie", "Pam","John", "Dustin","Kim"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        String [] nums={"1","4","2","5","90","32"};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
