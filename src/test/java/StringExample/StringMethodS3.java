package StringExample;



public class StringMethodS3 {
    public static void main(String[] args) {

        String brand="microsoft";
        brand=brand.toUpperCase();
        System.out.println(brand);

        brand=brand.toLowerCase();
        System.out.println(brand);

        brand=brand.toLowerCase();
        System.out.println(brand);

        System.out.println(brand.startsWith("mic"));
        boolean result =brand.startsWith("icro");
        System.out.println(result);

        boolean result2=brand.endsWith("ft");

        System.out.println(result2);
        boolean results=brand.equals("soft");
        System.out.println(result2);

        boolean result4=brand.equalsIgnoreCase("MICROSOFT"); // ?????????
        System.out.println(result4);


    }
}
