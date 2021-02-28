package Objects;

import java.util.Scanner;

public class BankAmerica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bank of America");
        System.out.println("What is Your name?");
        String name= input.next();
        System.out.println(name + "Please select one of the instructions.");

        BankAccount david= new BankAccount();
        david.getInstruction();
        int exit=-1;
        do{
            int option= input.nextInt();
            switch(option){
                case 0:
                    System.out.println("please enter your name");
                    String personName= input.next();
                    System.out.println(" please enter your account number");
                    String accountNum= input.next();
                    System.out.println("please enter your balance");
                    int balance= input.nextInt();
                    System.out.println("please enter your username");
                    String username= input.next();
                    System.out.println("please enter your password");
                    String password=input.next();
                    david.signUp(personName, accountNum,balance,username,password);
                    break;
                case 1:
                    System.out.println("please enter username");
                    String username1=input.next();
                    System.out.println("please enter your password: ");
                    String password1= input.next();
                    david.login(username1, password1);
                    break;

                case 4:
                    david.display();
                    break;

                case 6:
                    exit=6;
                    break;
                case 2:
                    System.out.println("What is your  deposit amount");
                    double deposit1=input.nextDouble();
                    david.deposit(deposit1);
                    break;
                case 3:
                    System.out.println("What is your withdraw amount");
                    double withdraw1= input.nextDouble();
                    david.withdraw(withdraw1);
                    break;

                    case 5:
                        david.getInstruction();
                        break;

            }
            System.out.println("Please elect one of the instructions. To print instructions enter 5");
            // Implement deposit withdraw and print instructions functionality.
        }while(exit!=6);
        System.out.println("Thank you for ");

    }
}
