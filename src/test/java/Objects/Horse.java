package Objects;




public class Horse {
    // while we are creating the blueprint of the object
    // we dont need to use main method
    String name;
    int age;
    char gender;
    double weight;
    double height;
    String color;// these called instances variable in java

    public static void main(String[] args) {
        Horse horse1= new Horse();
        horse1.name="Mustang";
        horse1.age=3;
        horse1.gender='M';
        horse1.weight=2.2;
        horse1.height =4.9;
        horse1.color="brown";


        System.out.println(horse1.name);
        System.out.println(horse1.age);
        System.out.println(horse1.color);

        Horse horse2=new Horse();
        System.out.println(horse2.age); // 0 we haven't initialized yet
        horse2.color="black";
        System.out.println(horse2.color);
    }

}
