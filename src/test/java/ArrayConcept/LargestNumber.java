package ArrayConcept;

public class LargestNumber {
    public static void main(String[] args) {
        int []numbers ={600, 45, 367, 23, 97};// find the largest and smallest number
        int biggest=numbers[0];
        for (int i = 1; i <numbers.length; i++) {
            if(numbers[i]>biggest){

                biggest=numbers[i];
            }
        }
        System.out.println(biggest);
    }
}
//    int []numbers ={600, 45, 367, 23, 97};// find the largest and smallest number
//    int smallest=numbers[0];
//        for (int i = 1; i <numbers.length; i++) {
//        if(numbers[i]<smallest){
//
//        smallest=numbers[i];
//        }
//        }
//        System.out.println(smallest);
//        }
//        }