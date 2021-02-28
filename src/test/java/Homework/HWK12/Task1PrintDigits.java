package Homework.HWK12;

public class Task1PrintDigits {
    /*
    Create one method that will take as a String and will print all the digits from String.
Example:
String str="Java1is2best3coding4language5";
Output: 12345

     */
    String str= "Java1is2best3coding4language5";
    public   void printNumber(){

        for (int i = 0; i <str.length(); i++) {
            char ch= str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.print(ch+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Task1PrintDigits result= new Task1PrintDigits();
        result.printNumber();
    }

}
