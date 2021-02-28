package OOP.Books;

public class OCA extends Book {
    // ONCE We cretae the instance variables with the same name and same data type
    // with Parent class, child class can not see the variables from the parent class
    // unless we are using the super keyword.

    String name; // To hide the parent ins variable--> data hiding


    public OCA() {
        super("BOOK", 380, 20.90);
        this.name = "OCA";
    }

    public static int getPage() {
        return 380;
    }

    public void getOCABookDetails() {
        System.out.println("OCA Book has " + getPage() + " pages");
    }
    public void getBookDetails(){
        System.out.println("book is "+super.name);
        System.out.println("page number is  "+super.page);
        System.out.println("price of the book is " +super.price);
        System.out.println("getPage() method from super class " +Book.getPage());
        getDetails();

    }

    public static void main(String[] args) {
        OCA oca = new OCA();
        System.out.println(oca.name);
        System.out.println(oca.page);
        System.out.println(oca.price);
        oca.getDetails();
        oca.getOCABookDetails();

        oca.getBookDetails();
    }
}
