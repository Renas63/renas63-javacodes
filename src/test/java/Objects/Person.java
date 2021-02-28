package Objects;

import java.util.Random;

public class Person {
    String name;
    String address;
    int age;

// create one method named generateHour, this method will generate the number between 0 to 10.
// this number must be odd umber
    public int generateHour(String numberType) {
        Random random = new Random();
        int hours = random.nextInt(11);
            switch(numberType){
                case "odd":
                    while (hours % 2 == 0) {
                        hours = random.nextInt(11);
            }
              break;
                case "even":
                    while (hours%2!=0){
                        hours= random.nextInt(11);
                    }
                    break;
        }
        return hours;
    }
    public void study(){
        int hours= generateHour("odd");

        System.out.println(name + " is studying. the number of the hours is " +hours);

    }
    public void run(){
        int hours= generateHour("odd");
        System.out.println(name+ " is running . the number of running is " +hours);

    }

    public void sleep(){
            int hours= generateHour("even");

        System.out.println(name+"is sleeping . the number of sleep hours  is "+hours);
    }

    public String getName(){
        return name;

       //TASK: Create one method to print average sleep hours weekly.
        // this method will print average hours of sleep in one week
        //create one method to print average study hours in one month(30)

    }
//    public void averageSleep(){   WE DONT NEED THOSE TWO METHODS SINCE WE CRETAED AVERAGE METHOD BELOW!!!
//        int sum=0;
//        for (int i = 0; i <7; i++) {
//            int hours= generateHour("even");
//            sum+=hours;
//        }
//        int average=sum/7;
//        System.out.println("Average sleep hours in one week :" +average);
//    }
//    public void averageStudy(){
//        int sum= 0;
//        for (int i = 0; i <30 ; i++) {
//            int hours= generateHour("odd");
//            sum+=hours;
//        }
//        int average=sum/30;
//        System.out.println("Average study hours in one month is  : " +average);
//    }
    public void average(String numberType, int numberOfDay, String actionType){
        int sum=0;
        for (int i = 0; i <numberOfDay ; i++) {
            int hours= generateHour(numberType);
            sum+=hours;

        }
        int average= sum/numberOfDay;
        System.out.println("Average "+actionType+ "hours " + numberOfDay + " day is "+average);

    }

    public static void main(String[] args) {
        Person julia= new Person();
        julia.name="julia";
        System.out.println(julia.name);
        System.out.println(julia.getName());
        julia.study();
        julia.run();
//        julia.averageSleep();
//        julia.averageStudy();
        julia.average("odd",11,"study");
        julia.average("odd",17, " run ");
        julia.average("even", 20, "sleep");

    }
}
