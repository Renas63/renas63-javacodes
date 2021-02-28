package ForLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        long [] numbers={12,23,45,21,57, 65, 91};
        for(long num:numbers){
            if(num>=50&& num<=80)

            System.out.println(num);

        }
        String [] brand={ "Microsoft", "Apple", "Motorola", "Gucci", "Prada"};
        for(String br:brand){
            if(br.toLowerCase().startsWith("g"))
            System.out.println(br);
        }
    }
}
