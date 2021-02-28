package Objects;

public class IcloudTest {
    public static void main(String[] args) {
//2048
        Icloud ic=new Icloud();
        ic.userName="David";
        ic.familyName="Zlatan";    // we dont need that since we initilize the family name in object class
        ic.store(120);
        System.out.println(ic.storage);
        System.out.println(ic.familyName);

        Icloud ic1=new Icloud();
        ic1.userName="Alex";
        ic1.familyName= "Hunt";
        ic1.store(28);
        System.out.println(ic1.storage);
        System.out.println(ic1.familyName);


        Icloud ic2= new Icloud();

        System.out.println(ic2.familyName);
    }


}
