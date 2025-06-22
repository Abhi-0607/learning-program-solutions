//I looked up on google to check if there is any particular financial formula they follow,
//so that I can code accordingly.

//and the formula is:  FutureValue(FV) = PresentValue(PV) * (1+r)^n
//where r is the interest/growth rate and n is the number of periods, PV is initial amount

//Also, the Compound Annual Growth Rate (CAGR) is:
//CAGR = (Ending Value / Beginning Value) - 1

public class FuturePredict {

    public static double futurevalue(double PV, double GR, int n, int r) {
        return PV * Math.pow(1 + GR, n * r);
    }

    public static double cagr(double endingValue, double beginningValue, int n) {
        return Math.pow(endingValue / beginningValue, 1.0 / n) - 1;
    }

    public static void main(String[] args) {
        double PV = 1000;
        double GR = 0.05;
        int n = 10; //number of years
        int r = 1;

        double FV = futurevalue(PV, GR, n, r);
        System.out.printf("Future value of %.2f after %d years at a growth rate of %.2f is %.2f%n", PV, n, GR, FV);
    }

}