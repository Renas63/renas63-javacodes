package ForLoop;

public class InfiniteLoop {
    public static void main(String[] args) {

      //  for(;;){
       //     System.out.println("Infinite");//  it will run forever since we dont have any condition inside the for.
       // }
        int i=0;
        for(;i<10;i++){
            System.out.println("test"); // it will run 10 times
        }
        System.out.println(i);// i will be 10
    }
}
