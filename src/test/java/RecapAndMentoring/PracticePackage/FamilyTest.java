package RecapAndMentoring.PracticePackage;

public class FamilyTest {
    public static void main(String[] args) {

        Family fm= new Family();
        fm.firstName="Renas";
        fm.address="200 E Devon Ave";
        fm.rent(750);
        System.out.println(fm.income);
        System.out.println(fm.firstName);
        System.out.println(fm.address);

        Family fm1= new Family();
        fm1.firstName="Katie";
        fm1.address="200 E Devon Ave";
        fm1.rent(550);
        System.out.println(fm1.firstName);
        System.out.println(fm1.income);
        System.out.println(fm1.address);
    }
}
