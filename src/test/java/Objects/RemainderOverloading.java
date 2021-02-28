package Objects;

public class RemainderOverloading {
    public int remainder(int number){
        return number%2;

    }
//    public long remainder(int number) { THIS IS NOT A METHOD OVERLOADING! BECAUSE ITS SAME NAME AND SAME PARAMETERS
//        return number % 2;
  //  }

    public long remainder(int  num, long divisor){ // compile time error due to numeric promotion. To overcome this issue
                                                 // we can either do explicit casting or change the method name to long.
        return num%divisor;                 // METHOD TYPE IS NOT IMPORTANT
    }

    public int remainder ( long num){

        return (int)num%2;
    }

    public long remainder (long num, int divisor){
        return num%divisor;
    }

    //2%5---> 2
    //2/5--->0

    public static void main(String[] args) {
        RemainderOverloading test= new RemainderOverloading();

        System.out.println(test.remainder(111));
        long divisor= 2;
        System.out.println(test.remainder(5,divisor));
        System.out.println(test.remainder(divisor,5));
        System.out.println(test.remainder(11,divisor));
        System.out.println(test.remainder(divisor));

    }


}
