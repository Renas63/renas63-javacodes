package ArrayConcept;

public class MissingNumber1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9};
        // from this array find a missing number
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]!=i+1){
                System.out.println(i+1);
                break;
            }

        }
//        int sum=0;
//
//        for (int i = 0; i <arr.length ; i++) {
//
//            sum+=arr[i];
//
//        }
//
//        int expectedSum=9*10/2;
//        System.out.println(expectedSum-sum);
        // 1,2,3,4,..... 19== N*(N+1)/2
    }

    }
