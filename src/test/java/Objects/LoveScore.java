package Objects;

import java.time.LocalDate;
import java.util.Random;

public class LoveScore {
    /*
    create one method will takes mens ame and women name and print
    the love score between 1-100
    EX:David and Abby's love score is 78;
     */


    public void score(String  men, String women){

        Random random= new Random();
        int score=random.nextInt(101);
        System.out.println(men+ "and " +women+ "'s score is " +score);

    }
    // create a method name as a calculator and
    // it will take the year of birth and will return the age of the person


    public int calcular(int birthYear){
        int currentYear= LocalDate.now().getYear();
        return currentYear-birthYear;
    }


    public int calculator(int birthYear, int currentYear){
        return currentYear-birthYear;

    }
    // create one method will calculate and print the number of the months,
    // number of days and number of years until 90 years old
    public void calculate(int currentAge) {
        int remainYear = 90 - currentAge;
        int remainMonth = remainYear * 12;
        int dayLeft = remainYear * 365;

        System.out.println(" Year " + remainYear + " month " + remainMonth + " days " + dayLeft);
    }

    // create a method
    public boolean leapYear(int year){
        boolean isleapYear;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isleapYear=true;
                }else{
                   isleapYear=false;
                }
            }else{
                isleapYear=true;
            }
        }else{
            isleapYear=false;
        }

        return isleapYear;
    }
        // if(year%4==0|| year%400==0 && year%100 !=0)

    public static void main(String[] args) {
        LoveScore test=new LoveScore();
        test.score("David", "Abby");

     int age= test.calcular(1985);
        System.out.println(age);

        int age1=test.calculator(2000,2021);
        System.out.println(age1);

        test.calculate(35);

        boolean result= test.leapYear(1996);
        System.out.println(result);
    }
}
