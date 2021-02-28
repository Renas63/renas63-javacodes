package NaveenAndSDET.SDET;

import java.util.Scanner;

public class SwitchStaGrade {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter a number ");
        int grade=input.nextInt();

        switch(grade){
            case 100:  System.out.println("A"); break;
            case 85: System.out.println("A-"); break;
            case 75: System.out.println("B+"); break;
            case 70: System.out.println("B"); break;
            case 65: System.out.println("B-"); break;
            case 55: System.out.println("C+"); break;
            case 50: System.out.println("C"); break;
            case 45: System.out.println("C-"); break;
            case 35: System.out.println("D+"); break;
            case 25: System.out.println("D"); break;
            case 0: System.out.println("D-"); break;
            default:
                System.out.println("invalid grade ");///// ask how can I use switch statement on grade????????
        }



    }
}
