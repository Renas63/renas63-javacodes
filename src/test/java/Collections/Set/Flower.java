package Collections.Set;

public class Flower {
    String name;
    String color;
    /*
    reate one flower class with following instannce variables name and color
Create one construcgtor to initialize your instance variables
Create getters and setters
Create one toString method to print variable information
FLOWERTEST
Create one flowerTest class
Create 5 flower object
Create one HashSet collection to store 5 flower object.
Print all name and color of the flowers from hashSet.
     */

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public  String  toString(){
      return "Name:" +name + " ,"+" Color:" +color;

    }

}
