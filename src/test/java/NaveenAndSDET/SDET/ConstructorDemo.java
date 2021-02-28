package NaveenAndSDET.SDET;

public class ConstructorDemo {

    int x;
    int y;
    ConstructorDemo(){ // Default Constructor
        x=10;
        y=20;

    }

    ConstructorDemo(int a, int b){ // Parameterized Constructor
                x=10;
                y=20;
            }
            void display(){
                System.out.println(x+y);
    }
    public static void main(String[] args) {
        //ConstructorDemo cm=new ConstructorDemo();// invokes DEfault Constructor


        ConstructorDemo cm=new ConstructorDemo(100, 200);// cinvokes parameterized Constructor
        cm.display();
    }
}
