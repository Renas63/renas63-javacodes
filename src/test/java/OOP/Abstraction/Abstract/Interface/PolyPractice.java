package OOP.Abstraction.Abstract.Interface;

public class PolyPractice {
    public static void main(String[] args) {

        Iphone iphone= new Iphone();
        iphone.play(); //--> play is coming from the Phone class. it is a static method
        iphone.scroolDown();
        iphone.takePhoto();

        Phone phone= new Iphone();
        phone.takePhoto();
        phone.text();



    }
}
