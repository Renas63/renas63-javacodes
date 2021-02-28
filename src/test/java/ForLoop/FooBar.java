package ForLoop;

public class FooBar {
    public static void main(String[] args) {
        /*
        Given the number , if the number is divisible by 3
        then printout Foo text to the screen,if it is divisible by 5 then printout Bar
        if the number divisible by both 3 and 5 print out FooBar

        1. Expect the number
        check if the number is divisible by 5
        check if the number is divisible by 3
        check if the number is divisible by 3 and 5
         */
        int number=33;
        if(number % 3==0 && number %5 == 0){
            System.out.println("FooBar");

        }
        else if(number%5==0){
            System.out.println("Bar");
        }else{
            System.out.println("Foo");
        }

    }
}
