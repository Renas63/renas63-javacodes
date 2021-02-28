package Objects;

public class DividentPays {
    public static void MonthlyDivident(int year, double sharePrice,
                                       double dividentYield,
                                       int totalShare,
                                       int monthlyInvestment){
        double totalNumDivident=sharePrice*(dividentYield/1200);
        double portfolioValue=totalShare*totalShare;
        for (int i = 1; i <year*12 ; i++) {
            double divident=totalShare+totalNumDivident;
            divident+=monthlyInvestment;

        }
    }
}
