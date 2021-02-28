package NaveenAndSDET;

public class ConstructorConcept {
    // class variables---> Instance variables
    // CONSTRUCTOR  NAME HAS TO BE SAME  WITH CLASS NAME!!!!!
    String name;
    int age;
    //we can overload constructor!!!
    public ConstructorConcept(){ // 0 parameter
        System.out.println("Default constructor");
    }
    public ConstructorConcept(int i){ // 1 parameter
        System.out.println(" 1 param Const");
        System.out.println(i);
    }
    public ConstructorConcept(int i, int j){
        System.out.println("2 params Const");
        System.out.println(i + " " + j);
    }

    public ConstructorConcept(String name, int age){ // name and age are local vars in here.
        this.name=name; // this.classvar=local var   // they are not the same  with instance vars name and age
        this.age=age;
        // if local  vars name are different than instance vars, we can say
        // name= name1 and  age = age1
    }

    public static void main(String[] args) {

        ConstructorConcept obj= new ConstructorConcept();
        ConstructorConcept obj1= new ConstructorConcept(10);
        ConstructorConcept obj2= new ConstructorConcept(10, 20);
        ConstructorConcept obj3= new ConstructorConcept("Tom", 25);
        ConstructorConcept obj4= new ConstructorConcept("Renas", 35);


        System.out.println(obj3.age);
        System.out.println(obj3.name);

        System.out.println(obj4.name);
        System.out.println(obj4.age);

    }
}
