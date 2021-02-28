package Homework.Homework3;

public class Homework3Task1 {
    public static void main(String[] args) {
/*

    int k=7;
i   nt n=3;
    int result=k++ * ++n / ++n % k + n - k++;
    int $result= k + k++ * k - n++ % n + ++n;
    Please write the pseudoCode with explanation which operation will be
    executed first, in every step what will be the value of k and n.
    At the end explain what will be the final values for n, k and result. NOTE: please write pseudoCode,
    I don’t want directly the solution.

 */
        int k=7;
        int n=3;
        int result=k++ * ++n / ++n % k + n - k++;
        // k= 8-----> 6*4/ 5%8+5-8
        // n=5
        //int result= 24/5%8+5-8
        // int result = 4%8+5-8
        // int result=4+5-8
        //int result=1
        int $result= k + k++ * k - n++ % n + ++n;
        // k=8
        // n=5
        // int $result= 7+7*8-3%4+5
        // int $result= 7+56-3+5
        // int $result=65

        System.out.println(result); // 2
        System.out.println($result);//101


    }
}
