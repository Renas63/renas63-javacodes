package Homework.Homework3;

public class Homework3Task6David {
    public static void main(String[] args) {
 /*
    David wants to lose the 10 kg in one month.
    There are multiple condition to lose the 10 kg in month.
    David needs to walk 10000 steps a daily or needs to run 4 miles a day additional to those
    David needs to eat less than 1500 calories daily.
    Create the application that calculate the given parameter and
    will print the true if David is able to lose 10 kg in one month.
  */

        int dailySteps=10_000;
        int dailyRun=4;
        int dailyCal=1500;

        int davidStep=9000;
        int davidRun= 3;
        int davidCal=2000;

        boolean loseWeight=davidStep>=10000 || davidRun>=4 && davidCal>=1500;
        System.out.println("David is able to lose 1o kg  in a month " + loseWeight);

    }
}
