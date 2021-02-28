package WhileLoop;

public class PrintStar {
    public static void main(String[] args) {

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        //
        String star="*";// interview question
        int num=1;
        while(num<=5){
            System.out.println(star);
            star=star.concat("*");// WE HAVE TO REASSIGN STAR BECAUSE STRING IS IMMUTABLE!!!!
            num++;
        }
    }
}
