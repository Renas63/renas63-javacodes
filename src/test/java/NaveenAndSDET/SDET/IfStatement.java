package NaveenAndSDET.SDET;


import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("please enter your name");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        if(name.contains("John")){
            System.out.println(" Please provide additional information like "+
                    "\n  Major"+ " " +
                    "\n  " + "Id " +
                    " \n Gender");
            String major= input.nextLine();
            String addInfo=input.nextLine();
            if(addInfo.equalsIgnoreCase("110AB")){
                System.out.println("Please provide your gender");
                String gender= input.nextLine();
                if(gender.equals("M")){
                    System.out.println("Welcome to the school " + name);
                }else{
                    System.out.println("You are not a student!");
                }
            }else{
                System.out.println("Please provide right info");
            }

            }else{
            System.out.println("The name doesnt match our record ");
        }
        }

    }
