package Homework.HWK12;

public class ElaTask1 {

//Create one method that will take as a String and will print all the digits from String.
    //Example:
    //String str="Java1is2best3coding4language5";
    //Output: 12345
    public static void printDigits(String str){
        System.out.println(str.replaceAll("[^0-9]",""));
    }

    public static void main(String[] args) {
       printDigits("Java1is2best3coding4language5");
    }
}
