package Projects.ProjectGrocery;

import java.util.ArrayList;

public class GroceryList extends  GroceryBuddy{

    GroceryBuddy buddy = new GroceryBuddy();
    ArrayList<String> basket = new ArrayList<>();
    public String productsPurchased(String product) {
        boolean isAvailable = true;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(product)) {
                basket.add(product);
            } else {
                System.out.println("The product is  not available.");
                isAvailable = false;
            }
        }
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i].equalsIgnoreCase(product)) {
                basket.add(product);
            } else {
                System.out.println("The product is not available. ");
            }
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(product)) {
                basket.add(product);
            } else {
                System.out.println("The product is not available.");
            }
        }
        return product;
    }
    public Double totalPrice(String product) {
        double sum = 0.0;
        double discount = 0.0;
        for (int i = 0; i < basket.size(); i++) {
            sum += buddy.ItemPrices(product);
        }
        if (sum >= 50) {
            discount = sum * 0.9;
        } else if (sum >= 100) {
            discount = sum * 0.85;
        }
        return discount;
    }
    public void replaceItem(int position, String newItem){
        basket.set(position,newItem);
    }
    public void removeItem(String item){
        for (int i = 0; i < basket.size(); i++) {
            if(basket.get(i).equalsIgnoreCase(item)){
                basket.remove(basket.get(i));
            }
        }
    }
    public Integer findItem(String item) {
        for (int i = 0; i < basket.size(); i++) {
            if(basket.get(i).equalsIgnoreCase(item)){
                basket.indexOf(item);
            }
        }
        return basket.indexOf(item);
    }
}
//3- Create the GroceryList class extends the GroceryBuddy
//Create one ArrayList.
//Create one method to store the products which the user shopping.
// This method will store the product purchased by the user to the ArrayList which created.
// This method will print an error message if the product is not on the store.
//Create a method which returns the ArrayList of the purchased list.
// Create method returns the
// double total price of the purchased product. If the total price is more than 50 make a 10 percent discount.
// If the total price is more than
// 100 make 15 percent discount for total purchase and return the discounted value and print the total price.
//Create a method to modify the list. If the user wanna change the product which purchased use this method.
// The method takes two parameters int position and String newItem and modifies the ArrayList with the new item.
//Create a method to remove the item from the ArrayList. Takes one parameter as a String and removes the item from the list.
//Create one method to find the item on the List. Takes one parameter as a String and return the int position of the product on the list.
// Basically this method help user to check his/her list after shopping to make sure he/she take the product or not.
//Create one method to modify your list. This method takes two parameters as a String one for currentItem one for
// newItem and replaces the current item with a new item from the list.

    

