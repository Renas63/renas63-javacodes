package OOP.Polymorphism.Foods;

public abstract class Vegetables extends WholeFood  implements Food{

    public int getPrice(){
        return 2;
    }

    public String color(){
        return "Green";

    }
}
