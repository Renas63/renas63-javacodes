package StringExample;


import java.util.Scanner;

public class yourNameTask {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("please provide your personal information\t:"+ " " + "\n(Gender -yourfullname - DOB)" );

            String info = input.nextLine();
        System.out.println(info.startsWith("F"));
        System.out.println(info.startsWith("M"));
        System.out.println(info.contains("David"));
        System.out.println(info.endsWith("1998"));
        // those all returns boolean
    }
}
