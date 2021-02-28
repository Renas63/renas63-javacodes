package Constructor;

public class Office {
    /*
    Office class with two instance vars width and length
    create one contrustor to set the values for instance variables
    create one method will calculate area of the office

    create one class  called price with one instance variable which is price(double)
    1. create one constructor to initialize the instance variable
    2. create one method to get the price from Price.

    Create one Result class to find the payment for the office. Inside the Result class create
    two instance variable for Office and Price
    1. create one calculatePayment method to calculate the total payment for the office
     */
    double width;
    double length;
    double base;
    double height;

   public Office(double width, double length){
       this.length=length;
       this.width=width;
    }
   public double getArea(){
return width*length;
   }


}

