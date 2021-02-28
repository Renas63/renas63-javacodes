package Projects.ProjectGrocery;

public class GroceryBuddy {
    //2 - Create one class named GroceryBuddy inherits the CheckOut class.
    //Store following fruits to the array: Apple, Orange, Watermelon, Banana, Pineapple, Grape, Mango, Strawberry, Peach, Cherry.
    //Store following Vegetables to the array: Carrots, Broccoli, Onion, Potato, Tomato, Cucumber, Corn, Bean, Spinach, Pepper.
    //Store following products to the other array: Milk, Bread, Beef, Eggs, Chicken, Sugar , Salt , Coffee, Rice, Pasta.
    //Create three more arrays to store the prices for these products and you can give any price for the products.
    // Prices will be double value.
    //For example
    //2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79;
    //Create the method to print the Fruits.
    //Create the method to print the Vegetables.
    //Create the method to print the Other products.
    //Create the method to get the item prices. This method will take the parameter as the name of the product and returns
    // the price of product which you store to the array.
    String [] fruits={"Apple", "Orange", "Watermelon", "Banana", "Pineapple", "Grape", "Mango", "Strawberry", "Peach", "Cherry"};
    String [] vegetables={"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber", "Corn", "Bean", "Spinach", "Pepper"};
    String [] products={"Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar" , "Salt" , "Coffee", "Rice", "Pasta"};
    Double [] priceOfFruits={2.99, 8.75, 10.00, 0.49, 4.45, 5.99, 2.45, 5.00, 7.50, 9.95};
    Double [] priceOfVegetables={0.95, 2.99, 1.45, 0.99, 10.95, 4.75, 1.99, 4.50, 5.45};
    Double [] priceOfProducts={7.99, 4.45, 5.99, 5.45, 5.99, 4.00, 1.99, 10.99, 5.99, 2.99};
    public void fruits(){
        for(String f: fruits){
            System.out.println(f);
        }
    }
    public void vegetables(){
        for(String v: vegetables){
            System.out.println(v);
        }
    }
    public void products(){
        for(String p: products){
            System.out.println(p);
        }
    }
    public Double ItemPrices(String productName) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(productName)) {
                System.out.println(priceOfFruits[i]);
                return priceOfFruits[i];
            }
        }
        for (int i = 0; i < vegetables.length; i++) {
            if(vegetables[i].equalsIgnoreCase(productName)){
                System.out.println(priceOfVegetables[i]);
                return priceOfVegetables[i];
            }
        }
        for (int i = 0; i < products.length; i++) {
            if(products[i].equalsIgnoreCase(productName)){
                System.out.println(priceOfProducts[i]);
                return priceOfProducts[i];
            }
        }
        return null;
    }
}


