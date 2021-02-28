package ArrayConcept;

import java.util.Arrays;

public class MultiDimArray {
    public static void main(String[] args) {

        double [][] prices= new double[3][4];

        // [ []  [] []  ]
        prices[0][0]=3.7;
        prices[0][1]=2.9;
        prices[0][2]=5.4;
        prices[0][3]=4.8;
        prices[2][1]=20;
        prices[1][3]=11;
        prices[2][3]=18.9; // last array last index
        System.out.println("number of rows: "+prices.length);
        System.out.println("Number of colums: " +prices[0].length);
        for (int i = 0; i < prices.length ; i++) {

            for (int j = 0; j <prices[i].length ; j++) {

                System.out.println(prices[i][j]);

            }
        }

        System.out.println("**********************************");
              for(double renas []:prices) {
                    for(double i:renas)  {
                        System.out.println(i);
                    }
              }

    }
}
