package ArrayConcept;

public class CharArray {
    public static void main(String[] args) {
        /*
        TASK; Create the char array wit given values
        a, r, 4,2,w, 8
        print only the numbers from given array
         */
        char ch[]={'a','r', '4','2','w','8'};
        for (int i = 0; i < ch.length; i++) {
                                            //if(Character.isDigit(ch[i])){
            if(ch[i]>=45 &&ch[i]<=57 ){
                System.out.println(ch[i]);
            }

        }
    }
}
