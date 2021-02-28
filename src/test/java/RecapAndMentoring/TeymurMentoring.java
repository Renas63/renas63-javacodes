package RecapAndMentoring;

public class TeymurMentoring {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(task1(new int[] {2,7,11,15}, 9)));
//        System.out.println(Arrays.toString(task1(new int[] {3,2,4}, 6)));
//        System.out.println(Arrays.toString(task1(new int[] {3,3}, 6)));
//        System.out.println(Arrays.toString(task1(new int[] {3,4}, 6)));

//        System.out.println(task2("babad"));
//        System.out.println(task2("cbbd"));
//        System.out.println(task2("a"));
//        System.out.println(task2("ac"));

        fizzBuzz(25);
    }

        /*
     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.
     You can return the answer in any order.

     Example 1:
     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     Example 2:
     Input: nums = [3,2,4], target = 6
     Output: [1,2]
     Example 3:
     Input: nums = [3,3], target = 6
     Output: [0,1]
     Input: nums = [3,4], target = 6
     Output: []
      */

    public static int[] task1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int q = i + 1; q < nums.length; q++) {
                if (nums[i] + nums[q] == target) {
                    return new int[]{i, q};
                }
            }
        }

        return new int[0];
    }

        /*
        Given a string s, return the longest palindromic substring in s.

        Example 1:
        Input: s = "babad"
        Output: "bab"
        Note: "aba" is also a valid answer.
        Example 2:
        Input: s = "cbbd"
        Output: "bb"
        Example 3:
        Input: s = "a"
        Output: "a"
        Example 4:
        Input: s = "ac"
        Output: "a"
         */

        // babad
        //b
        //ba
        //bab
        //baba
        //babad

        //a
        //ab
        //aba
        //abad

        //b
        //ba
        //bad

        //a
        //ad

        //d

    public static String task2(String s) {

        if (s.length() < 2) {
            return s;
        }

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int q = i + 1; q < s.length(); q++) {
                String current = s.substring(i, q);
                result = (isPalindrome(current) && result.length() < current.length()) ? current : result;
            }
        }

        return result;
    }
        //w | e | r | e | r | e | w |
        //0 | 1 | 2 | 3 | 4 | 5 | 6 |
        //
        // w == w / 0 == 6 = 7 - (0 + 1)
        // e == e / 1 == 5 = 7 - (1 + 1)
        // r == r / 2 == 4
        // e == e / 3 == 3
        // 4 == 2

        //w | e | r | r | e | w |
        //0 | 1 | 2 | 3 | 4 | 5 |
        //
        // w == w / 0 == 5 = 6 - (0 + 1)
        // e == e / 1 == 4 = 7 - (1 + 1)
        // r == r / 2 == 3
        // e == e / 3 == 2
        // 4 == 2
    public static boolean isPalindrome(String str) {

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - (i + 1))) {
                return false;
            }
        }

        return true;
    }

        /*FizzBuzz
        25
        0->25
        3 -> Fizz
        5 -> Buzz
        3 &&  5 -> FizzBuzz
         none -> print number
        */

    public static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {

//            if(i%15 ==0) {
//                System.out.println("FizzBuzz");
//            } else if (i%5 == 0) {
//                System.out.println("Buzz");
//            } else if(i%3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }

//            String answer = (i % 15 == 0) ? "FizzBuzz" : (i % 5 == 0) ? "Buzz" : (i % 3 == 0) ? "Fizz" : "" + i;
            System.out.println((i % 15 == 0) ? "FizzBuzz" : (i % 5 == 0) ? "Buzz" : (i % 3 == 0) ? "Fizz" : ""+ i);
        }
    }





}
