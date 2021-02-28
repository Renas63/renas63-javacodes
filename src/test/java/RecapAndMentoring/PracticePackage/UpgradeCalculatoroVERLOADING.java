package RecapAndMentoring.PracticePackage;

import java.util.Scanner;

public class UpgradeCalculatoroVERLOADING {
    public static int substriction(int a, int b) {
        return (a-b);
    }
    public static double division(int a, int b){
        return ((double)a/b);
    }
    public static int addition (int a, int b){
        return(a+b);
    }
    public static int addition(int a, int b, int c){
        return(a+b+c);
    }
    public static int multiplication(int a, int b){
        return(a*b);
    }
    public static int multiplication(int a, int b, int c){
        return(a*b*c);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String operations = "1. Addition\n"
                + "2. Substriction\n"
                + "3. Multiplication\n"
                + "4. Division";
        System.out.println("************************************");
        System.out.println(operations);
        System.out.println("************************************");

        while (true){
            System.out.println("Select Operations:");
            String operation=input.nextLine();

            if(operation.equals("q")){
                System.out.println("Exiting the program");
                break;
            }
            else if (operation.equals("1")){
                System.out.println("How many number will you use ? (2 or 3) : ");
                int totalNumber=input.nextInt();

                if(totalNumber==2){
                    System.out.print("a: ");
                    int a=input.nextInt();
                    System.out.print("b: ");
                    int b=input.nextInt();
                    input.nextLine();
                    //previous line bc of the scanner fault it will understand as a  \n(character) that's why we need to provide scanner at this line
                    System.out.println("Addition of the number:" + addition(a,b));
                }
                else if(totalNumber==3){
                    System.out.print("a: ");
                    int a=input.nextInt();
                    System.out.print("b: ");
                    int b=input.nextInt();
                    System.out.print("c: ");
                    int c=input.nextInt();
                    input.nextLine();
                    System.out.println("Addition of the number: " + addition(a,b,c));

                }    else{
                    System.out.println("There is no method for this number");
                }
            }else if(operation.equals("2")){
                System.out.print("a: ");
                int a=input.nextInt();
                System.out.print("b: ");
                int b=input.nextInt();
                System.out.println("Substriction of the number: " + substriction(a,b));
            }
            else if (operation.equals("3")){
                System.out.println("How many number will you use ? (2 or 3) : ");
                int totalNumber=input.nextInt();

                if(totalNumber==2){
                    System.out.print("a: ");
                    int a=input.nextInt();
                    System.out.print("b: ");
                    int b=input.nextInt();
                    input.nextLine();
                    //previous line bc of the scanner fault it will understand as a  \n(character) that's why we need to provide scanner at this line
                    System.out.println("Multiplication of the number:  " + multiplication(a,b));
                }
                else if(totalNumber==3){
                    System.out.print("a: ");
                    int a=input.nextInt();
                    System.out.print("b: ");
                    int b=input.nextInt();
                    System.out.print("c: ");
                    int c=input.nextInt();
                    input.nextLine();
                    System.out.println("Multiplication of the number: " + (multiplication(a,b,c)));

                }
                else {
                    System.out.println("There is no method for this number");
                }

            }else if(operation.equals("4")){
                System.out.print("a: ");
                int a=input.nextInt();
                System.out.print("b: ");
                int b=input.nextInt();
                System.out.println("Division of the number: " + division(a,b));
            }
            else {
                System.out.println("invalid operation...");
            }

        }
    }
}

