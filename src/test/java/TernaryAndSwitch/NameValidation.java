package TernaryAndSwitch;

import java.util.Scanner;

public class NameValidation {
    public static void main(String[] args) {
        // I have 3 students in my data type with the id of 123, 124, 125
        // Kushal city name is Chicago
        // Priyanka city name is Denver
        //Michael city name is Houston
        // ask scanner to ask id of the students
        // if id is matching ask student name. if student name is matching, print name of student
        // what is student id
        // 124
        // what is your name
        // priyanka
        // the city name is Denver

        Scanner input = new Scanner(System.in);
        System.out.println(" what is the id of student? 123, 124, 125 ");
        int id=input.nextInt();
        switch (id){
            case 123:
                System.out.println("what is your name?");
                String name=input.next();
                if(name.equalsIgnoreCase("kushal")) {
                    String cityName = input.next();
                    System.out.println("Chicago");
                }else{
                    System.out.println("wrong name!");
                    break;
                }
            case 124:
                System.out.println("what is your name?");
                String name1=input.next();
                if(name1.equalsIgnoreCase("Priyanka")) {
                    String cityName = input.next();
                    System.out.println("Denver");
                }else{
                    System.out.println("wrong name!");
                    break;
                }
            case 125:
            System.out.println("what is your name?");

            String name2=input.next();

            if(name2.equalsIgnoreCase("Michael")){

                String cityName=input.nextLine();
                System.out.println("Houston");
            }else{
                System.out.println("wrong name!");
                break;
            }
        }

    }
}
