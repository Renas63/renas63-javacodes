package TernaryAndSwitch;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" please enter 1 for sedan, 2 for SUV, 3 for sport, 4 for cross breed");
        int num= input.nextInt();
        switch(num){// SWITCH WE CAN NOT PUT A CONDITIONS
            case 1:
                System.out.println("sedan"); break;

            case 2:
                System.out.println("SUV"); break;

            case 3:
                System.out.println("sport");break;
            case 4:
                System.out.println("cross breed"); break;

            default:
                System.out.println("not any car"); break;

        }
    }
}
