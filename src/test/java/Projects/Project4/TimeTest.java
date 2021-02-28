package Projects.Project4;

import java.util.Scanner;

public class TimeTest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println(" ******Welcome****** ");
            System.out.println("Please enter a number baby");

            Time time= new Time();
            Time date= new Time();
            Time timeAndDate= new Time();

            int exit = -1;

            do {

                int number= input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println(" create a time");

                        break;
                    case 2:
                        System.out.println("create a date");
                        number= input.nextInt();
                        break;
                    case 3:
                        System.out.println(" create date and a time");
                        number= input.nextInt();
                        break;
                    case 4:
                        System.out.println("enter hour to update a time");
                        time.setHours( input.nextInt());
                        System.out.println("enter minute to update a time");
                        time.setMinutes(input.nextInt());
                        System.out.println("enter second to update a time");
                        time.setSeconds(input.nextInt());
                        break;
                    case 5:
                        number= input.nextInt();
                        System.out.println(" update date");
                        break;
                    case 6:
                        number= input.nextInt();
                        System.out.println(" print time information");
                        break;
                    case 7:
                        number= input.nextInt();
                        System.out.println(" print date information");
                        break;
                    case 8:
                        number= input.nextInt();
                        System.out.println(" print  date and a time information");
                        break;

                    case 9:
                        exit = 9;
                        break;
                }
            } while (exit != 9);
            System.out.println("Thank you and happy new year baby");

        }

    }

