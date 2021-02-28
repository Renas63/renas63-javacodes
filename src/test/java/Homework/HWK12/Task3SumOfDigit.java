package Homework.HWK12;

public class Task3SumOfDigit {
    /*
    Create one method that will take as a String and will return the sum of all digits from String.
Example:
String str="Java1is2best3coding4language5";
Output: 15
(15 is the sum of 1+2+3+4+5 from a given string).
     */

    public static void main(String[] args) {


        String str = "Java1is2best3coding4language5";
        int sum = 0;
        String digits="";
       // public void sumDigit () {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch>='0'&& ch<='9') {
                    digits=digits+ch+ "+";
                    int number = Integer.parseInt(String.valueOf(ch));
//                System.out.println(ch+"");
                    sum = sum + number;
                }
            }
            digits= digits.substring(0, digits.length()-1);
            System.out.print(sum+ "is the sum of "+digits+ " from the given string");
        }
    }


