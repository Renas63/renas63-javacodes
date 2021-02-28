package Exceptions;

public class HandleException {
    public static void main(String[] args) {

        String str = "12a"; // "12a";
        try {
            int num = Integer.parseInt(str);// reversing string to integer


            System.out.println(num);//---> NumberFormatException
            int number = 5 / 0;// ArithmeticException

        } catch (ArithmeticException nm) { // we can just use (Exception or Throwable ) too
            System.out.println("There is illegal argument in the input string");
        }catch (NumberFormatException num){
            System.out.println(num.getStackTrace());
            System.out.println("Number format exception");
            int num1= Integer.parseInt(str.replace("a",""));// we handled the problem and gave a explanation

            System.out.println(num1);

        }catch (Exception e){
            System.out.println("aaa");  // --> this is the Parent Catch
        }finally {
            System.out.println();
        }

        System.out.println("This is test of Exception in java");
        //NOTE: Only one catch block will be displayed!!!
        // NOTE: Inside the catch () we can just use (Exception or Throwable and it will cover all exception
    }
}
