package ArrayConcept;


public class ProductsARRAY {
    public static void main(String[] args) {
        /*
        Products:
computer --> Apple, Microsoft, Google
phone    --> Apple, Samsung, Huawei
speaker  --> Boss, LG, Beats
Prices:
computer --> 1250.0, 850.9, 590.99
phone    --> 1000.99, 899.9, 650
speaker --> 359.0, 299.00, 499.99
         */
        String products[] []= new String [3][3];
        products[0][0]="Apple";
        products[0][1]="Microsoft";
        products[0][2]="Google";
        products[1][0]="Apple";
        products[1][1]="Samsung";
        products[1][2]="Huawei";
        products[2][0]="Boss";
        products[2][1]="LG";
        products[2][2]="Beats";

        double [][] prices={{1250.0, 850.9, 590.99},
                            {1000.99, 899.9, 650},
                             {359.0, 299.00, 499.99}};


        for (int i = 0; i <products.length ; i++) {
            String result="";
            for (int j = 0; j < prices[i].length ; j++) {
                result+=(products[i][j]+ "( " + prices[i][j] + ")"  );

            }
            switch (i){
                case 0:
                   result="Computer--->" +result;
                   break;
                case 1:
                    result="Phone--->"+result;
                    break;
                case 2:
                    result="Speaker--->" +result;
            }

            System.out.println(result);
        }

    }

}
