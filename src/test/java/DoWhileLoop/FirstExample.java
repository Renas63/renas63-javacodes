package DoWhileLoop;

public class FirstExample {
    public static void main(String[] args) {
        // want to print " Chicago" 5 times using do while loop

        int count=6;
        do{
            System.out.println("Chicago");// even tho the condition is false , it will run at least 1 time!!!!
            count++;/// INC/ DECREMENT HAVE TO BE  INSIDE THE DO WHILE!
        }while(count<=5);

        System.out.println(count);// count will be 7

        int num=6;
        while(num<=5){
            System.out.println("Des Plaines");// it will not be a output
            num++;
        }
        System.out.println(num);// num will be 6 cuz, while condition is false!

        // INC/ DECREMENT HAVE TO BE  INSIDE THE DO WHILE!
    }
}
