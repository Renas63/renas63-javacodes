package OOP.Abstraction.Abstract.Interface;

public class Iphone extends Phone {

    public void speak() {
        System.out.println("Iphone is speaking");
    }
        public void scroolDown(){
            System.out.println("Iphone is scrooling down");

    }
    public void scroolUp(){
        System.out.println("Iphone is scrooling up");
    }
    public void text(){
        System.out.println("Iphone is texting");
    }

    protected void takePhoto(){
        System.out.println("Iphone is taking a photo");
    }

}
