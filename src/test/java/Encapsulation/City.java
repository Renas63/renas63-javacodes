package Encapsulation;

public class City {
    private  String name;
    private long population;
   private String state;
   private String date;

// GETTER--> It doesnt tke any parameter
    // it wiill return the value frm instance vars
    // method naming convention for getters is starting with get
    // All getters and setters have a public access modifier.

    public String getName(){
        return name;
    }
    // this vs this() this refers to City Object.
    // this() we use this to call constructor inside another constructor
    // it should be in the first line inside anothe rconstructor



    public long getPopulation(){
        return population;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPopulation(long population){
        this.population= population;
    }
}
