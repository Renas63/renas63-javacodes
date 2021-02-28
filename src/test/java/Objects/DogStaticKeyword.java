package Objects;

public class DogStaticKeyword {
    String name;
    int age;
   static int meal=20;// WE USE STATIC KEYWORD FOR SOMETHING THAT FOR SHARING SUCH AS INTERNET QUOTA,
    String color;


    public void eat(){

        meal= meal-1;
        System.out.println(name+ " is eating . leftover is kg "+meal);

    }
    public static void barking(){

        System.out.println(" Dog is barking");

    }

}
