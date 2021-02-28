package RecapAndMentoring.PracticePackage;

public class BobBonus {
    public static void main(String[] args) {

        /*
        Company is applying 7 percent bonus for 50 percent of the salary, 12 percent bonus for 30 percent of the salary
      and finally 10 percent of bonus 20 percent of the salary. Write the code to calculate the bonus amount for Bob.
      If I want to calculate the bonus amount for another person,
      I should be able to change the salary and it should display the bonus amount.
         */
        /* int salary= 200000;

        double bonus1=salary/2;
            bonus1=bonus1*0.07;

         double bonus2=salary*0.3;
                bonus2=bonus2*0.12;

           double bonus3= salary*0.2;
                bonus3=bonus3*0.1;
            double totalBonus=bonus1+bonus2+bonus3;

        System.out.println("Bob salary is " + salary);
        System.out.println("Bonus1 " +  bonus1);
        System.out.println( "Bonus2 " + bonus2);
        System.out.println( "Bonus3 " + bonus3);

        System.out.println(totalBonus);

         */

         int salary = 200000;
         double bonus= ((salary/2)*0.07) + ((salary*0.3) *0.12) + ((salary*0.2)*0.1);

        System.out.println("bonus "  + bonus);
        System.out.println("Bob Salary "+ salary);








    }
}
