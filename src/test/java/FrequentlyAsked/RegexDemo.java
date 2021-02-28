package FrequentlyAsked;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexDemo {
    public static void main(String[] args) {

     /*String text ="773#012*3456";
        String regex ="\\w\\w\\w";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher =pattern.matcher(text);
        boolean result=matcher.matcher.*/

        String text = "techtorial_academy@bing.com";
        //String regex = "[A-Z]+"; // it is finding if above test contains capital letters from A-Z
        //String regex = "[0-9A-Za-z]+";//it is finding if above test contains capital letters from A-Z, numbers or lower case
        //String regex = "[A-Za-z0-9%-_.%!]+@bing.com"; // check e-mail with bing.com at the end
        String regex = "[A-Za-z0-9%-_.%!]+@[A-Za-z._-]+\\.[A-Za-z]{2,4}";

        //contains.  dot then A-Z and a-z with 2-4 character long
        //  "\\" in string btw @ and . if is any special character java will skip those


        //\w -non- word character(NO number, letter and underscore)
        //\w-word character (any number, letter and underscore)
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String str= "Techtorial"; // in string btw @ and . if is any special character java will skip those

        System.out.println();

        boolean result = matcher.matches();
        System.out.println(result);




    }
}





