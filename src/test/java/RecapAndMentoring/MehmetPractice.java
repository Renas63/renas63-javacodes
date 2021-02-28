package RecapAndMentoring;

public class MehmetPractice {
    public static void main(String[] args) {
        String name = "mustafa";
        for (int i = 0; i <name.length(); i++) {

            if(name.charAt(i)=='a' || name.charAt(i)=='A' ){
                break;
            }
            System.out.println(i + " ");
        }
    }

}