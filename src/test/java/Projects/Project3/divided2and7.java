package Projects.Project3;

import java.util.Scanner;

public class divided2and7 {
    public static void main(String[] args) {
        /*
        Using the scanner asks the user to input the min and max number.
         Write a java code that will calculate the sum of numbers between
          the range of min and max and those that can only be divided by 2 and 7.
(min and max numbers are included) Example:
0, 50 -> 14 + 28 + 42 = 84
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter min number");
        int min= input.nextInt();
        System.out.println(" P lease enter a max number");
        int max= input.nextInt();

        int sum=0;
        String result=" ";

        for(int i=1; min<=max; min++){
            if(min%2==0&& min%7==0 && min !=0){
                System.out.println(min);
                result+=min+" + ";
                sum+=min;
            }

            }
        System.out.println(result.substring(0,result.length()-1)+ " = " +sum);
        }
    }

