package baseline;

public class PaymentCalculator {
    double userBalance;
    double userAPR;
    double userPayment;

    public PaymentCalculator(double userBalance, double userAPR, double userPayment){
        this.userAPR = userAPR;
        this.userPayment = userPayment;
        this.userBalance = userBalance;
    }

    public int calculateMonthsUntilPaidOff(){

        double b = Math.ceil(userBalance * 100) / 100;
        double p = Math.ceil(userPayment * 100) / 100;
        double i = userAPR / 365;

        double monthCalc = (-1.0/30.0) * (Math.log(1.0 + ((b/p) * ( 1.0 - (Math.pow((1.0 + i), 30.0))))) / Math.log(1 + i));
        return (int)Math.ceil(monthCalc);
    }
}
