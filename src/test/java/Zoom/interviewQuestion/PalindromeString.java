package Zoom.interviewQuestion;

public class PalindromeString {

    public static void palindrome(){
        String str= "Civic";
        String reversed="";
        for(int i=str.length()-1; i>=0; i--){
            reversed= reversed+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Given String is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome();
    }
}
