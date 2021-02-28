package FrequentlyAsked;

public class RemoveJunk {
    public static void main(String[] args) {
        String s=" &#$.;, ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â latin string -123456789";

        String s1="@#$%^&*())@#$%^ testing @#$%^ Selenium @#$%^&*() Java ";

        s=s.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(s);
        s1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);
    }
}

