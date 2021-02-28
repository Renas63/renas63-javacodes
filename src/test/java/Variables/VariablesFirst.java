package Variables;

public class VariablesFirst {

    public static void main(String [] args){
        // Java reads the code top to bottom and left to right
        int redApple=5;
        int yellowApple=3;
        int greenApple=7;

        int redApplePrice=3;
        int yellowApplePrice=2;
        int greenApplePrice=5;

        System.out.println(redApple*redApplePrice);
        System.out.println(yellowApple*yellowApplePrice);
        System.out.println(greenApple*greenApplePrice);
        int totalPrice=(redApple*redApplePrice)+(yellowApple*yellowApplePrice)+(greenApple*greenApplePrice);
        System.out.println("Total Price is "+totalPrice);


        System.out.println(redApple);
        System.out.println("YellowApple number"+yellowApple);
        System.out.println("GreenApple number"+greenApple);

        System.out.println(redApple+redApplePrice);
        System.out.println("redApple"+redApplePrice);

    }

}
