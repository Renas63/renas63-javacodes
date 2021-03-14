package StringBuilderPR;

public class BuilderIntro {
    public static void main(String[] args) {
        StringBuilder success=new StringBuilder().append("Techtorial").append("2021");
        success.append(" Best year ever. ").append(19).append(true);
        System.out.println(success);
        String str="";
        str.concat("techtorial").concat(" 2021");
        System.out.println(str); // string is immutable will not change unless we reassign
        StringBuilder words=new StringBuilder().append("I love you ").append("Java");
        words.append(" it is the best language");
        StringBuilder truth =words.append(" it is hard");
        System.out.println(words);
        System.out.println(truth);
        String test="Techtorial";
        String result= test.concat(" Academy");
        System.out.println(test);
        System.out.println(result);
    }
}


