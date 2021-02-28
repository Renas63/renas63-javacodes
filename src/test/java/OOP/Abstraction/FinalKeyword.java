package OOP.Abstraction;

import OOP.Books.Book;

public final  class FinalKeyword extends Book {
     final String city="Chicago";
     // we can not re initialize the final keyword variables


    public FinalKeyword(String name, int page, double price) {
        super(name, page, price);
    }
    /*
    public final void printCity(){
        System.out.println(city);
        // Note: printCity is final method inside the book class
        // thats why we can not override the printCity
       */

   // }

}
