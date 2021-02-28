package Homework.Homework3;

public class Homework3Task5 {
    public static void main(String[] args) {
        /*
        to be able to pass the class we need to have 65 score from the exams
        and we need to attend the 80 percent of all the classes.
        To calculate the average score we need to take take 20 percent of first exam score and
        30 percent of second exam score and 50 percent of third exam score.
        We need to create three variable for exam scores and one variable for attendance for the classes.
        If all conditions are met, print true at the end.

         Example: exam1=80; exam2=70; exam3=50; attendance=80 Output:
Can I pass the class? --> false




         */

           /* int score= 65;
            int attendance= 80;

            int exam1=80*20/100;
            int exam2=70*30/100;
            int exam3=50*50/100;
            int averageScore=(exam1+exam2+exam3)/3;

            boolean pass=averageScore>=65 && attendance>=80;
        System.out.println("Can I pass the class " + pass);
        /*

         Example:
        exam1=80;
        exam2=70;
        exam3=70;
        attendance=60 --> it should be more than or equals to 80 Output:
        Can I pass the class? --> false
         */
        int score= 65;
        int attendance=80;

        int exam1=80*20/100;
        int exam2=70*30/100;
        int exam3=70*50/100;
        int averageScore=(exam1+exam2+exam3)/3;
        System.out.println(averageScore);

        boolean pass=averageScore>=65 ||attendance>=80;
        System.out.println("Can I pass the class " + pass );





    }
}
