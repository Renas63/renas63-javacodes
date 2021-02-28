package RecapAndMentoring.PracticePackage;

public class DigitNumberTotal {
    public static void main(String[] args) {


        int num=65478;
        int num1=num%10;//8
        num=num/10; // 6547
        int num2=num%10;//7
        num=num/10;//654
        int num3=num%10;//4
        num=num/10; //65
        int num4=num%10;//5
        num=num/10; //6
        int num5=num%10;//6
        num=num/10;//6
        int total=num1+num2+ num3+num4+num5;

        System.out.println("The total of   " + total);


    }
}

