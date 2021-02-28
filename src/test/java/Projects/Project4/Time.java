package Projects.Project4;

public class Time {
    /*
    Create a class with the name Time. The class needs to have 5 fields (instance variables)
    with the names hour, minute, second, month, and year.
Write the following constructor:
1- Create the three-argument constructor to set the values for hour, minutes, and second
2- Create a two-argument constructor to set the values for month and year
3- Create five argument constructor to set the values for hour, minutes, second, month, and year.
     */

    int hours, minutes, seconds, month, year;


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public Time(int month, int year) {

        this.month = month;
        this.year = year;
    }

    public Time(int hours, int minutes, int seconds, int month, int year) {
        this.year = year;
        this.minutes = minutes;
        this.seconds = seconds;
        this.month = month;
        this.year = year;
    }

    public Time() {

    }

    public void setHours(int newHours) {
        hours=newHours;
        if (hours <0 || hours > 23) {
            this.hours = 0;
        }else{
            this.hours= hours;
        }
    }

    public void setMinutes(int newMinutes) {
        minutes=newMinutes;
        if (minutes < 0 || minutes > 60) {
            this.minutes = 0;
        }else{
            this.minutes= minutes;
        }
    }

    public void setSeconds(int newSeconds) {
        seconds=newSeconds;
        if (seconds < 0 || seconds >60) {
            this.seconds = 0;
        }else{
            this.seconds=seconds;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getMinutes() {
        return this.minutes;// we dont need to say this.
    }

    public int getSeconds() {
        return seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setMonth(int month) {

        if (month<0 || month>12){
            this.month=0;
        }else{
            this.month=month;
        }

    }
    public void setYear(int year) {
        if(month<=0){
            this.year=0;
        }else{
            this.year= year;

        }
    }
    public int hourValue(int hours) {
        if (hours < 12) {
            System.out.println(hours+ " am ");
        }else {
            System.out.println(hours + " pm ");
        }
        return hours;
    }
    public void seasonName(int month){
        if(month==12 && month<=2){
            System.out.println("December, January and February is : Winter");

        }else if (month>2&& month<=5){
            System.out.println("March, April and May is : Spring ");
        }else if(month>5 && month<=8){
            System.out.println("June , July and August is : Summer");
        }else if (month>8 && month<12){
            System.out.println("September, October and November is : Autumn");
        }

    } public void printTime(){
        System.out.println(getHours()+"/"+getMinutes()+"/"+getSeconds());// we said gethours() bc we have to call the method!
    }
    public void printDate(){
        System.out.println(month+"/" +year);
    }
    public String toString(){
        return hours+"/"+minutes+"/"+seconds+"-" +month+ "/" +year;
    }
    public void getInstruction(){
        System.out.println("Press 1 to create a time ");
        System.out.println("Press 2 to create a date ");
        System.out.println("Press 3 to create date and a time ");
        System.out.println("Press 4 to update a time ");
        System.out.println("Press 5 to update a date ");
        System.out.println("Press 6 to print a time information ");
        System.out.println("Press 7 to print  a date information ");
        System.out.println("Press 8 to print  a date and  time information ");
        System.out.println("Press 9 to exit ");

    }
}
