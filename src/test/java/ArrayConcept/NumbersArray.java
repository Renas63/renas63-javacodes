package ArrayConcept;

public class NumbersArray {
    public static void main(String[] args) {
        /*
        ASK: create the numbers array with the following numbers
{10,20,80,25,45,28,9,15} using loop print only the number which is bigger than 20.
         */
        int[] numbers = {10, 20, 30, 25, 45, 28, 9, 15};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 20) {
                count++;

                System.out.println(numbers[i]);

            }

        }
        System.out.println("The total count of numbers is:"+count);
    }
}
