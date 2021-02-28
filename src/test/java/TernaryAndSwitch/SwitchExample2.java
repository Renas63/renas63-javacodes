package TernaryAndSwitch;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to input two int values and
         ask the name of the operator like multiple, divide, module, substract, addition
if the operator name is matching then apply given operator to the these two number
please enter first num:
30
Please enter second num:
10
what is operator name?
Multiple
OUTPUT
300
Example 2
please enter first num:
25
Please enter second num:
16
what is operator name?
addition
OUTPUT
41
         */

        Scanner input= new Scanner(System.in);
        System.out.println(" please enter first number");
        int num1=input.nextInt();
        System.out.println(" please enter second number");
        int num2= input.nextInt();
        System.out.println(" what is your operator name?");
        String operator= input.next();// multiple, division, module, subtract, add

            switch(operator){

                case "Mutiply":
                    System.out.println(num1*num2); break;
                case "division":
                    System.out.println(num1/num2); break;
                case "module":
                    System.out.println(num1%num2); break;
                case "subtract":
                    System.out.println(num1-num2); break;
                case "add":
                    System.out.println(num1+num2); break;

                default:
                    System.out.println("Wrong operator number");


            }

        }





    }
