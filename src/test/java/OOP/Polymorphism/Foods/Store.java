package OOP.Polymorphism.Foods;

public class Store {

    public static void main(String[] args) {

       Food food= new Carrot();
        System.out.println(food.getDetails());
        System.out.println(food.getPrice());
       // food.color();--> parent "food " can not get color from child
        System.out.println (((Vegetables)food).color());


        //Vegetables vegetables= new Food();
        // NEW FOOD CAN NOT BE INSTANTIATED BC ITS INTERFACE


        //Vegetables vegetables= (Vegetables) new WholeFood();//--> cLASScASTeXCEPTION
        // vegetables.getName();
        //IS A RELATIONSHIP
        // SINCE the food is a Carrot once we initilize the food
        // we can cast explicitly food to Vegetables.
        // Because food is pointing to the Carrot. it is also doown casting.

        //FOOD IS A CARROT
        System.out.println(food instanceof Carrot);
        System.out.println(food instanceof Vegetables);
        System.out.println(food instanceof Food);
        System.out.println(food instanceof WholeFood);

        Vegetables vegetables= (Carrot) food;
        vegetables.getName();

        //WholeFood IS A relationship
        WholeFood wholeFood= new WholeFood();

        System.out.println(wholeFood instanceof Carrot);
        System.out.println(wholeFood instanceof Food);
        System.out.println(wholeFood instanceof WholeFood);

        Vegetables vegetables1= new Carrot();
        System.out.println(vegetables1.getDetails());
        ((Carrot)vegetables1).test();

    }
}
