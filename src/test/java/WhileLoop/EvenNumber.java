package WhileLoop;

public class   EvenNumber {
    public static void main(String[] args) {
        int number=20;

        while(number<=30){

            if(number%2==0) {
                System.out.println(number);
            }
            number++;// WE HAVE TO PUT number++ OUTSIDE OF IF STATEMENT, OTHERWISE, IT WONT INCREASE THE NUMBER!!!!
        }
        System.out.println("***************************");
        // if the number is even number, print it
        //System.out.println(number);


        }
    }

