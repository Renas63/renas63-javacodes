package StringBuilderPR;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder numbers= new StringBuilder("FG56JF8AE8WRTUJ56758SDFK9SF5");
        // create one method that will return sum of digits from stringbuilder object.
        // this  method will ake one param asa a Stringbuilder
        System.out.println(sumOfDigits(numbers));
    }
// if(ch>=48 && ch<=57)
    //2.if(ch>'0' && ch<'9')
    //3. if(Character.isDigit)
    //how to convert chat to string
    //1.""+char
    //2.String.ValueOf(char)
    //3 How to convert string to int---> Integer.ParseInt(String)


    public static int sumOfDigits(StringBuilder sb){
        int sum= 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch= sb.charAt(i);
            if(Character.isDigit(ch)){
                String c= String.valueOf(ch);
                int num= Integer.parseInt(c);
            sum+=num;
            }
        }
        return sum;
    }

}
