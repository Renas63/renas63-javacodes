package OOP.Abstraction.Abstract.Interface;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone= new Iphone();
        iphone.scroolDown();
        iphone.takePhoto();
        iphone.play();
      //  System.out.println(iphone.CAPACITY); WE can not call that
        System.out.println(Memory.CAPACITY);//--> we can call that
       // iphone.record();// we can call that because record method is static
        iphone.equals(new Iphone());
        Samsung samsung= new Samsung();
        samsung.takePhoto();
        samsung.scroolDown();
        samsung.play();
    }
}
