package NaveenAndSDET;

public class MethodOverLoading {
    public static void main(String[] args) {
    // if we want to call these methods, we have to create an object!
        MethodOverLoading obj= new MethodOverLoading();
        obj.sum();
        obj.sum(10);
        obj.sum(10, 5);

        // Method overloading is: when the method name is the same
        // with different arguments or input parameter with the same class

        // NOTE: We can not create a method inside a method.
    }

    public static void main(int p) { // We can overload the main method

    }

    public void sum(){// 0 input parameter
        System.out.println("SUM method-- zero parameter");
        // We can not create duplicate method(same name and same number of arguments

    }
    public void sum(int i) { // 1 input parameter
        System.out.println("SUM method 1 input parameter");
        System.out.println(i);
        // if te method names are the same, we have to give a different parameter,with different data types
        // not the same amount of the parameters
    }
        public void sum(int k, int l){ // 2 input parameters
            System.out.println("sum method -- 2 input parameters");
            System.out.println(k+l);


    }
}
