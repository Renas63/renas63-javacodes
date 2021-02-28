package ForLoop;

public class MultipleTerms {
    public static void main(String[] args) {
        for(int i=0, k=10; i<5 && k>3;i++, k--){

            System.out.print(i+" ");//0 1 2 3 4
            System.out.println(k);//10 9 8 7 6
        }

        for(char ch='a'; ch<'z'; ch++){
            System.out.println(ch);
        }
    }
}
