package Objects;

public class Cat {

    String name;
    int age;
    int mealAmount;
    String color;
    // these are instance variables

    public void run(String destination){
        mealAmount-=1;
        System.out.println(" The cat is running to the  "+destination);

    }
    // create a method and it will set the new color for my  cat
    public void setColor(String newColor){
        color=newColor;
    }
    public String getColor(){
        return color;
    }
    // create getters and setter for  name and age
    public void setName(String newName){
        name= newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        age=newAge;
    }

    public int getAge(){
        return age;
    }

}

