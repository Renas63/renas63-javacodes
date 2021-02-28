package Homework.Homework2;

public class Homework2Task6Bob {
    public static void main(String[] args) {
     /*
     Description
        Bob’s company following formula to calculate the annual bonus amount.
     Bob is earning 200K a year.
      Company is applying 5 percent bonus for 50 percent of the salary, 8 percent bonus for 30 percent of the salary
      and finally 10 percent of bonus 20 percent of the salary. Write the code to calculate the bonus amount for Bob.
      If I want to calculate the bonus amount for another person,
      I should be able to change the salary and it should display the bonus amount.
      */


        double salary=200000.00;

        double bonus1=(salary/2)*0.05;

        double bonus2=(salary*0.3)*0.08;

        double bonus3=(salary*0.2)*0.1;

        double totalBonus=bonus1+bonus2+bonus3;

        System.out.println("bonus1 " +bonus1);
        System.out.println("bonus2  " +bonus2);
        System.out.println("Bonus " +bonus3);
        System.out.println("Total Bonus " + totalBonus);

        /*Company is applying 5 percent bonus for 50 percent of the salary, 8 percent bonus for 30 percent of the salary
      and finally 10 percent of bonus 20 percent of the salary. Write the code to calculate the bonus amount for Bob.
      If I want to calculate the bonus amount for another person,
      I should be able to change the salary and it should display the bonus amount.
         */

       int BobSalary= 200000;
       int fifthP= BobSalary*50/100;
        //System.out.println(fifthP);
         int FirstB= fifthP*5/100;
        //System.out.println(FirstB);

        int SecondP=BobSalary*30/100;

        int SecondB=SecondP*8/100;

        int ThirdP=BobSalary*20/100;
        int ThirdB=ThirdP*10/100;

        int totalB= FirstB+SecondB+ThirdB;
        System.out.println(totalB);




    }
}
