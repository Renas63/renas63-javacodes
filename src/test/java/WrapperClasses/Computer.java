package WrapperClasses;

public class Computer {
    /*
    // TASK:
Create one Computer class with instance variables of the name.
Create one constructor with one argument
Create equals method that checks the name of both object.
If the name is equals it will return true otherwise it will return false.
     */
    String name;
    public Computer(String name) {
        this.name = name;
    }
    public boolean equals(Computer c){
        return this.name.equals(c.name);
    }
    public String toString(){
        return "Name: "+name;
    }
    public static void main(String[] args) {
        Computer comp=new Computer("Macbook");
        Computer comp1=new Computer("Macbook");
        System.out.println(comp==comp1);
        System.out.println(comp.equals(comp1));
        System.out.println(comp.toString());
        System.out.println(comp1);
    }
}