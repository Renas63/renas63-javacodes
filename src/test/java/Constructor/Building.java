package Constructor;

public class Building {
    /*
    1- Create one Building class with name, address, floor instance variables
2- Create one argument constructor to initialize the name
3- Create three argument constructor to initialize the all variables
4- Create two different object using the constructors which you created.
5- Create printInfo() method to print all information of the object.
     */

    String name;
    String address;
    int floor;


    public  Building(String name){
    this.name=name;
    }
    public  Building( String name,String address, int floor){
    this.name=name;
    this.address= address;
    this.floor=floor;
    }
    public void printInfo(){
        System.out.println("Name "+name+ "Address" +address+ "Floor"+floor);
    }

    public String  toString(){   // this is interview question. how we create to string method java
        return"Name "+name+ "Address " +address+ "Floor " +floor;
    }

}

