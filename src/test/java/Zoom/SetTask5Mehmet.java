package Zoom;

import java.util.*;

public class SetTask5Mehmet {

       /*
1)create a method that will accept an int parameter will generate random
numbers(0-9) as the count of the int parameter. Add them into an ArrayList.
2)Using Collections print the duplicate values.
 */

        public static void duplicate(int quantity) {

            ArrayList<Integer> arr = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < quantity; i++) {
                int number = random.nextInt(10);

                arr.add(number);

            }

            System.out.println(arr);

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i <arr.size() ; i++) {

                if (set.contains(arr.get(i))) {

                    System.out.println(arr.get(i));
                } else {
                    set.add(arr.get(i));
                }



            }

            System.out.println(set);

        }


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter a number ");

            int number = input.nextInt();

            duplicate(number);

        }

    }


