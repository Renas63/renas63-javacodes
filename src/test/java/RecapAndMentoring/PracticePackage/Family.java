package RecapAndMentoring.PracticePackage;

public class Family {
    String firstName;
    String address;
    int income=4000;


    public void rent(int rent){
        income-=rent;
        System.out.println("current income is  " + income);
    }
}
