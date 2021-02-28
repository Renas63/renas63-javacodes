package Constructor;

public class Phone {
    String name;

    public Phone(String name){
        this.name=name;
    }

    //FINALIZE IS A METHOD FOR java collection
    protected void finalize()  {
        System.out.println("This is a finalize method");
        System.out.println("Finalize method will be called when we have an object is garbage collected");
    }
    public String toString(){
        return "Phone name is "+name;
    }

    public static void main(String[] args) {

        Phone one= new Phone("Samsung");
        Phone two= new Phone("Iphone");
        Phone three= one;
        one=two;
        System.out.println(one);

        System.out.println(one.equals(two));// true
        System.out.println(two.equals(three)); // false
        System.out.println(one==two);   // true
        System.out.println(two== three); // false
        three= null;
        two= null;
        one= null;
        System.gc();
    }
}
