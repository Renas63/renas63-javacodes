package StringBuilderPR;

public class BuilderMethods2 {

    public static void deleteLtter(String str){
        StringBuilder builder= new StringBuilder(str);

        for (int i = 0; i <builder.length(); i++) {
            if(builder.charAt(i)=='-'){
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(builder);
    }



    public static void main(String[] args) {

        String str="lksjdfg-kladjfg-gj5-sdfg";
        deleteLtter(str);
    }
}