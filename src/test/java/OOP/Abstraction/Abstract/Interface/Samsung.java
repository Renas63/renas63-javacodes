package OOP.Abstraction.Abstract.Interface;

public  class Samsung extends Phone {
    // Samsung class inherite the Phone, Memory
    // implement the method and create the pbject inside the
    //phone  shop class and call all available methods.

    public  void text(){
        System.out.println("Samsung is texting");
    }
     void takePhoto(){
         System.out.println("Samsung is taking photo");
    }

    @Override
    public void scroolDown() {
        System.out.println("Samsung is scrooling down");
    }

    @Override
    public void scroolUp() {
        System.out.println("Samsung is scrolling up");
    }

}
