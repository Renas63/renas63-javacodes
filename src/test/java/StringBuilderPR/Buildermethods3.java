package StringBuilderPR;

public class Buildermethods3 {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Apple");
        builder.reverse();
        System.out.println(builder);
        String fruit= builder.toString();

        builder.replace(0, 2, "Test");
        System.out.println(builder);

        builder.replace(0, builder.length(),"Techtorial");
        System.out.println(builder);

        System.out.println(fruit.replace("k","a"));
        System.out.println(fruit);

        StringBuilder bl= new StringBuilder("outer");
        bl.replace(1,2,"a");
        System.out.println(bl);
    }
}