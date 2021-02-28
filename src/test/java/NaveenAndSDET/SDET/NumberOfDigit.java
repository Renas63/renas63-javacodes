package NaveenAndSDET.SDET;

public class NumberOfDigit {
    public static void main(String[] args) {
        int num= 234572;
        int count=0;
      /*  while(num!=0){
        //num=num/10
            num/=10;
            ++count;
        }
        System.out.println("Number of digits: "+count);
        */
        for(;num!=0;num/=10,++count){

        }
        System.out.println("Number of digits: "+ count);
    }
}
